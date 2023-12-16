package com.example.pasajes.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.pasajes.entity.Vuelo;

@Repository
public interface IVueloRepository extends JpaRepository<Vuelo, String> {

	@Query(value = "SELECT * FROM vuelos order by fecha_partida desc, hora_partida asc", nativeQuery = true)
	List <Vuelo> getAll();
    
	@Query(value = "SELECT * FROM vuelos WHERE fecha_partida = :fechaPartida order by fecha_partida desc, hora_partida asc", nativeQuery = true)
    List<Vuelo> vuelosDelDia(@Param("fechaPartida") LocalDate fechaPartida);

    @Query(value = "SELECT * FROM vuelos v WHERE fecha_partida = :fechaPartida and id_avion= :idAvion ", nativeQuery = true)
    List<Vuelo> avionesConVuelosRepetidos(@Param("fechaPartida") LocalDate fechaPartida, 
    										@Param("idAvion") Integer idAvion);
    
    @Query(value = "SELECT * FROM vuelos where origen = :ciudad", nativeQuery = true)
    List<Vuelo> filtroOrigen(@Param("ciudad") String ciudad);
    
    @Query(value = "SELECT * FROM vuelos where destino = :ciudad", nativeQuery = true)
    List<Vuelo> filtroDestino(@Param("ciudad") String ciudad);
    
    

}
