package Clase2.Solid;

public class Superhéroe {
    public int id;
    public String nombre,superpoder;

    public Superhéroe(int id, String nombre, String superpoder) {
        this.id = id;
        this.nombre = nombre;
        this.superpoder = superpoder;
    }

    public Superhéroe() {
    }

/* La clase solo tiene que construir objetos, el resto de funcionalidades tenemos que implementarlos
    en una interfaz.*/
    @Override
    public String toString() {
        return "Superhéroe{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", superpoder='" + superpoder + '\'' +
                '}';
    }

}
