package Clase2.Stupid;

public class RobotComando extends Robot{
//    Anda a saltos y dispara tipo metralleta.

    @Override
    public void andar() {
        System.out.println("Ando a saltos.");
    }

    @Override
    public void disparar() {
        System.out.println("Disparo tiro metralleta.");;
    }
}
