package Clase2.Stupid.conInterface;

public class RobotComando implements IAndar,IDisparar{
    @Override
    public void andar() {
        System.out.println("Ando como un robot.");
    }

    @Override
    public void disparar() {
        System.out.println("Disparo tipo metralleta.");
    }
}
