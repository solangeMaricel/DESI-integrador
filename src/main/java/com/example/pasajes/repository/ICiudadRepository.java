package com.example.pasajes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.pasajes.entity.Ciudad;

@Repository 
public interface ICiudadRepository extends JpaRepository<Ciudad, Integer>{

}
