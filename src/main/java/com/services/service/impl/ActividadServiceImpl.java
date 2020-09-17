package com.services.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.services.dao.IActividadDAO;
import com.services.model.Actividad;
import com.services.model.Categoria;
import com.services.service.IActividadService;

@Service
public class ActividadServiceImpl implements IActividadService{

	@Autowired
	IActividadDAO dao;

	@Override
	public List<Actividad> findByCategoria(Categoria categoria) {
		return dao.findByCategoria(categoria);
	}
	

}
