package com.example.demo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class ServicioExponenciacion implements IServicio{
    @Override
    public double opera(double val1,double val2){
        return Math.pow(val1,val2);
    }
}
