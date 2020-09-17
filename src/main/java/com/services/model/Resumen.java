package com.services.model;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "resumen")
public class Resumen {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idResumen;
	
	@ManyToOne
	@JoinColumn(name="id_tarea",nullable = false)
	private Tarea tarea;
	
	@Column(name = "fecha_inicial", nullable = false)
	private LocalDate fechaInicial;
	
	@Column(name = "fecha_final", nullable = false)
	private LocalDate fechaFinal;
	
	@Column(name = "hora_servicio", nullable = false)
	private LocalTime horaServicio;
	
	@Column(name = "numero_horas", nullable = false)
	private int numeroHoras;
	
	@Column(name = "numero_personas", nullable = false)
	private int numeroPersonas;
	
	@Column(name = "costo_servicio", nullable = false)
	private float costoServicio;

	public int getIdResumen() {
		return idResumen;
	}

	public void setIdResumen(int idResumen) {
		this.idResumen = idResumen;
	}

	public Tarea getTarea() {
		return tarea;
	}

	public void setTarea(Tarea tarea) {
		this.tarea = tarea;
	}

	public LocalDate getFechaInicial() {
		return fechaInicial;
	}

	public void setFechaInicial(LocalDate fechaInicial) {
		this.fechaInicial = fechaInicial;
	}

	public LocalDate getFechaFinal() {
		return fechaFinal;
	}

	public void setFechaFinal(LocalDate fechaFinal) {
		this.fechaFinal = fechaFinal;
	}

	public LocalTime getHoraServicio() {
		return horaServicio;
	}

	public void setHoraServicio(LocalTime horaServicio) {
		this.horaServicio = horaServicio;
	}

	public int getNumeroHoras() {
		return numeroHoras;
	}

	public void setNumeroHoras(int numeroHoras) {
		this.numeroHoras = numeroHoras;
	}

	public int getNumeroPersonas() {
		return numeroPersonas;
	}

	public void setNumeroPersonas(int numeroPersonas) {
		this.numeroPersonas = numeroPersonas;
	}

	public float getCostoServicio() {
		return costoServicio;
	}

	public void setCostoServicio(float costoServicio) {
		this.costoServicio = costoServicio;
	}
}
