package org.example.jerarquia;

public class Trastero implements IAlquilador{
    private String letraNumero;

    public Trastero(String letraNumero) {
        this.letraNumero = letraNumero;
    }

    @Override
    public String dameId() {
        return letraNumero;
    }

    @Override
    public double dameImporte(double tiempo) {
        return tiempo * 98;
    }
}
