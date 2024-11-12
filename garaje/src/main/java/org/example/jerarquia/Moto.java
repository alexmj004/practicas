package org.example.jerarquia;

public class Moto implements IAlquilador{
    private String bastidor;
    public Moto(String bastidor){
        this.bastidor = bastidor;
    }
    @Override
    public String dameId() {
        return bastidor;
    }

    @Override
    public double dameImporte(double tiempo) {
        return tiempo*89;
    }
}
