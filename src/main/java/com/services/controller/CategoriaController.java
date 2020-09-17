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
import com.services.payload.response.StepsResponse;
import com.services.service.ICategoriaService;
import com.services.util.StepsUtil;

@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST })
@RestController
@RequestMapping("/categoria")
public class CategoriaController {
	
	private final int INDEX_CONTROLLER = StepsUtil.INDEX_CATEGORIAS;
	
	@Autowired
	ICategoriaService serviceCategoria;
	
	@GetMapping(value = "/listar", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<StepsResponse>listar() {
		
			
		StepsResponse stepsResponse = new StepsResponse();
		List<Categoria> listaCategoria = new ArrayList<>();
		
		try {
			listaCategoria = serviceCategoria.listar();
						
			stepsResponse.setData(listaCategoria);
			stepsResponse.setSteps(StepsUtil.getListStepsByIndex(INDEX_CONTROLLER));
			stepsResponse.setIndex(INDEX_CONTROLLER);
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return new ResponseEntity<StepsResponse>(stepsResponse,HttpStatus.OK);
			
		
		
	}

}
