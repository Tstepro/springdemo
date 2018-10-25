package com.example.springdemo.bootstrap;

import com.example.springdemo.models.Client;
import com.example.springdemo.repositories.ClientRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private ClientRepository clientRepository;

    public DevBootstrap(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {
        Client nextAxiom = new Client("nextAxiom");
        Client Cisco = new Client("cisco");

        this.clientRepository.save(nextAxiom);
        this.clientRepository.save(Cisco);
    }
}
