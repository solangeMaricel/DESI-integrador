package com.example.pasajes.service;

import java.util.List;

import com.example.pasajes.entity.Vuelo;

public interface IVueloService {
	
	public List <Vuelo > getAll();
	public void crearteVuelo(Vuelo vuelo);
	//public void modificarVuelo(Vuelo vuelo);
	//public void eliminarVuelo(Vuelo vuelo);
	
	

}
