package com.idat.idataula.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class AlumnoAulaFK implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4417214286334278899L;

	@Column(name="id_aula", nullable = false, unique = true)
	private Integer idAula;
	
	@Column(name="id_alumno", nullable = false, unique = true)
	private Integer idAlumno;

	public Integer getIdAula() {
		return idAula;
	}

	public void setIdAula(Integer idAula) {
		this.idAula = idAula;
	}

	public Integer getIdAlumno() {
		return idAlumno;
	}

	public void setIdAlumno(Integer idAlumno) {
		this.idAlumno = idAlumno;
	}

}
