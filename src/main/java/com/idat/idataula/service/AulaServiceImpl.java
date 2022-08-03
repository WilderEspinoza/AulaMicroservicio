package com.idat.idataula.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.idataula.entity.Aula;
import com.idat.idataula.repository.AulaRepository;

@Service
public class AulaServiceImpl implements AulaService {

	@Autowired
	private AulaRepository repositoryAula;
	

	@Override
	public void guardarAula(Aula aula) {
		repositoryAula.save(aula);
	}
	
	
}
