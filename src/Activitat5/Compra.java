package Activitat5;

import Activitat5.Produccion.Produccion;

public class Compra {
    private Produccion produccion;
    private Fecha fecha;
    private boolean haFinalizadoVisualizacion;
    private String comentario;

    public Compra(Produccion produccion, Fecha fecha, boolean haFinalizadoVisualizacion, String comentario) {
        this.produccion = produccion;
        this.fecha = fecha;
        this.haFinalizadoVisualizacion = haFinalizadoVisualizacion;
        this.comentario = comentario;
    }

    public Compra(Produccion produccion, Fecha fecha, boolean haFinalizadoVisualizacion) {
        this.produccion = produccion;
        this.fecha = fecha;
        this.haFinalizadoVisualizacion = haFinalizadoVisualizacion;
        this.comentario = "";
    }

    @Override
    public String toString() {
        return produccion.getTitulo()+" - Fecha: "+fecha.toString()+" - Comentario: "+comentario+" ";
    }

    public double getPrecio() {
        return produccion.getPrecio();
    }
}
