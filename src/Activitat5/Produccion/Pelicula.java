package Activitat5.Produccion;

import Activitat5.Fecha;
import Activitat5.Tipo;

public class Pelicula extends Produccion{
    private static final double PRECIO = 12;
    private String actorPrincipal;
    private String actrizPrincipal;

    //actor y actriz
    public Pelicula(String titulo, Tipo formato, int duracion, Fecha fechaLanzamiento, String actorPrincipal, String actrizPrinzipal) {
        super(titulo, formato, duracion, fechaLanzamiento,PRECIO);
        this.actorPrincipal = actorPrincipal;
        this.actrizPrincipal = actrizPrinzipal;

    }
    //actor
    public Pelicula(String titulo, Tipo formato, int duracion, Fecha fechaLanzamiento, String actorPrincipal) {
        super(titulo, formato, duracion, fechaLanzamiento,PRECIO);
        this.actorPrincipal = actorPrincipal;
    }
    //actriz
    public Pelicula(String titulo, Tipo formato, int duracion, String actrizPrincipal, Fecha fechaLanzamiento){
        super(titulo, formato, duracion, fechaLanzamiento,PRECIO);
        this.actrizPrincipal = actrizPrincipal;
    }
    @Override
    public String toString() {
        if (actorPrincipal != null){
            return super.toString()+ "actorPrincipal = "+actorPrincipal+ '\'' + '}';
        }else if (actrizPrincipal != null){
            return super.toString()+ "actorPrincipal = "+actrizPrincipal+ '\'' + '}';
        }else{
            return "actorPrincipal='" + actorPrincipal + '\'' +
                    ", actrizPrincipal='" + actrizPrincipal + '\'' +
                    '}';
        }
    }
    public Pelicula(String titulo, Tipo formato, Fecha fechaLanzamiento) {
        super(titulo, formato, 4600, fechaLanzamiento,PRECIO);
    }
}
