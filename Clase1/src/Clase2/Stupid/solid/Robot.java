package Clase2.Stupid.solid;

import Clase2.Stupid.conInterface.IDisparar;

public class Robot {
    IAndar desplazamiento;
    IDisparar disparo;

    public Robot(IAndar desplazamiento, IDisparar disparo) {
        this.desplazamiento = desplazamiento;
        this.disparo = disparo;
    }

    public IAndar getDesplazamiento() {
        return desplazamiento;
    }

    public void setDesplazamiento(IAndar desplazamiento) {
        this.desplazamiento = desplazamiento;
    }

    public IDisparar getDisparo() {
        return disparo;
    }

    public void setDisparo(IDisparar disparo) {
        this.disparo = disparo;
    }
}
