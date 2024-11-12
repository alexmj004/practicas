package org.example.jerarquia;

public class Coche implements IAlquilador{
    String matricula;
    public Coche(String id) {
        this.matricula="2584GMR";
    }

    @Override
    public String dameId() {
        return matricula;
    }

    @Override
    public double dameImporte(double tiempo) {
        return 67*tiempo;
    }
}
