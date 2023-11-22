package com.example.pasajes.service;

import java.util.List;

import com.example.pasajes.entity.Avion;

public interface IAvionService {
	
	public List<Avion> getAviones();
	public void cargarAvion(Avion avion);
	

}
