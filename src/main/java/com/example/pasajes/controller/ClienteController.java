package com.example.pasajes.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.pasajes.entity.Cliente;
import com.example.pasajes.entity.Vuelo;
import com.example.pasajes.service.IClienteService;
import com.example.pasajes.service.IVueloService;

@Controller
public class ClienteController {

	@Autowired
	private IClienteService clienteServi;

	@Autowired
	private IVueloService vueloServi;

	
	@GetMapping("/clientes")
	public String tomarDatos(Model model) {
		FormCliente form = new FormCliente();
		model.addAttribute("formBean", form);
		return "clientes/buscarclienteDNI.html";
	}



	@GetMapping("/cliente")
	public String encontrarCliente(ModelMap model, @RequestParam Integer dni) {
		
		Cliente clienteEncontrado = clienteServi.findCliente(dni);
		
		if(clienteEncontrado == null) {
			model.clear();
    		return "clientes/noCliente";
		}
		else {

			model.addAttribute("cliente", clienteEncontrado);
			List<Vuelo> listaVuelos = vueloServi.getAll();
			model.addAttribute("allVuelos", listaVuelos);
			FormVueloPasaje form = new FormVueloPasaje(); 
			model.addAttribute("formBean", form);
			return "clientes/clienteEncontrado";
		}
		
	}



	
	
}
