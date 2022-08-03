package com.idat.idataula.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.idat.idataula.dto.Alumno;

@FeignClient(name="idat-alumno", url="localhost:8080")
public interface OpenFeignClient {

	@GetMapping("/api/estudiante/v1/listar")
	public List<Alumno> listarAlumnosSeleccionados();
}
