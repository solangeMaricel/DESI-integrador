package com.example.pasajes.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "vuelos")
public class Vuelo {
	
	@Id 
	private String nroVuelo;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate fechaPartida;
	private LocalTime horaPartida; 
	private String destino;
	private String origen;
	
	private String tipoVuelo;
	private double precioPasaje;
	private String estado;
	
	@ManyToOne
	@JoinColumn(name="idAvion")
	private Avion avion;
	
	
	public Vuelo() {
		super();
	}


	public String getNroVuelo() {
		return nroVuelo;
	}


	public void setNroVuelo(String nroVuelo) {
		this.nroVuelo = nroVuelo;
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


	public String getDestino() {
		return destino;
	}


	public void setDestino(String destino) {
		this.destino = destino;
	}


	public String getOrigen() {
		return origen;
	}


	public void setOrigen(String origen) {
		this.origen = origen;
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


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public Avion getAvion() {
		return avion;
	}


	public void setAvion(Avion avion) {
		this.avion = avion;
	}


	public Vuelo(String nroVuelo, LocalDate fechaPartida, LocalTime horaPartida, String destino, String origen,
			String tipoVuelo, double precioPasaje, Avion avion) {
		super();
		this.nroVuelo = nroVuelo;
		this.fechaPartida = fechaPartida;
		this.horaPartida = horaPartida;
		this.destino = destino;
		this.origen = origen;
		this.tipoVuelo = tipoVuelo;
		this.precioPasaje = precioPasaje;
		this.avion = avion;
		this.estado = "Nomal";
	}


	@Override
	public String toString() {
		return "Vuelo [nroVuelo=" + nroVuelo + ", fechaPartida=" + fechaPartida + ", horaPartida=" + horaPartida
				+ ", destino=" + destino + ", origen=" + origen + ", tipoVuelo=" + tipoVuelo + ", precioPasaje="
				+ precioPasaje + ", estado=" + estado + ", avion=" + avion + "]";
	}


	
}
