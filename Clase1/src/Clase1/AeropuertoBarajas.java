package Clase1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AeropuertoBarajas implements IAeropuerto{
    @Override
    public void Consumidor(String cadena) {
        System.out.println(cadena);
    }

    @Override
    public boolean Filtro(String cadena) {
        return cadena.endsWith("d");
    }

    @Override
    public char Funcion(String cadena) {
        return cadena.charAt(0);
    }

    @Override
    public ArrayList<String> Generador() {
        var destinos  = new ArrayList<String>();
        destinos.add("Valladolid");
        destinos.add("Zaragoza");
        destinos.add("Madrid");
        destinos.add("Barcelona");
        return destinos;
    }


}

