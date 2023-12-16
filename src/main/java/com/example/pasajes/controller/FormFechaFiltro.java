package com.example.pasajes.controller;

import java.time.LocalDate;

public class FormFechaFiltro {
	private LocalDate fechaFiltrada;

	public LocalDate getFechaFiltrada() {
		return fechaFiltrada;
	}

	public void setFechaFiltrada(LocalDate fechaFiltrada) {
		this.fechaFiltrada = fechaFiltrada;
	}
	
	

	public FormFechaFiltro() {
		super();
	}

	public FormFechaFiltro(LocalDate fechaFiltrada) {
		super();
		this.fechaFiltrada = fechaFiltrada;
	}

	@Override
	public String toString() {
		return "FormFechaFiltro [fechaFiltrada=" + fechaFiltrada + "]";
	}
	
	

}
