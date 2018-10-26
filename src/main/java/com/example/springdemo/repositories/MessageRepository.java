package com.example.springdemo.repositories;

import com.example.springdemo.models.Client;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepository extends CrudRepository<Client, Long> {
}
