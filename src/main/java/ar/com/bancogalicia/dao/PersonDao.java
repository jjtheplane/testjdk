package ar.com.bancogalicia.dao;

import ar.com.bancogalicia.model.Employee;
import ar.com.bancogalicia.model.LegalPerson;
import ar.com.bancogalicia.model.Person;
import ar.com.bancogalicia.model.PersonType;
import ar.com.bancogalicia.model.PhysicalPerson;

/**
 * DAO for {@link Person}
 * @author L0693413
 *
 */
public interface PersonDao {

	Long getIdPomByIdHost(String idHost);

	Long save(Person person);

	PersonType getPersonTypeByIdPom(Long idPom);
	
	void savePhysicalPerson(PhysicalPerson physicalPerson);

	void saveEmployee(Employee employee);

	void saveLegalPerson(LegalPerson legalPerson);

}
