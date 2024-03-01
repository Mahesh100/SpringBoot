package com.SpringBoot.Practice.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
public class PizzaDelivery {

    @GetMapping("/getPizza")
    public String getPizza(){
        return "Pizza is getting delivered....!";
    }
}
