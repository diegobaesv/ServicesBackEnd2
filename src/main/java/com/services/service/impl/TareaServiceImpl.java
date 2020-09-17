package com.services.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.services.dao.ITareaDAO;
import com.services.model.Actividad;
import com.services.model.Tarea;
import com.services.service.ITareaService;

@Service
public class TareaServiceImpl implements ITareaService {

	@Autowired
	ITareaDAO dao;
	
	@Override
	public List<Tarea> findByActividad(Actividad actividad) {
		return dao.findByActividad(actividad);
	}
	

}
