package org.example.factorias;

import org.example.jerarquia.IAlquilador;
import org.example.jerarquia.TipoAlquilable;

public interface IFactoriaAlquilables {
    IAlquilador dameInstancia(String id, TipoAlquilable tipo);

}
