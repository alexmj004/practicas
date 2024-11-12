package Clase1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class EjemploColecciones {
//    Lista de ciudades:
    List<String> cities = new ArrayList<>();
//    Interfaz IAeropuerto.
    private IAeropuerto aeropuerto;
    public EjemploColecciones(IAeropuerto aeropuerto)
    {
        this.aeropuerto = aeropuerto;
    }
//    Añade a la lista de ciudades, la lista que se ha generado en cada clase con el método Generador.
    void HacerCosas()
    {
        cities.addAll(aeropuerto.Generador());
        cities.parallelStream().filter(aeropuerto::Filtro).forEach(aeropuerto::Consumidor);
        var coleccionInicial = cities.stream().map(aeropuerto::Funcion);

    }
}
