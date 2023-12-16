package com.example.pasajes.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "asientos")
public class Asiento {
	
	@Id 
	private Integer numeroAsiento;
	private Boolean disponible;
	
	public Asiento() {
		super();
	}

	public Asiento(Integer numeroAsiento) {
		super();
		this.numeroAsiento = numeroAsiento;
		this.disponible = true;
	}
	
	
	
	public Integer getNumeroAsiento() {
		return numeroAsiento;
	}

	public Boolean getDisponible() {
		return disponible;
	}

	public void setDisponible(Boolean disponible) {
		this.disponible = disponible;
	}

	@Override
	public String toString() {
		return "Asiento [numeroAsiento=" + numeroAsiento + ", disponible=" + disponible + "]";
	}
	
	
	
	
	

}
