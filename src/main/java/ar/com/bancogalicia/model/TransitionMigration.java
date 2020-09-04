package ar.com.bancogalicia.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import ar.com.bancogalicia.helpers.CV;
import ar.com.bancogalicia.model.converter.PersonTypeConverter;

/**
 * Representation of the generate id pom and transition migration with new version from people legacy.
 * 
 * @author L0693413
 *
 */
@Table(name = CV.SQL.POM_TRANSITION_MIGRATION)
@Entity
public class TransitionMigration implements Serializable {

	private static final long serialVersionUID = 7119932899369850229L;

	@Id
	@JsonProperty("id_pom")
	@Column(name = "id_pom", unique = true, nullable = false)
	private Long idPom;

	@JsonProperty("id_host")
	@Column(name = "id_host", nullable = false)
	private Long idHost;

	@JsonProperty("document_number")
	@Column(name = "document_number")
	private Long documentNumber;

	@JsonProperty("cuil")
	@Column(name = "cuil")
	private Long cuil;

	@JsonProperty("cuit")
	@Column(name = "cuit")
	private Long cuit;

	@JsonProperty("person_type")
	@Convert(converter = PersonTypeConverter.class)
	@Column(name = "person_type", columnDefinition = "char", length = 1)
	private PersonType personType;

	@JsonProperty("migrated")
	@Column(name = "migrated", nullable = false, columnDefinition = "number")
	private int migrated;

	public TransitionMigration() {
		super();
	}

	public TransitionMigration(Long idPom, Long idHost, Long documentNumber, Long cuil, Long cuit, PersonType personType) {
		this.idPom = idPom;
		this.idHost = idHost;
		this.documentNumber = documentNumber;
		this.cuil = cuil;
		this.cuit = cuit;
		this.personType = personType;
		this.migrated = 1;
	}

	public Long getIdPom() {
		return idPom;
	}

	public void setIdPom(Long idPom) {
		this.idPom = idPom;
	}

	public Long getIdHost() {
		return idHost;
	}

	public void setIdHost(Long idHost) {
		this.idHost = idHost;
	}

	public Long getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(Long documentNumber) {
		this.documentNumber = documentNumber;
	}

	public Long getCuil() {
		return cuil;
	}

	public void setCuil(Long cuil) {
		this.cuil = cuil;
	}

	public Long getCuit() {
		return cuit;
	}

	public void setCuit(Long cuit) {
		this.cuit = cuit;
	}

	public PersonType getPersonType() {
		return personType;
	}

	public void setPersonType(PersonType personType) {
		this.personType = personType;
	}

	public int getMigrated() {
		return migrated;
	}

	public void setMigrated(int migrated) {
		this.migrated = migrated;
	}

}
