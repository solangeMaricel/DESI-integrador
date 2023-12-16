package com.example.pasajes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.pasajes.entity.Ticket;
import com.example.pasajes.service.ITicketService;

@Controller
public class TicketController {

    @Autowired
    private ITicketService ticketServi;

    @PostMapping("/tickets")
    public String guardarTicket(@ModelAttribute Ticket ticket, ModelMap model, @RequestParam String action){
        if (action.equals("vender")) {
			ticketServi.cargarPasaje(ticket);
			return "clientes/pasaje";
		}
        if (action.equals("cancel")) {
			model.clear();
			return "redirect:/";
		}
		return "redirect:/";
    }

}
