package com.idat.idataula.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.idataula.client.OpenFeignClient;
import com.idat.idataula.dto.Alumno;
import com.idat.idataula.entity.AlumnoAulaFK;
import com.idat.idataula.entity.Aula;
import com.idat.idataula.entity.AulaDetalle;
import com.idat.idataula.repository.AulaRepository;
import com.idat.idataula.repository.DetalleAulaRepository;

@Service
public class AulaServiceImpl implements AulaService {

	@Autowired
	private AulaRepository repositoryAula;
	
	@Autowired
	private DetalleAulaRepository repositoryDetalle;
	
	@Autowired
	private OpenFeignClient feign;
	
	@Override
	public void guardarAula(Aula aula) {
		repositoryAula.save(aula);
	}


	@Override
	public void asignarEstudianteAula() {
		
		List<Alumno> listado = feign.listarAlumnosSeleccionados();;
		AlumnoAulaFK fk = null;
		AulaDetalle detalle = null;

		
		for (Alumno alumno : listado) {
			
			fk = new AlumnoAulaFK();
			fk.setIdAlumno(alumno.getIdAlumno());
			fk.setIdAula(1);
			
			detalle = new AulaDetalle();
			detalle.setFk(fk);	
			
			repositoryDetalle.save(detalle);
		}

	}
	
	
}
