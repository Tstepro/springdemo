package com.example.springdemo.controllers;

import com.example.springdemo.models.Client;
import com.example.springdemo.repositories.ClientRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientController {

    private ClientRepository clientRepository;

    public ClientController(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @RequestMapping(value = "/clients", method = RequestMethod.GET)
    public Iterable<Client> getClients() {
         return clientRepository.findAll();

    }


}
