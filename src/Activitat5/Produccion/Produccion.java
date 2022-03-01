package Activitat5.Produccion;

import Activitat5.Fecha;
import Activitat5.Tipo;

public abstract class Produccion {
    private String titulo;
    private Tipo formato;
    protected int duracion;
    private String descripcion;
    private Fecha fechaLanzamiento;
    private double precio;

    public Produccion(String titulo, Tipo formato, int duracion, Fecha fechaLanzamiento,double precio) {
        this.titulo = titulo;
        this.formato = formato;
        this.duracion = duracion;
        this.fechaLanzamiento = fechaLanzamiento;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Produccion{" +
                "titulo='" + titulo + '\'' +
                ", formato='" + formato + '\'' +
                ", duracion=" + duracion +" ";
    }

    public String getTitulo() {
        return titulo;
    }

    public double getPrecio() {
        return precio;
    }
}