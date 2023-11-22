package com.example.pasajes.service;

import java.util.List;

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
	
	

}
