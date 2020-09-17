package com.services.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.services.model.Actividad;
import com.services.model.Categoria;
import com.services.service.IActividadService;


@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST })
@RestController
@RequestMapping("/actividad")
public class ActividadController {
	
	@Autowired
	IActividadService serviceActividad;
	
	@GetMapping(value="/listar/categoria/{idCategoria}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Actividad>> findByCategoria(@PathVariable("idCategoria") Integer idCategoria){
		List<Actividad> lista = new ArrayList<>();
		try {
			lista = serviceActividad.findByCategoria(new Categoria(idCategoria));
		} catch (Exception e) {
			new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<List<Actividad>>(lista, HttpStatus.OK);
	}

}
