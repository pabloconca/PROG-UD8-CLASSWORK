package Activitat7;

import java.util.Objects;

public class Participante {
    private String dni;
    private String nombre;
    private float tiempo;

    public Participante(String dni, String nombre, float tiempo) {
        this.dni = dni;
        this.nombre = nombre;
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "dni='" + dni + '\'' +
                ", nombre='" + nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Participante that = (Participante) o;
        return Objects.equals(dni, that.dni) && Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni, nombre);
    }
}
