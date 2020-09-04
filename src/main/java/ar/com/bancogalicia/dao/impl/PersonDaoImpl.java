package ar.com.bancogalicia.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ar.com.bancogalicia.dao.PersonDao;
import ar.com.bancogalicia.helpers.CV;
import ar.com.bancogalicia.model.Employee;
import ar.com.bancogalicia.model.LegalPerson;
import ar.com.bancogalicia.model.Person;
import ar.com.bancogalicia.model.PersonType;
import ar.com.bancogalicia.model.PhysicalPerson;

@Repository
public class PersonDaoImpl implements PersonDao {

	@Autowired
	private SessionFactory sessionFactory;

	protected Session getSession() {
		return this.sessionFactory.getCurrentSession();
	}

	@Override
	@Transactional(readOnly = true)
	public Long getIdPomByIdHost(String idHost) {
		Person person = (Person) getSession()
				.createQuery(CV.SQL.Query.SELECT_POM_PERSON_BY_ID_HOST)
				.setParameter(CV.SQL.ID_HOST, idHost)
				.uniqueResult();
		return getIdPom(person);
	}

	@Override
	@Transactional(readOnly = false)
	public Long save(Person person) {
		return (Long) getSession().save(person);
	}

	@Override
	@Transactional(readOnly = false)
	public void savePhysicalPerson(PhysicalPerson physicalPerson) {
		getSession().save(physicalPerson);
	}

	@Override
	@Transactional(readOnly = false)
	public void saveEmployee(Employee employee) {
		getSession().save(employee);
	}

	@Override
	@Transactional(readOnly = false)
	public void saveLegalPerson(LegalPerson legalPerson) {
		getSession().save(legalPerson);
	}

	@Override
	@Transactional(readOnly = true)
	public PersonType getPersonTypeByIdPom(Long idPom) {
		Person person = (Person) getSession()
				.createQuery(CV.SQL.Query.SELECT_POM_PERSON_BY_ID_POM)
				.setParameter(CV.SQL.ID_POM, idPom)
				.uniqueResult();
		return getPersonType(person);
	}

	private Long getIdPom(Person person) {
		if (person != null && person.getIdPom() != null) {
			return person.getIdPom();
		} else {
			return null;
		}
	}

	private PersonType getPersonType(Person person) {
		if (person != null && person.getPersonType() != null) {
			return person.getPersonType();
		} else {
			return null;
		}
	}
}
