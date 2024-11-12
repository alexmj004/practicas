package org.example.factorias;

import org.example.jerarquia.*;

public class FactoriaAlquilablesV02 implements IFactoriaAlquilables{

    @Override
    public IAlquilador dameInstancia(String id, TipoAlquilable tipo) {
        if(id.length()==0){
            return null;
        }else{
            switch (tipo){
                case Moto: return new Moto(id);

                case Coche: return new Coche(id);

                case Trastero: return new Trastero(id);

                default:
                    return null;

            }
        }

    }
}
