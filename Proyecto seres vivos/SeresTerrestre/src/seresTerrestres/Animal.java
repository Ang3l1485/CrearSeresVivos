package seresTerrestres;

import CrearSeres.Creador;
import CrearSeres.seresVivos;
import seresTerrestres.SerTierra;

public class Animal extends seresVivos implements Creador, SerTierra {

    private String tipo;
    private String nombre;


    public Animal(String tipo, String nombre) {
        this.tipo = tipo;
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public void CrearSerVivo() {
        System.out.println("animal");
    }

    @Override
    public void nacer() {
        System.out.println("ha nacido un/una " + tipo + " con el nombre de " + nombre);
    }

    @Override
    public void resurgir() {
        System.out.println(nombre + " ha resurgido");
    }

    @Override
    public void crecer() {
        System.out.println("el/la " + tipo + " ha nacido");
    }

    @Override
    public void reproducirse() {
        System.out.println(nombre + " se ha reproducido ");
    }

    @Override
    public void morir() {
        System.out.println("ha muerto");
    }
}

