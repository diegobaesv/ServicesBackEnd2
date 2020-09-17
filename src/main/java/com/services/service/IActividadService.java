package com.services.service;

import java.util.List;

import com.services.model.Actividad;
import com.services.model.Categoria;


public interface IActividadService {
	
	List<Actividad> findByCategoria(Categoria categoria);

}
