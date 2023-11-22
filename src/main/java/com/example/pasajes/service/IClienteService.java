package com.example.pasajes.service;

import java.util.List;

import com.example.pasajes.entity.Cliente;

public interface IClienteService {
	
	public List<Cliente> getClientes();

	public Cliente findCliente(Integer dni);
}
