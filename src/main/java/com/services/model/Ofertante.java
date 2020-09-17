package com.services.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ofertante")
public class Ofertante {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idOfertante;
	
	@Column(name = "nombre", nullable = false, length=100)
	private String nombre;
	
	@Column(name = "ruta_icono", nullable = false, length=1024)
	private String rutaIcono;

	public int getIdOfertante() {
		return idOfertante;
	}

	public void setIdOfertante(int idOfertante) {
		this.idOfertante = idOfertante;
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

}
