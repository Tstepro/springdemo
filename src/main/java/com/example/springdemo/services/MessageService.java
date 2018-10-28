package com.example.springdemo.services;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;


@Service
public class MessageService {

    private String token;
    private String secret;
    private String userID;

    private RestTemplate restTemplate;


    public MessageService() {
        token = System.getenv("BANDWIDTH_TOKEN");
        secret = System.getenv("BANDWIDTH_SECRET");
        userID = System.getenv("BANDWIDTH_USER");
    }

    public void respond() {
        String uri = "https://api.catapult.inetwork.com/v2/users/" + userID + "/messages";

        restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.setBasicAuth(this.token, this.secret);

    }


}
