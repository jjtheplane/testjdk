package ar.com.bancogalicia.helpers;

/**
 * Constants Values.
 * 
 * @author L0693413
 *
 */
public class CV {
	private CV() {
	}

	public static class SQL {
		private SQL() {
		}

		public static final String POM_TRANSITION_MIGRATION = "POM_TRANSITION_MIGRATION";
		public static final String POM_PERSON = "POM_PERSON";
		
		public static final String POM_PHYSICAL_PERSON = "POM_PHYSICAL_PERSON";
		public static final String POM_EMPLOYEE = "POM_EMPLOYEE";
		public static final String POM_LEGAL_PERSON = "POM_LEGAL_PERSON";
		
		public static final String ID_HOST = "id_host";
		public static final String ID_POM = "id_pom";

		public static class Query {
			private Query() {
			}

			public static final String SELECT_POM_TRANSITION_MIGRATION_BY_ID_HOST = "FROM TransitionMigration WHERE idHost = :id_host";
			public static final String SELECT_POM_TRANSITION_MIGRATION_BY_ID_POM = "FROM TransitionMigration WHERE idPom = :id_pom";
			
			public static final String SELECT_POM_PERSON_BY_ID_HOST = "FROM Person WHERE idHost = :id_host";
			public static final String SELECT_POM_PERSON_BY_ID_POM = "FROM Person WHERE idPom = :id_pom";
		}

		public static class Error {
			private Error() {
			}

			public static final String CONSTRAINT_VIOLATION_EXCEPTION = "Error al insertar en {}: {}";
			public static final String GENERAL_EXCEPTION = "Surgio un error al realizar la generacion del idPom: {}";
		}
	}
}
