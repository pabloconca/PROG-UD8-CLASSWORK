package Activitat5.Produccion;

import Activitat5.Fecha;
import Activitat5.Tipo;

public class Serie extends Produccion{
    private static final double PRECIO = 24;
    private int temporada;
    private int capitulos;

    @Override
    public String toString() {
        return super.toString()+
                "temporada=" + temporada +
                ", capitulos=" + capitulos +
                '}';
    }

    public Serie(String titulo, Tipo formato, int duracion, Fecha fechaLanzamiento, int temporada, int capitulos) {
        super(titulo, formato, duracion, fechaLanzamiento,PRECIO);
        this.temporada = temporada;
        this.capitulos = capitulos;
    }

    public Serie(String titulo, Tipo formato, Fecha fechaLanzamiento) {
        super(titulo, formato, 2400, fechaLanzamiento,PRECIO);
    }
}
