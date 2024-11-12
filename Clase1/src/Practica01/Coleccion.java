package Practica01;

import java.util.ArrayList;
import java.util.List;

public class Coleccion {

    List<String> ciudades = new ArrayList();
    private ICiudades iciudades;
    public Coleccion(ICiudades iciudades){
        this.iciudades = iciudades;
    }

   void HacerCosas(){
        ciudades.addAll(iciudades.Generador());
        ciudades.parallelStream().filter(iciudades::Filtro).forEach(iciudades::Consumidor);
        ciudades.stream().map(iciudades::Funcion);
   }


}
