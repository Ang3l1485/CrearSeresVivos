import java.util.*;
import CrearSeres.CrearSeresVivos;
import CrearSeres.Creador;
import seresTerrestres.*;
import SeresCelestiales.*;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("ingrese el ser que desea crear hoy");
        String Ser= input.next();
        Creador S1 = CrearSeres.CrearSeresVivos.CrearSerVivo(Ser);
        S1.CrearSerVivo();
        //Aquí me doy cuenta que no se pueden utilizar los metodos propios de la clase y solamente se puede utilizar
        //los métodos del creador(la interfaz) y al momento de querer utilizar otros metodos
        //la unica solucion que al investigar soluciona esto sin afectar la interfaz Creador
        //es hacer casting de las funciones
            if (S1 instanceof Animal) {
                Animal animal = (Animal) S1;

                System.out.println("ingrese el tipo de animal que quiere crear");
                String tipo= input.next();
                animal.setTipo(tipo);
                System.out.println("ingrese el nombre que le dara a este animal");
                String nombre= input.next();
                animal.setNombre(nombre);
                animal.nacer();
            } else if (S1 instanceof Ave) {
                Ave Ave = (Ave) S1;

                System.out.println("ingrese el tipo de ave que quiere crear");
                String tipo= input.next();
                Ave.setTipo(tipo);
                System.out.println("ingrese el nombre que le dara a este animal");
                String nombre= input.next();
                Ave.setNombre(nombre);
                Ave.nacer();
            } else if (S1 instanceof Humano) {
                Humano humano = (Humano) S1;
                humano.nacer();
                System.out.println("ingrese el tipo de humano que quiere crear");
                String tipo= input.next();
                humano.setTipo(tipo);
                System.out.println("ingrese el nombre que le dara a este animal");
                String nombre= input.next();
                humano.setNombre(nombre);
                humano.nacer();
                humano.CambiarDimension();
            } else {
                System.out.println("El objeto no es una instancia de Animal, Ave o Humano");
            }
        }
    }

