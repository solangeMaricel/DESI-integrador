package com.example.pasajes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pasajes.entity.Cliente;
import com.example.pasajes.repository.IClienteRepository;

@Service
public class ClienteService implements IClienteService {

	@Autowired 
	private IClienteRepository clienteRepo;

	@Override
	public List<Cliente> getClientes() {
		return clienteRepo.findAll();
	}

	@Override
	public Cliente findCliente(Integer dni) {
		return clienteRepo.findByDni(dni);
	}

	
}
