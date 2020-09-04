package ar.com.bancogalicia.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import ar.com.bancogalicia.helpers.CV;

/**
 * Representation of the generate empty physical person.
 * 
 * @author L0693413
 *
 */
@Table(name = CV.SQL.POM_PHYSICAL_PERSON)
@Entity
public class PhysicalPerson implements Serializable {

	private static final long serialVersionUID = -1664679294341724090L;

	@Id
	@JsonProperty("id_pom_person")
	@Column(name = "id_pom_person", unique = true, nullable = false)
	private Long idPom;

	public PhysicalPerson() {
		super();
	}

	public PhysicalPerson(Long idPom) {
		this.idPom = idPom;
	}

	public Long getIdPom() {
		return idPom;
	}

	public void setIdPom(Long idPom) {
		this.idPom = idPom;
	}
}
