package com.matriculasapi.web.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matriculasapi.web.app.entities.Matricula;
import com.matriculasapi.web.app.entities.tipoMatriculaEnum;
import com.matriculasapi.web.app.repositories.MatriculaRepository;


@Service
public class MatriculaServiceImpl implements MatriculaService{

	@Autowired
	private MatriculaRepository repository;
	@Override
	public List<Matricula> findAll() {
		
		if(repository.findAll().size()==0) {
			Matricula matricula = new Matricula();
			matricula.setActivo(true);
			matricula.setTipo(tipoMatriculaEnum.DOMICILIACION);
			
			repository.save(matricula);
			
			Matricula matricula2 = new Matricula();
			matricula2.setActivo(false);
			matricula2.setTipo(tipoMatriculaEnum.DOMICILIACION);
			
			repository.save(matricula2);
		}
		return repository.findAll();
	}

}
