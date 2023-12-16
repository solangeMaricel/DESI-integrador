package com.example.pasajes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pasajes.entity.Ciudad;
import com.example.pasajes.repository.ICiudadRepository;

@Service
public class CiudadService implements ICiudadService {

	@Autowired
	private ICiudadRepository ciudadRepo;
	
	@Override
	public List<Ciudad> getCiudades() {
		return ciudadRepo.findAll();
	}

}
