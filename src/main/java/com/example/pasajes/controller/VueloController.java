package com.example.pasajes.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.pasajes.entity.Avion;
import com.example.pasajes.entity.Ciudad;
import com.example.pasajes.entity.Cliente;
import com.example.pasajes.entity.Vuelo;
import com.example.pasajes.service.IAvionService;
import com.example.pasajes.service.ICiudadService;
import com.example.pasajes.service.IVueloService;

@Controller
public class VueloController {

	@Autowired
	private IVueloService vueloServi;
	@Autowired
	private ICiudadService ciudadServi;
	@Autowired
	private IAvionService avionServi;

	@ModelAttribute("allCiudades")
	public List<Ciudad> getAllCiudades() {
		return this.ciudadServi.getCiudades();
	}

	@ModelAttribute("allAviones")
	public List<Avion> getAllAviones() {
		return this.avionServi.getAviones();
	}

	@GetMapping("/vuelos")
	public String tomarDatos(Model model) {

		FormVuelo form = new FormVuelo();
		model.addAttribute("formBean", form);

		return "vuelos/newVuelo";
	}

	@GetMapping("/vueloSeleccionado")
	public void tomarDatoVuelo(Model model) {

		FormVueloPasaje form = new FormVueloPasaje();
		model.addAttribute("formBean", form);
	}

	@PostMapping("/vuelos")
	public String guardarVuelo(@ModelAttribute Vuelo vuelo, ModelMap model, @RequestParam String action) {
		if (action.equals("guardar")) {

			String nroVuelo = vuelo.getNroVuelo();
			LocalDate fecha = vuelo.getFechaPartida();
			List<Vuelo> validacionFechaVuelo = vueloServi.avionesConVuelosRepetidos(vuelo.getFechaPartida(), vuelo.getAvion().getIdAvion());
			Optional<Vuelo> vueloEncontrado = vueloServi.getVuelo(nroVuelo);
			

			if (vueloEncontrado.isPresent()) {
				return "vuelos/vueloDuplicado";
			}

			if (vuelo.getOrigen().equals(vuelo.getDestino())) {
				return "vuelos/ciudadMal";
			}
			
			if (!validacionFechaVuelo.isEmpty()) {
				return "vuelos/fechaVuelosMal";
			}
			
			vueloServi.crearteVuelo(vuelo);
			return "vuelos/vueloCreado";
		}

		return "redirect:/";

	}

	@GetMapping("vuelos/registro")
	public String allVuelos(Model model) {
		List<Vuelo> listaVuelos = vueloServi.getAll();
		model.addAttribute("vuelos", listaVuelos);
		
		FormFechaFiltro form = new FormFechaFiltro();
		model.addAttribute("formBean", form);
		
		FormFiltroCiudad formCiudad = new FormFiltroCiudad();
		model.addAttribute("formCiudad", formCiudad);
		
		return "vuelos/listarVuelos";
	}

	@GetMapping("vuelos/hoy")
	public String vuelosDelDia(Model model) {
		LocalDate fecha = LocalDate.now();
		List<Vuelo> listaVuelos = vueloServi.filtrarFecha(fecha);
		model.addAttribute("vuelos", listaVuelos);
		return "vuelos/listarVuelos";
	}
	
	@GetMapping("vuelos/fecha")
	public String filtroFecha(Model model, @RequestParam LocalDate fechaFiltrada) {
		
		List<Vuelo> listaVuelos = vueloServi.filtrarFecha(fechaFiltrada);
		model.addAttribute("vuelos", listaVuelos);
		return "vuelos/listarVuelos";
	}
	
	@GetMapping("vuelos/filtroOrigen")
	public String filtroOrigen(Model model, @RequestParam String ciudad) {
		
		List<Vuelo> listaVuelos = vueloServi.filtroOrigen(ciudad);
		model.addAttribute("vuelos", listaVuelos);
		return "vuelos/listarVuelos";
	}
	
	@GetMapping("vuelos/filtroDestino")
	public String filtroDestino(Model model, @RequestParam String ciudad) {
		
		List<Vuelo> listaVuelos = vueloServi.filtroDestino(ciudad);
		model.addAttribute("vuelos", listaVuelos);
		return "vuelos/listarVuelos";
	}
	
	
	
	

}
