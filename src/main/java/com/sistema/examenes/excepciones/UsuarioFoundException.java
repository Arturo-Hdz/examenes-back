package com.sistema.examenes.excepciones;

public class UsuarioFoundException extends Exception{

	public UsuarioFoundException() {
		super("El Usuario con ese username ya existe en la base de datos, vuelva a intentar!!");
	}
	
	public UsuarioFoundException(String message) {
		super(message);
	}
}