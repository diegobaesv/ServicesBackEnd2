package com.services.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.services.model.Categoria;
import com.services.service.ICategoriaService;

@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST })
@RestController
@RequestMapping("/categoria")
public class CategoriaController {
	
	@Autowired
	ICategoriaService serviceCategoria;
	
	@GetMapping(value = "/listar", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Categoria>>listar() {
		List<Categoria> lista = new ArrayList<>();
		try {
			lista = serviceCategoria.listar();
		} catch (Exception e) {
			System.out.println(e);
		}
		return new ResponseEntity<List<Categoria>>(lista,HttpStatus.OK);
	}

}
