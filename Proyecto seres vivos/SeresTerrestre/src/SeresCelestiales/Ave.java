package SeresCelestiales;

import CrearSeres.Creador;
import CrearSeres.CrearSeresVivos;
import CrearSeres.seresVivos;

public class Ave extends seresVivos implements Creador,SerCelestial {
    @Override
    public void CrearSerVivo() {
        System.out.println("ave");
    }

    private String nombre;
    private String tipo;

    public Ave(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public  void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void CambiarDimension() {
        //no se utiliza para esta clase
    }

    @Override
    public void volar() {
        System.out.println("el ave inicia su vuelo");
    }

    @Override
    public void inmortalizarse() {
        //no se utiliza para esta clase
    }

    public void aterrizar() {
        System.out.println("el ave ha aterrizado");
    }
    @Override
    public void nacer(){
        System.out.println("el ave ha nacido");
    }
}

