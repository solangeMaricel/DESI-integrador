package com.example.pasajes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pasajes.entity.Ticket;
import com.example.pasajes.repository.ITicketRepository;

@Service
public class TicketService implements ITicketService {

    @Autowired
    private ITicketRepository ticketRepo;

    @Override
    public void cargarPasaje(Ticket ticket) {
        ticketRepo.save(ticket);
    }

}
