package com.sistema.examenes.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistema.examenes.entidades.Examen;

public interface ExamenRepository extends JpaRepository<Examen, Long>{

}
