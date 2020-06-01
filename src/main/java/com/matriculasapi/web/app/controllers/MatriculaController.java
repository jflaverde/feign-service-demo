package com.matriculasapi.web.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matriculasapi.web.app.entities.Matricula;
import com.matriculasapi.web.app.services.MatriculaService;

@RestController
@RequestMapping("/v1/matriculas")
public class MatriculaController {
	
	@Autowired
	private MatriculaService matriculaService;
	
	@GetMapping("/")
	public List<Matricula> findAll(){
		return matriculaService.findAll();
	}
	

}
