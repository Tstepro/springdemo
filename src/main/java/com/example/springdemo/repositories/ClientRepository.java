package com.example.springdemo.repositories;

import com.example.springdemo.models.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Client, Long> {
}
