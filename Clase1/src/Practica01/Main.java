package Practica01;

import Clase1.AeropuertoBarajas;
import Clase1.AeropuertoDeMunich;
import Clase1.EjemploColecciones;
import Clase1.IAeropuerto;

public class Main {
    public static void main(String[] args) {
        String ciudad = "Valladolid";
        ICiudades iCiudades = null;

        iCiudades=new Ciudades();


        Coleccion miCol = new Coleccion(iCiudades);
        miCol.HacerCosas();
    }
}
