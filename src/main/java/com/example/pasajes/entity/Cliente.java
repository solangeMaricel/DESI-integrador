package com.example.pasajes.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Cliente {

	@Id
	private Integer dni;

	private String nombre;
	private String apellido;
	private String domicilio;
	private String email;
	private LocalDate fechaNacimiento;
	private Integer numeroPasaporte;
	private LocalDate vencimientoPasaporte;

	public Cliente() {
		super();
	}

	public Cliente(Integer dni, String nombre, String apellido, String domicilio, String email,
			LocalDate fechaNacimiento) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.domicilio = domicilio;
		this.email = email;
		this.fechaNacimiento = fechaNacimiento;
	}

	public Cliente(Integer dni, String nombre, String apellido, String domicilio, String email,
			LocalDate fechaNacimiento, Integer numeroPasaporte, LocalDate vencimientoPasaporte) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.domicilio = domicilio;
		this.email = email;
		this.fechaNacimiento = fechaNacimiento;
		this.numeroPasaporte = numeroPasaporte;
		this.vencimientoPasaporte = vencimientoPasaporte;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Integer getNumeroPasaporte() {
		return numeroPasaporte;
	}

	public void setNumeroPasaporte(Integer numeroPasaporte) {
		this.numeroPasaporte = numeroPasaporte;
	}

	public LocalDate getVencimientoPasaporte() {
		return vencimientoPasaporte;
	}

	public void setVencimientoPasaporte(LocalDate vencimientoPasaporte) {
		this.vencimientoPasaporte = vencimientoPasaporte;
	}

	@Override
	public String toString() {
		return "Cliente [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", domicilio=" + domicilio
				+ ", email=" + email + ", fechaNacimiento=" + fechaNacimiento + ", numeroPasaporte=" + numeroPasaporte
				+ ", vencimientoPasaporte=" + vencimientoPasaporte + "]";
	}
	
	

}
