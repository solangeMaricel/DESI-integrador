package com.example.pasajes.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "aviones")
public class Avion {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idAvion;
	
	
	private Integer cantidadFilas;
	private Integer asientoPorFilas;
	
	public Avion() {
		
	}

	public Avion(Integer idAvion, Integer cantidadFilas, Integer asientoPorFilas) {
		super();
		this.idAvion = idAvion;
		this.cantidadFilas = cantidadFilas;
		this.asientoPorFilas = asientoPorFilas;
	}

	public Integer getIdAvion() {
		return idAvion;
	}

	public void setIdAvion(Integer idAvion) {
		this.idAvion = idAvion;
	}

	public Integer getCantidadFilas() {
		return cantidadFilas;
	}

	public void setCantidadFilas(Integer cantidadFilas) {
		this.cantidadFilas = cantidadFilas;
	}

	public Integer getAsientoPorFilas() {
		return asientoPorFilas;
	}

	public void setAsientoPorFilas(Integer asientoPorFilas) {
		this.asientoPorFilas = asientoPorFilas;
	}

	@Override
	public String toString() {
		return "Avion [idAvion=" + idAvion + ", cantidadFilas=" + cantidadFilas + ", asientoPorFilas=" + asientoPorFilas
				+ "]";
	}
	
	

}
