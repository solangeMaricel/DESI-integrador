package com.example.pasajes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pasajes.entity.Avion;
import com.example.pasajes.repository.IAvionRepository;

@Service
public class AvionService implements IAvionService{

	@Autowired
	private IAvionRepository avionRepo;
	
	@Override
	public List<Avion> getAviones() {
		return avionRepo.findAll();
	}

	@Override
	public void cargarAvion(Avion avion) {
		avionRepo.save(avion);
		
	}
	
}
