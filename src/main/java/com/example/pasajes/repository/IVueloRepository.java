package com.example.pasajes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.pasajes.entity.Vuelo;

@Repository
public interface IVueloRepository extends JpaRepository<Vuelo, String> {

}
