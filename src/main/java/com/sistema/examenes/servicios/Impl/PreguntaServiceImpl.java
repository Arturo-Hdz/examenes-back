package com.sistema.examenes.servicios.Impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistema.examenes.entidades.Examen;
import com.sistema.examenes.entidades.Pregunta;
import com.sistema.examenes.repositorios.PreguntaRepository;
import com.sistema.examenes.servicios.PreguntaService;

@Service
public class PreguntaServiceImpl implements PreguntaService{

	@Autowired
	private PreguntaRepository preguntaRepository;
	
	@Override
	public Pregunta agregarPregunta(Pregunta pregunta) {
		return preguntaRepository.save(pregunta);
	}

	@Override
	public Pregunta actualizarPregunta(Pregunta pregunta) {
		return preguntaRepository.save(pregunta);
	}

	@Override
	public Set<Pregunta> obtenerPreguntas() {
		return (Set<Pregunta>) preguntaRepository.findAll();
	}

	@Override
	public Pregunta obtenerPregunta(Long preguntaId) {
		return preguntaRepository.findById(preguntaId).get();
	}

	@Override
	public Set<Pregunta> obtenerPreguntasDelExamen(Examen examen) {
		return preguntaRepository.findByExamen(examen);
	}

	@Override
	public void eliminarPregunta(Long preguntaId) {
		Pregunta pregunta = new Pregunta();
		pregunta.setPreguntasId(preguntaId);
		preguntaRepository.delete(pregunta);
	}

}
