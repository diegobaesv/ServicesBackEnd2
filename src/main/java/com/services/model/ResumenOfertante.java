package com.services.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tarea")
public class ResumenOfertante {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idResumenOfertante;
	
	@ManyToOne
	@JoinColumn(name="id_resumen",nullable = false)
	private Resumen resumen;
	
	@ManyToOne
	@JoinColumn(name="id_ofertante",nullable = false)
	private Ofertante ofertante;

	public int getIdResumenOfertante() {
		return idResumenOfertante;
	}

	public void setIdResumenOfertante(int idResumenOfertante) {
		this.idResumenOfertante = idResumenOfertante;
	}

	public Resumen getResumen() {
		return resumen;
	}

	public void setResumen(Resumen resumen) {
		this.resumen = resumen;
	}

	public Ofertante getOfertante() {
		return ofertante;
	}

	public void setOfertante(Ofertante ofertante) {
		this.ofertante = ofertante;
	}
	
}

	
