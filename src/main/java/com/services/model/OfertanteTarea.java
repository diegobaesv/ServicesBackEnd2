package com.services.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ofertante_tarea")
public class OfertanteTarea {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idOfertanteTarea;
	
	@ManyToOne
	@JoinColumn(name="id_ofertante",nullable = false)
	private Ofertante ofertante;
	
	@ManyToOne
	@JoinColumn(name="id_tarea",nullable = false)
	private Tarea tarea;;
	
	@Column(name = "nombre", nullable = false)
	private float precioBaseSoles;

	public int getIdOfertanteTarea() {
		return idOfertanteTarea;
	}

	public void setIdOfertanteTarea(int idOfertanteTarea) {
		this.idOfertanteTarea = idOfertanteTarea;
	}

	public Ofertante getOfertante() {
		return ofertante;
	}

	public void setOfertante(Ofertante ofertante) {
		this.ofertante = ofertante;
	}

	public Tarea getTarea() {
		return tarea;
	}

	public void setTarea(Tarea tarea) {
		this.tarea = tarea;
	}

	public float getPrecioBaseSoles() {
		return precioBaseSoles;
	}

	public void setPrecioBaseSoles(float precioBaseSoles) {
		this.precioBaseSoles = precioBaseSoles;
	}

}
