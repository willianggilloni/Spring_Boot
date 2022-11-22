package com.bsms.helloworld.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class BsmsController {
	
	@GetMapping
	public String HelloWorld() {
		return "Hello world!!!";
	}
	
	@GetMapping("/bsm")
	public ArrayList<String> bsm() {
		ArrayList<String> listaBSM = new ArrayList<>();
		listaBSM.add("BSM's:");
		listaBSM.add("Responsabilidade pessoal");
		listaBSM.add("Mentalidade de crescimento");
		listaBSM.add("Orientação ao futuro");
		listaBSM.add("Persistência");
		listaBSM.add("Comunicação");
		listaBSM.add("Adaptabilidade");
		listaBSM.add("Trabalho em equipe");
		listaBSM.add("Proatividade");
		
		return listaBSM;

	}
	
	@GetMapping("/objetivos")
	public ArrayList<String> objetivos() {
		ArrayList<String> listaObjetivos = new ArrayList<>();
		listaObjetivos.add("Objetivos's:");
		listaObjetivos.add("Melhorar o trabalho em equipe");
		listaObjetivos.add("Melhorar minha orientação ao futuro");
		listaObjetivos.add("assistir videos e cursos sobre spring");

		
		return listaObjetivos;

	}
}

	