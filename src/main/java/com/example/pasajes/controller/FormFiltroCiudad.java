package com.example.pasajes.controller;

public class FormFiltroCiudad {

	private String ciudad;

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	
	public FormFiltroCiudad() {
		super();
	}

	public FormFiltroCiudad(String ciudad) {
		super();
		this.ciudad = ciudad;
	}

	@Override
	public String toString() {
		return "FormFiltroCiudad [ciudad=" + ciudad + "]";
	}
	
	
}
