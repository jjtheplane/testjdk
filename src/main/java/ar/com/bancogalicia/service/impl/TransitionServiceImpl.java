package ar.com.bancogalicia.service.impl;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.exception.ConstraintViolationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.bancogalicia.dao.PersonDao;
import ar.com.bancogalicia.dao.TransitionMigrationDao;
import ar.com.bancogalicia.exception.GenerateIdPomException;
import ar.com.bancogalicia.helpers.CV;
import ar.com.bancogalicia.model.Employee;
import ar.com.bancogalicia.model.LegalPerson;
import ar.com.bancogalicia.model.Person;
import ar.com.bancogalicia.model.PersonType;
import ar.com.bancogalicia.model.PhysicalPerson;
import ar.com.bancogalicia.model.TransitionMigration;
import ar.com.bancogalicia.service.TransitionService;
import ar.com.bancogalicia.ws.webservices.abmcinfoclientes.personafisica._3_0_0.PersonaFisica;
import ar.com.bancogalicia.ws.webservices.abmcinfoclientes.personajuridica._3_0_0.PersonaJuridica;

@Service
public class TransitionServiceImpl implements TransitionService {

	private static final Logger LOGGER = LoggerFactory.getLogger(TransitionServiceImpl.class);

	@Autowired
	private TransitionMigrationDao transitionMigrationDao;

	@Autowired
	private PersonDao personDao;

	@Override
	public Long getIdPomByPersonaFisica(PersonaFisica personaFisica, String idPersona) throws GenerateIdPomException {
		Long idPom = null;
		Long idHost = Long.parseLong(idPersona);
		try {
			idPom = transitionMigrationDao.getIdPomByIdHost(idHost);
			
			// If not exist in TransitionMigration, search in Person for v3
			if (idPom == null) {
				idPom = personDao.getIdPomByIdHost(idHost.toString());
				// If not exist in v3, persist and get idPom generated
				if (idPom == null) {
					idPom = savePerson(idHost.toString(), personaFisica.getBasicos().getCodigoEmpleadoBGBA());
				}
				transitionMigrationDao.save(buildTransitionMigration(idPom, idHost,
						Long.parseLong(personaFisica.getBasicos().getDocumentos().getDocumento().get(0).getNumero()),
						personaFisica.getBasicos().getIdentificacionTributariaNumero(), PersonType.F));
			}
			return idPom;
		} catch (Exception e) {
			return getIdPomByException(idHost, e.getMessage());
		}
	}

	@Override
	public Long getIdPomByPersonaJuridica(PersonaJuridica personaJuridica, String idPersona) throws GenerateIdPomException {
		Long idPom = null;
		Long idHost = Long.parseLong(idPersona);
		try {
			idPom = transitionMigrationDao.getIdPomByIdHost(idHost);
			
			// If not exist in TransitionMigration, search in Person for v3
			if (idPom == null) {
				idPom = personDao.getIdPomByIdHost(idHost.toString());
				// If not exist in v3, persist and get idPom generated
				if (idPom == null) {
					idPom = savePerson(idHost.toString(), null);
				}
				transitionMigrationDao.save(buildTransitionMigration(idPom, idHost, null,
						personaJuridica.getBasicos().getIdentificacionTributariaNumero(), PersonType.J));
			}
			return idPom;
		} catch (Exception e) {
			return getIdPomByException(idHost, e.getMessage());
		}
	}

	@Override
	public PersonType getPersonTypeByIdPom(String idPom) {
		PersonType personType = null;
		// TODO: When deprecate old idPom delete the section code into the if block
		if (idPom.contains("J")) {
			personType = PersonType.J;
		} else {
			try {
				Long idPomNumber = Long.parseLong(idPom);
				personType = transitionMigrationDao.getPersonTypeByIdPom(idPomNumber);
				
				if (personType == null) {
					personType = personDao.getPersonTypeByIdPom(idPomNumber);
				}
			} catch (NumberFormatException e) {
				personType = PersonType.F;
			}
		}
		return personType;
	}

	@Override
	public Long getIdPomByIdHost(String idHost, String employeeBgbaCode) {
		Long idHostNumber = Long.parseLong(idHost);
		Long idPom = transitionMigrationDao.getIdPomByIdHost(idHostNumber);
		if (idPom == null) {
			// If not exist in TransitionMigration, search in Person for v3
			idPom = personDao.getIdPomByIdHost(idHost);
			// If not exist in Person v3, create in v3 and obtain idPom
			if (idPom == null) {
				idPom = savePerson(idHost, employeeBgbaCode);
			}
		}
		return idPom;
	}

	private TransitionMigration buildTransitionMigration(Long idPom, Long idHost, Long documentNumber,
			String taxIdentificationNumber, PersonType personType) {
		Long cuil = null;
		Long cuit = null;
		if (StringUtils.isNotBlank(taxIdentificationNumber)) {
			if (personType.equals(PersonType.F) && (taxIdentificationNumber.startsWith("20") 
					|| taxIdentificationNumber.startsWith("23") 
					|| taxIdentificationNumber.startsWith("24") 
					|| taxIdentificationNumber.startsWith("27"))) {
				cuil = Long.parseLong(taxIdentificationNumber);
			} else {
				cuit = Long.parseLong(taxIdentificationNumber);
			}
		}
		return new TransitionMigration(idPom, idHost, documentNumber, cuil, cuit, personType);
	}

	private Long savePerson(String idHost, String employeeBGBACode) {
		PersonType personType = PersonType.getPersonTypeByIdHost(idHost);
		Long idPom = personDao.save(new Person(idHost, personType));
		if (PersonType.F.equals(personType)) {
			personDao.savePhysicalPerson(new PhysicalPerson(idPom));
			if (StringUtils.isNotBlank(employeeBGBACode) && employeeBGBACode.equals("EM")) {
				personDao.saveEmployee(new Employee(idPom));
			}
		} else {
			personDao.saveLegalPerson(new LegalPerson(idPom));
		}
		return idPom;
	}

	private Long getIdPomByException(Long idHost, String exceptionMessage) throws GenerateIdPomException {
		try {
			if (exceptionMessage.contains(CV.SQL.POM_TRANSITION_MIGRATION)) {
				LOGGER.error(CV.SQL.Error.CONSTRAINT_VIOLATION_EXCEPTION, CV.SQL.POM_TRANSITION_MIGRATION, exceptionMessage);
				return transitionMigrationDao.getIdPomByIdHost(idHost);
			} else if (exceptionMessage.contains(CV.SQL.POM_PERSON)) {
				LOGGER.error(CV.SQL.Error.CONSTRAINT_VIOLATION_EXCEPTION, CV.SQL.POM_PERSON, exceptionMessage);
				return personDao.getIdPomByIdHost(idHost.toString());
			}
			LOGGER.error(CV.SQL.Error.CONSTRAINT_VIOLATION_EXCEPTION, exceptionMessage);
			throw new GenerateIdPomException(exceptionMessage);
		} catch (Exception e) {
			LOGGER.error(CV.SQL.Error.GENERAL_EXCEPTION, exceptionMessage);
			throw new GenerateIdPomException(exceptionMessage);
		}
	}
}
