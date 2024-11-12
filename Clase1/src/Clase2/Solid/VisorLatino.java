package Clase2.Solid;

public class VisorLatino implements IVisorSuperheroe{
    @Override
    public String muestraSuperheroe(Superhéroe superhéroe) {
        String cadena = "{ "+superhéroe.id+": "+superhéroe.nombre +" ("+superhéroe.superpoder+") }";
        return cadena;
    }
}
