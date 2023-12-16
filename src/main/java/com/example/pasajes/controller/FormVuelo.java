package com.example.pasajes.controller;

import java.time.LocalDate;
import java.time.LocalTime;

import com.example.pasajes.entity.Avion;
import com.example.pasajes.entity.Ciudad;

public class FormVuelo {

	private String nroVuelo;
	private String origen;
	private String destino;
	private String tipoVuelo;
	private double precioPasaje;
	private LocalDate fechaPartida;
	private LocalTime horaPartida;
	private Avion avion;
	private String estado;

	public FormVuelo() {
		super();
	}


	
	public FormVuelo(String nroVuelo, String origen, String destino, String tipoVuelo, double precioPasaje,
			LocalDate fechaPartida, LocalTime horaPartida, Avion avion, String estado) {
		this.nroVuelo = nroVuelo;
		this.origen = origen;
		this.destino = destino;
		this.tipoVuelo = tipoVuelo;
		this.precioPasaje = precioPasaje;
		this.fechaPartida = fechaPartida;
		this.horaPartida = horaPartida;
		this.avion = avion;
		this.estado = estado;
	}



	public String getNroVuelo() {
		return nroVuelo;
	}

	public void setNroVuelo(String nroVuelo) {
		this.nroVuelo = nroVuelo;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getTipoVuelo() {
		return tipoVuelo;
	}

	public void setTipoVuelo(String tipoVuelo) {
		this.tipoVuelo = tipoVuelo;
	}

	public double getPrecioPasaje() {
		return precioPasaje;
	}

	public void setPrecioPasaje(double precioPasaje) {
		this.precioPasaje = precioPasaje;
	}

	public LocalDate getFechaPartida() {
		return fechaPartida;
	}

	public void setFechaPartida(LocalDate fechaPartida) {
		this.fechaPartida = fechaPartida;
	}

	public LocalTime getHoraPartida() {
		return horaPartida;
	}

	public void setHoraPartida(LocalTime horaPartida) {
		this.horaPartida = horaPartida;
	}

	public Avion getAvion() {
		return avion;
	}

	public void setAvion(Avion avion) {
		this.avion = avion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "FormVuelo [nroVuelo=" + nroVuelo + ", origen=" + origen + ", destino=" + destino + ", tipoVuelo="
				+ tipoVuelo + ", precioPasaje=" + precioPasaje + ", fechaPartida=" + fechaPartida + ", horaPartida="
				+ horaPartida + ", avion=" + avion + ", estado=" + estado + "]";
	}

}
