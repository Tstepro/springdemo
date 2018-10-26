package com.example.springdemo.controllers;

import com.example.springdemo.models.Text;
import com.example.springdemo.models.Client;
import com.example.springdemo.repositories.ClientRepository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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

    @RequestMapping(value="/messages", method = RequestMethod.POST)
    public void updateMessages(@RequestBody Text text) {
        System.out.println(text);
    }


}
