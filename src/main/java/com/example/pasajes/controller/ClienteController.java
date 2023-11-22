package com.example.pasajes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.pasajes.entity.Cliente;
import com.example.pasajes.service.ClienteService;

@Controller

public class ClienteController {

	@Autowired
	private ClienteService clienteServi;

	@GetMapping("/clientes")
	public String tomarDatos(Model model) {

		FormCliente form = new FormCliente();
		model.addAttribute("formBean", form);
	
		return "clientes/buscarclienteDNI";
	}
	
	@GetMapping("/clientes")

	// @ModelAttribute("allClientes")
	// public List<Cliente> allClientes(){
	// return this.clienteServi.getClientes();
	// }

	
}
