package com.sistema.examenes;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sistema.examenes.entidades.Rol;
import com.sistema.examenes.entidades.Usuario;
import com.sistema.examenes.entidades.UsuarioRol;
import com.sistema.examenes.servicios.UsuarioService;

@SpringBootApplication
public class SistemaExamenesBackendApplication implements CommandLineRunner{
	
	@Autowired
	private UsuarioService usuarioService;

	public static void main(String[] args) {
		SpringApplication.run(SistemaExamenesBackendApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
	Usuario usuario = new Usuario();	
	
	usuario.setNombre("arturo");
	usuario.setApellidos("hdez");
	usuario.setUsername("arturo");
	usuario.setPassword("arturo");
	usuario.setEmail("arturo@gmail.com");
	usuario.setTelefono("1234567890");
	usuario.setPerfil("foto.png");
	
	Rol rol = new Rol();
	rol.setRolId(1L);
	rol.setNombre("ADMIN");
	
	Set<UsuarioRol> usuarioRoles = new HashSet<>();
	UsuarioRol usuarioRol = new UsuarioRol();
	usuarioRol.setRol(rol);
	usuarioRol.setUsuario(usuario);
	usuarioRoles.add(usuarioRol);
	
	Usuario usuarioGuardado = usuarioService.guardarUsuario(usuario, usuarioRoles);
	System.out.println(usuarioGuardado.getUsername());
	
	}
	
	
}
