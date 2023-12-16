package com.example.pasajes.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.query.Param;

import com.example.pasajes.entity.Vuelo;

public interface IVueloService {
	
	public List <Vuelo > getAll();
	public List<Vuelo> filtrarFecha(LocalDate fechaPartida);
	public void crearteVuelo(Vuelo vuelo);
	public Optional<Vuelo> getVuelo(String id);
	public List<Vuelo> avionesConVuelosRepetidos(LocalDate fechaPartida, Integer idAvion);
	public List<Vuelo> filtroOrigen(String ciudad);
	public List<Vuelo> filtroDestino(String ciudad);
}
