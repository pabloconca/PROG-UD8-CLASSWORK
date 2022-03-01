package Activitat5.Produccion;

import Activitat5.Fecha;
import Activitat5.Tipo;

public class Documental extends Produccion{
    private static final double PRECIO = 15;
    private String investigador;
    private String tema;

    @Override
    public String toString() {
        return super.toString()+
                "investigador='" + investigador + '\'' +
                ", tema='" + tema + '\'' +
                '}';
    }

    public Documental(String titulo, Tipo formato, int duracion, Fecha fechaLanzamiento, String investigador, String tema) {
        super(titulo, formato, duracion, fechaLanzamiento,PRECIO);
        this.investigador = investigador;
        this.tema = tema;
    }
}
