package Clase2.Solid;

import Practica01.ICiudades;

public class AlamcenamientoDisco implements IContextual {

    @Override
    public Superhéroe leer(Superhéroe superH) {
        return new Superhéroe(8,"Superman","Supertodo");
    }
}
