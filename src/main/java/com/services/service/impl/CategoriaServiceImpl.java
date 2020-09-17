package com.services.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.services.dao.ICategoriaDAO;
import com.services.model.Categoria;
import com.services.service.ICategoriaService;

@Service
public class CategoriaServiceImpl implements ICategoriaService{
	
	@Autowired
	ICategoriaDAO dao;

	@Override
	public List<Categoria> listar() {
		return dao.findAll();
	}

}
