package com.example.pasajes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.pasajes.entity.Avion;
import com.example.pasajes.entity.Vuelo;
import com.example.pasajes.service.IAvionService;
import com.example.pasajes.service.IVueloService;

@Controller
@RequestMapping("vuelos")
public class VueloController {
	
	@Autowired
	private IVueloService vueloServi;
	
	@Autowired
	private IAvionService avionServi;
	
	@GetMapping("listar")
	public String allVuelos(Model model) {
		List<Vuelo> listaVuelos = vueloServi.getAll();
		model.addAttribute("vuelos", listaVuelos);
		return "vuelos/listarVuelos";
				
 }
	@GetMapping("listarAviones")
	public String aviones(Model model) {
		List<Avion > listaAviones = avionServi.getAviones();
		model.addAttribute("aviones", listaAviones);
		return "vuelos/listarAviones";
				
 }
	

}
