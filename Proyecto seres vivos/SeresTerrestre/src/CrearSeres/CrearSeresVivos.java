package CrearSeres;

import SeresCelestiales.Ave;
import seresTerrestres.Animal;
import seresTerrestres.Humano;
//Esta sería mi clase fabrica
public class CrearSeresVivos {
    public static Creador CrearSerVivo(String TipoSer) {
        if (TipoSer.equalsIgnoreCase("ave")) {
            return new Ave(null,null);
        } else if (TipoSer.equalsIgnoreCase("humano")) {
            return new Humano(null,null);
        } else if (TipoSer.equalsIgnoreCase("animal")) {
            return new Animal(null,null);
        } else {
            throw new IllegalArgumentException("Este ser no puede ser creado todavía");
        }
    }
}
