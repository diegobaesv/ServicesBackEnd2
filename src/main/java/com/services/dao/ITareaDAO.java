package com.services.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.services.model.Actividad;
import com.services.model.Tarea;

public interface ITareaDAO extends JpaRepository<Tarea, Integer>{
	
	List<Tarea> findByActividad(Actividad actividad);


}
