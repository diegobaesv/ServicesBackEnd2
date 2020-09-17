package com.services.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "categoria")
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCategoria;
	
	@Column(name = "nombre", nullable = false, length=100)
	private String nombre;
	
	@Column(name = "ruta_icono", nullable = true, length=1024)
	private String rutaIcono;
	
	@Column(name = "nombre_icono", nullable = true, length=1024)
	private String nombreIcono;
	
	

	public Categoria() {
	}

	public Categoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	public int getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRutaIcono() {
		return rutaIcono;
	}

	public void setRutaIcono(String rutaIcono) {
		this.rutaIcono = rutaIcono;
	}

	public String getNombreIcono() {
		return nombreIcono;
	}

	public void setNombreIcono(String nombreIcono) {
		this.nombreIcono = nombreIcono;
	}

}
