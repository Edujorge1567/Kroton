package com.ramon.cursoskroton.recursos;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import com.ramon.cursoskroton.entidades.Usuario;

@RestController
@RequestMapping (value = "/Usuarios")
public class UsuarioResource {
    
	@GetMapping
	public ResponseEntity<Usuario> GetTodos (){
		Usuario primeiroUsuario = new Usuario (7L, "Eduardo", "edujorge2010@gmail.com", "987316555", "12345678");
		return ResponseEntity.ok(primeiroUsuario);
	}
	
	
}
