package Practica01;

import java.util.ArrayList;

public class Ciudades implements ICiudades{
    @Override
    public void Consumidor(String cadena) {
        System.out.println("("+cadena+")");

    }

    @Override
    public boolean Filtro(String cadena) {
        if(cadena.endsWith("a")){
            return cadena.endsWith("a");
        }if(cadena.endsWith("a") || cadena.endsWith("o")){
            return cadena.endsWith("a") || cadena.endsWith("o");
        } if(cadena.endsWith("d") || cadena.startsWith("m")){
            return cadena.endsWith("d") || cadena.startsWith("m");
        }else
            return false;


    }

    @Override
    public char Funcion(String cadena) {
        return cadena.charAt(0);
    }

    @Override
    public ArrayList<String> Generador() {
        var ciudades  = new ArrayList<String>() ;
        ciudades.add("Zaragoza");
        ciudades.add("Murcia");
        ciudades.add("Valladolid");
        ciudades.add("Bilbao");
        ciudades.add("Huesca");
        ciudades.add("Barcelona");
        ciudades.add("Madrid");
        ciudades.add("Valencia");

        return ciudades;
    }
}
