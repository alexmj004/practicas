package Clase1;

import Clase1.IAeropuerto;

import java.util.ArrayList;

public class AeropuertoDeDelhi implements IAeropuerto {
    @Override
    public void Consumidor(String cadena) {
        System.out.println("indian: "+cadena);
    }

    @Override
    public boolean Filtro(String cadena) {
        return cadena.endsWith("i");
    }
    @Override
    public char Funcion(String cadena) {
        return cadena.charAt(0);
    }

    @Override
    public ArrayList<String> Generador() {
        var destinos  = new ArrayList<String>() ;
        destinos.add("Delhi");
        destinos.add("Mumbai");
        destinos.add("Goa");
        destinos.add("Pune");
        return destinos;
    }
}
