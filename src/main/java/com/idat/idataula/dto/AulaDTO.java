package com.idat.idataula.dto;

import java.util.List;

import com.idat.idataula.entity.Estudiante;

public class AulaDTO {

	private Integer idAula;
	private String aula;
	private List<Estudiante> listadoEstudiante;
	public Integer getIdAula() {
		return idAula;
	}
	public void setIdAula(Integer idAula) {
		this.idAula = idAula;
	}
	public String getAula() {
		return aula;
	}
	public void setAula(String aula) {
		this.aula = aula;
	}
	public List<Estudiante> getListadoEstudiante() {
		return listadoEstudiante;
	}
	public void setListadoEstudiante(List<Estudiante> listadoEstudiante) {
		this.listadoEstudiante = listadoEstudiante;
	}
	
	
}
