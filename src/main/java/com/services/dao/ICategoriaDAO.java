package com.services.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.services.model.Categoria;

public interface ICategoriaDAO extends JpaRepository<Categoria, Integer>{

}
