package com.frotas.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bairro")
public class BairroController {

	@GetMapping("/cadastrar")
	public String cadastrar() {
	return "bairro/cadastro_bairro";
	}
	
	@GetMapping("/listar")
	public String listar() {
	return "bairro/lista_bairro";
	}
	
}
