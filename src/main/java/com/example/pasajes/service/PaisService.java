package com.example.pasajes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pasajes.entity.Pais;
import com.example.pasajes.repository.IPaisRepository;

@Service
public class PaisService implements IPaisService {

	@Autowired
	private IPaisRepository paisRepo;

	@Override
	public List<Pais> getPaises() {
		return paisRepo.findAll();
	}
}
