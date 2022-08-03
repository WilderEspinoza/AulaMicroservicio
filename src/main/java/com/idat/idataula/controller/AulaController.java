package com.idat.idataula.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.idat.idataula.entity.Aula;
import com.idat.idataula.service.AulaService;

@RestController
@RequestMapping("/api/aula/v1")
public class AulaController {

	@Autowired
	private AulaService service;

	@PostMapping("/guardar")
	public @ResponseBody void guardar(@RequestBody Aula aula) {
		service.guardarAula(aula);
	}
}
