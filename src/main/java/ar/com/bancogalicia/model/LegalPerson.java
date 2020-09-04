package ar.com.bancogalicia.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import ar.com.bancogalicia.helpers.CV;

/**
 * Representation of the generate empty legal person.
 * 
 * @author L0693413
 *
 */
@Table(name = CV.SQL.POM_LEGAL_PERSON)
@Entity
public class LegalPerson implements Serializable {

	private static final long serialVersionUID = -76176672667953812L;

	@Id
	@JsonProperty("id_pom_person")
	@Column(name = "id_pom_person", unique = true, nullable = false)
	private Long idPom;

	public LegalPerson() {
		super();
	}

	public LegalPerson(Long idPom) {
		this.idPom = idPom;
	}

	public Long getIdPom() {
		return idPom;
	}

	public void setIdPom(Long idPom) {
		this.idPom = idPom;
	}
}
