package Activitat8;

import java.time.LocalDateTime;

public class Entradas {
    private String descripcion;
    private LocalDateTime fecha;

    public Entradas(String descripcion) {
        LocalDateTime lt = LocalDateTime.now();
        this.descripcion = descripcion;
        this.fecha = lt;
    }

    @Override
    public String toString() {
        return fecha + " - "+ descripcion + "\n";
    }

}
