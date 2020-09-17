package com.services.service;

import java.util.List;

import com.services.model.Actividad;
import com.services.model.Tarea;

public interface ITareaService {

	List<Tarea> findByActividad(Actividad actividad);
}
