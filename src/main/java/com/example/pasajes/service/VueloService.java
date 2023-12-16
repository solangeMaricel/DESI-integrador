package com.example.pasajes.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pasajes.entity.Vuelo;
import com.example.pasajes.repository.IVueloRepository;

@Service
public class VueloService implements IVueloService {

	@Autowired 
	private IVueloRepository vueloRepo;
	
	
	@Override
	public List<Vuelo> getAll() {
		return vueloRepo.findAll();
	}

	@Override
	public void crearteVuelo(Vuelo vuelo) {
		vueloRepo.save(vuelo);
		
	}

	@Override
	public Optional<Vuelo> getVuelo(String id) {
		return vueloRepo.findById(id);
	}

	@Override
	public List<Vuelo> filtrarFecha(LocalDate fechaPartida) {
		return vueloRepo.vuelosDelDia(fechaPartida);
	}

	@Override
	public List<Vuelo> avionesConVuelosRepetidos(LocalDate fechaPartida, Integer idAvion) {
		return vueloRepo.avionesConVuelosRepetidos(fechaPartida, idAvion);
	}

	@Override
	public List<Vuelo> filtroOrigen(String ciudad) {
		return vueloRepo.filtroOrigen(ciudad);
	}

	@Override
	public List<Vuelo> filtroDestino(String ciudad) {
		return vueloRepo.filtroDestino(ciudad);
	}

	
	

}
