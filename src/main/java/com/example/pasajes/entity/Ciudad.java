package com.example.pasajes.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ciudades")
public class Ciudad {
	
	@Id
	private Integer idCiudad;
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name="idPais")
	private Pais idPais;
	
	public Ciudad() {
		super();
	}

	public Ciudad(Integer idCiudad, String nombre, Pais idPais) {
		super();
		this.idCiudad = idCiudad;
		this.nombre = nombre;
		this.idPais = idPais;
	}

	@Override
	public String toString() {
		return "Ciudad [idCiudad=" + idCiudad + ", nombre=" + nombre + ", idPais=" + idPais + "]";
	}

	public Integer getIdCiudad() {
		return idCiudad;
	}

	public void setIdCiudad(Integer idCiudad) {
		this.idCiudad = idCiudad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Pais getIdPais() {
		return idPais;
	}

	public void setIdPais(Pais idPais) {
		this.idPais = idPais;
	}
	
	
	

}
