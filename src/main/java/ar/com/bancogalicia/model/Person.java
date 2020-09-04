package ar.com.bancogalicia.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import ar.com.bancogalicia.helpers.CV;
import ar.com.bancogalicia.model.converter.PersonTypeConverter;

/**
 * Used in search idPom from v3 charged.
 * 
 * @author L0693413
 *
 */
@Table(name = CV.SQL.POM_PERSON)
@Entity
public class Person implements Serializable {

	private static final long serialVersionUID = 5542075783111611344L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_POM_PERSON")
	@SequenceGenerator(name = "SEQ_POM_PERSON", sequenceName = "SEQ_POM_PERSON", initialValue = 1, allocationSize = 1)
	@JsonProperty("id_pom_person")
	@Column(name = "id_pom_person", unique = true, nullable = false)
	private Long idPom;

	@JsonProperty("id_host")
	@Column(name = "id_host", length = 20)
	private String idHost;

	@JsonProperty("person_type")
	@Convert(converter = PersonTypeConverter.class)
	@Column(name = "person_type", columnDefinition = "char", length = 1)
	private PersonType personType;

	@JsonProperty("migrated")
	@Column(name = "migrated", nullable = false, columnDefinition = "number")
	private int migrated;

	public Person() {
		super();
	}

	public Person(String idHost, PersonType personType) {
		this.idHost = idHost;
		this.personType = personType;
		this.migrated = 0;
	}

	public Long getIdPom() {
		return idPom;
	}

	public void setIdPom(Long idPom) {
		this.idPom = idPom;
	}

	public String getIdHost() {
		return idHost;
	}

	public void setIdHost(String idHost) {
		this.idHost = idHost;
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
