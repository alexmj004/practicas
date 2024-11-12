package org.example.jerarquia;

import java.util.ArrayList;

public class Garaje {
    ArrayList<IAlquilador> clientes = new ArrayList<>();

    public void add(IAlquilador cliente){
        clientes.add(cliente);
    }


}
