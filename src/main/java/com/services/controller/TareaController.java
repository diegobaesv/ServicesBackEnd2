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
import com.services.model.Tarea;
import com.services.payload.response.StepsResponse;
import com.services.service.ITareaService;
import com.services.util.StepsUtil;

@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST })
@RestController
@RequestMapping("/tarea")
public class TareaController {

	private final int INDEX_CONTROLLER = StepsUtil.INDEX_TAREAS;

	@Autowired
	ITareaService serviceTarea;

	@GetMapping(value = "/listar/tarea/{idActividad}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<StepsResponse> findByActividad(@PathVariable("idActividad") Integer idActividad) {

		StepsResponse stepsResponse = new StepsResponse();
		List<Tarea> listaTarea = new ArrayList<>();
		try {

			listaTarea = serviceTarea.findByActividad(new Actividad(idActividad));

			stepsResponse.setData(listaTarea);
			stepsResponse.setSteps(StepsUtil.getListStepsByIndex(INDEX_CONTROLLER));
			stepsResponse.setIndex(INDEX_CONTROLLER);

		} catch (Exception e) {
			new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<StepsResponse>(stepsResponse, HttpStatus.OK);
	}

}
