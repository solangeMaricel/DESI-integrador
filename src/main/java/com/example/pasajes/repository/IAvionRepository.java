package com.example.pasajes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.pasajes.entity.Avion;

@Repository 
public interface IAvionRepository extends JpaRepository<Avion, Integer> {

}
