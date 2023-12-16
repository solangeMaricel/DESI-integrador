package com.example.pasajes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.pasajes.entity.Pais;

@Repository 
public interface IPaisRepository extends JpaRepository<Pais, Integer>{

}
