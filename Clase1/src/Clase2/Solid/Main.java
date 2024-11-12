package Clase2.Solid;

public class Main {
    public static void main(String[] args) {
        Superhéroe Spiderman = new Superhéroe(1,"Spiderman","Agilidad");

//        Instancias un objeto de tipo VisorLatino/VisorInglés pero con la funcionalidad de la interface:
        IVisorSuperheroe iv = null;
        IContextual iContextual = null;
        String entorno = "España";
        String almacenamiento = "Disco";


        if (entorno.equals("España")) {
            iv = new VisorLatino();
            iContextual = new AlamcenamientoDisco();
        } else{
            iv = new VisorIngles();
            iContextual = new AlamcenamientoDisco();
        }
        Superhéroe sp = iContextual.leer(new Superhéroe(2,"Capitán América","Fuerza"));
        System.out.println(iv.muestraSuperheroe(sp));

    }
}
