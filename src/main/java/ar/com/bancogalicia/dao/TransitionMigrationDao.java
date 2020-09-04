package ar.com.bancogalicia.dao;

import ar.com.bancogalicia.model.PersonType;
import ar.com.bancogalicia.model.TransitionMigration;

/**
 * DAO for {@link TransitionMigration}
 * 
 * @author L0693413
 *
 */
public interface TransitionMigrationDao {

	Long getIdPomByIdHost(Long idHost);

	void save(TransitionMigration transitionMigration);

	PersonType getPersonTypeByIdPom(Long idPom);
}
