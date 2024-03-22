package seresTerrestres;
import CrearSeres.Creador;
import CrearSeres.seresVivos;
import SeresCelestiales.SerCelestial;

public class Humano extends seresVivos  implements Creador,SerTierra, SerCelestial {
    String nombre;
    String tipo;
    public Humano(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    @Override
    public void CrearSerVivo() {
        System.out.println("humano");
    }
    @Override
    public void nacer(){
        System.out.println("ha nacido un humano");
    }

    @Override
    public void resurgir() {
        System.out.println("El humano ha resurgido");
    }

    @Override
    public void morir() {
        System.out.println("el Humano ha muerto");
    }

    @Override
    public void reproducirse() {
        System.out.println("el humano se ha reproducido ");
    }

    @Override
    public void crecer(){
        System.out.println("el humano ha crecido");

    }

    public void setTipo(String tipo) {
        this.tipo=tipo;
    }

    public void setNombre(String nombre) {
        this.nombre=nombre;
    }

    @Override
    public void CambiarDimension() {
        System.out.println("el humano ha cambiado de dimensión");
    }

    @Override
    public void volar() {

    }

    @Override
    public void inmortalizarse() {

    }

    @Override
    public void aterrizar() {

    }
}
