package com.sistema.examenes.servicios;

import java.util.Set;

import com.sistema.examenes.entidades.Categoria;

public interface CategoriaService {

	Categoria agregarCategoria(Categoria categoria);
	
	Categoria actualizarCategoria(Categoria categoria);
	
	Set<Categoria> obtenerCategorias();
	
	Categoria obtenerCategoria(Long categoriaId);
	
	void eliminarCategoria(Long categoriaId);
}
