package com.example.demo.controllers;

import com.example.demo.services.IServicio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class DemoController {

    private IServicio servicio;
    DemoController(IServicio servicio){
        this.servicio = servicio;
    }

    @GetMapping
    public double prueba(){
        return servicio.opera(4,5);
    }
}
