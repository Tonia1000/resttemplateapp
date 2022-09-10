package com.neogedom.resttemplateapp.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neogedom.resttemplateapp.model.Greeting;

@RestController
@RequestMapping(value = "/greeting")
public class GreetingController {

    @GetMapping
    public ResponseEntity<Greeting> getGreeting(){
        Greeting greeting = new Greeting();
        return ResponseEntity.ok(greeting);

    }
}
