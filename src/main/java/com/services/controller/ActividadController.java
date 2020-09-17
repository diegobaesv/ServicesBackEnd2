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
import com.services.payload.response.StepsResponse;
import com.services.service.IActividadService;
import com.services.util.StepsUtil;


@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST })
@RestController
@RequestMapping("/actividad")
public class ActividadController {
	
	private final int INDEX_CONTROLLER = StepsUtil.INDEX_ACTIVIDADES;
	
	@Autowired
	IActividadService serviceActividad;
	
	@GetMapping(value="/listar/categoria/{idCategoria}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<StepsResponse> findByCategoria(@PathVariable("idCategoria") Integer idCategoria){
		
		StepsResponse stepsResponse = new StepsResponse();
		List<Actividad> listaActividad = new ArrayList<>();
		try {
			
			listaActividad = serviceActividad.findByCategoria(new Categoria(idCategoria));
			
			stepsResponse.setData(listaActividad);
			stepsResponse.setSteps(StepsUtil.getListStepsByIndex(INDEX_CONTROLLER));
			stepsResponse.setIndex(INDEX_CONTROLLER);
			
		} catch (Exception e) {
			new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<StepsResponse>(stepsResponse, HttpStatus.OK);
	}

}
