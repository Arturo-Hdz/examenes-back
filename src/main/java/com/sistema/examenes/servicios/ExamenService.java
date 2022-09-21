package com.sistema.examenes.servicios;

import java.util.Set;

import com.sistema.examenes.entidades.Examen;

public interface ExamenService {

	Examen agregarExamen(Examen examen);
	
	Examen actualizarExamen(Examen examen);
	
	Set<Examen> obtenerExamen();
	
	Examen obtenerExamen(Long examenId);
	
	void eliminarExamen(Long examenId);
}
