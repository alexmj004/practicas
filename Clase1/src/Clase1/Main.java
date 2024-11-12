package Clase1;

public class Main {
    public static void main(String[] args) {
        String pais = "India";
        IAeropuerto aeropuerto = null;
        if (pais.equals("España"))
        {
            aeropuerto = new AeropuertoBarajas();
        }
        else
        {
            aeropuerto = new AeropuertoDeMunich();
        }
        EjemploColecciones miCol = new EjemploColecciones(aeropuerto);
        miCol.HacerCosas();
    }
}
