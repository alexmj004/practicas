package Clase2.Solid;

public class VisorIngles implements IVisorSuperheroe{
    @Override
    public String muestraSuperheroe(Superhéroe superhéroe) {
        String cadena = "[ "+superhéroe.id+": "+superhéroe.nombre +" ("+superhéroe.superpoder+") ]";
        return cadena;
    }
}
