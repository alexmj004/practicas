package Clase1;

import java.util.ArrayList;

public class AeropuertoDeMunich implements IAeropuerto{
    @Override
    public void Consumidor(String cadena) {
        System.out.println("Aleman:" + cadena);
    }

    @Override
    public boolean Filtro(String cadena) {
        return cadena.endsWith("h");
    }

    @Override
    public char Funcion(String cadena) {
        return cadena.charAt(0);
    }

    @Override
    public ArrayList<String> Generador(){
        var destinos  = new ArrayList<String>() ;
        destinos.add("Munich");
        destinos.add("Moncheglaba");
        destinos.add("Swuaysah");
        destinos.add("Berlin");
        return destinos;
    }
}

