package ar.com.bancogalicia.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import ar.com.bancogalicia.helpers.CV;

/**
 * Representation of the generate empty employee.
 * 
 * @author L0693413
 *
 */
@Table(name = CV.SQL.POM_EMPLOYEE)
@Entity
public class Employee implements Serializable {

	private static final long serialVersionUID = 8998779763892786670L;

	@Id
	@JsonProperty("id_pom_person")
	@Column(name = "id_pom_person", unique = true, nullable = false)
	private Long idPom;

	public Employee() {
		super();
	}

	public Employee(Long idPom) {
		this.idPom = idPom;
	}

	public Long getIdPom() {
		return idPom;
	}

	public void setIdPom(Long idPom) {
		this.idPom = idPom;
	}
}
