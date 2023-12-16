package com.example.pasajes.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "aviones")
public class Avion {

	@Id
	private Integer idAvion;

	private Integer cantidadFilas;
	private Integer asientoPorFilas;

	@OneToMany
	private List<Asiento> listaAsientos;

	public Avion() {
		super();
	}

	public Avion(Integer idAvion, Integer cantidadFilas, Integer asientoPorFilas) {
		super();
		this.idAvion = idAvion;
		this.cantidadFilas = cantidadFilas;
		this.asientoPorFilas = asientoPorFilas;
		this.listaAsientos = cargarAsientos(cantidadFilas, asientoPorFilas);
	}

	public  List<Asiento> cargarAsientos(Integer cantidadFilas, Integer asientoPorFilas) {
		List<Asiento> asientosNuevos = new ArrayList<>();
		
		Integer cantidadTodal = cantidadFilas*asientoPorFilas;
		
		for(int i=1; i<=cantidadTodal; i++) {
			Asiento asientoNuevo = new Asiento(i);
			asientosNuevos.add(asientoNuevo);			
		}
		
		return asientosNuevos;
		
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

	public List<Asiento> getListaAsientos() {
		return listaAsientos;
	}

	public void setListaAsientos(List<Asiento> listaAsientos) {
		this.listaAsientos = listaAsientos;
	}

	@Override
	public String toString() {
		return "Avion [idAvion=" + idAvion + ", cantidadFilas=" + cantidadFilas + ", asientoPorFilas=" + asientoPorFilas
				+ ", listaAsientos=" + listaAsientos + "]";
	}
	
	

}
