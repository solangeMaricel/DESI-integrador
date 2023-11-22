package com.example.pasajes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.pasajes.entity.Cliente;

@Repository
public interface IClienteRepository extends JpaRepository<Cliente, Integer > {

	Cliente findByDni(Integer dni);

}
