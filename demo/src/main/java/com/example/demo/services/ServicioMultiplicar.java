package com.example.demo.services;

import org.springframework.stereotype.Service;

@Service
public class ServicioMultiplicar implements IServicio{
    @Override
    public double opera(double val1, double val2) {
        return val1*val2;
    }
}
