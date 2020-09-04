package ar.com.bancogalicia.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ar.com.bancogalicia.dao.TransitionMigrationDao;
import ar.com.bancogalicia.helpers.CV;
import ar.com.bancogalicia.model.PersonType;
import ar.com.bancogalicia.model.TransitionMigration;

@Repository
public class TransitionMigrationDaoImpl implements TransitionMigrationDao {

	@Autowired
	private SessionFactory sessionFactory;

	protected Session getSession() {
		return this.sessionFactory.getCurrentSession();
	}

	@Override
	@Transactional(readOnly = true)
	public Long getIdPomByIdHost(Long idHost) {
		TransitionMigration transitionMigration = (TransitionMigration) getSession()
				.createQuery(CV.SQL.Query.SELECT_POM_TRANSITION_MIGRATION_BY_ID_HOST)
				.setParameter(CV.SQL.ID_HOST, idHost)
				.uniqueResult();
		return getIdPom(transitionMigration);
	}

	@Override
	@Transactional(readOnly = false)
	public void save(TransitionMigration transitionMigration) {
		getSession().save(transitionMigration);
	}
	
	@Override
	@Transactional(readOnly = true)
	public PersonType getPersonTypeByIdPom(Long idPom) {
		TransitionMigration transitionMigration = (TransitionMigration) getSession()
				.createQuery(CV.SQL.Query.SELECT_POM_TRANSITION_MIGRATION_BY_ID_POM)
				.setParameter(CV.SQL.ID_POM, idPom)
				.uniqueResult();
		return getPersonType(transitionMigration);
	}

	private Long getIdPom(TransitionMigration transitionMigration) {
		if (transitionMigration == null 
				|| transitionMigration.getIdPom() == null) {
			return null;
		} else {
			return transitionMigration.getIdPom();
		}
	}

	private PersonType getPersonType(TransitionMigration transitionMigration) {
		if (transitionMigration == null 
				|| transitionMigration.getPersonType() == null) {
			return null;
		} else {
			return transitionMigration.getPersonType();
		}
	}
}
