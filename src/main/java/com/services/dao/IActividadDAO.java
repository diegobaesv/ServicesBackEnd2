package com.services.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.services.model.Actividad;
import com.services.model.Categoria;

public interface IActividadDAO extends JpaRepository<Actividad, Integer>{
	
	List<Actividad> findByCategoria(Categoria categoria);

}
