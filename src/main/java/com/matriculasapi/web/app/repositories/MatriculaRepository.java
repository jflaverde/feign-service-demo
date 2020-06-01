package com.matriculasapi.web.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matriculasapi.web.app.entities.Matricula;


public interface MatriculaRepository extends JpaRepository<Matricula, Integer>{

}
