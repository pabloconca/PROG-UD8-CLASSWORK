package Activitat8.Foros;

import Activitat8.Entradas;

import java.util.LinkedList;

public class Foro {
    protected String nombre;
    private LinkedList<Entradas> entradas;

    public Foro(String nombre) {
        this.nombre = nombre;
        this.entradas = new LinkedList<>();
    }
    public boolean registrarEntrada(String mensaje){
        Entradas entradas = new Entradas(mensaje);
        this.entradas.addLast(entradas);
        return true;
    }

    @Override
    public String toString() {
        return "---- Foro "+nombre + " ----\n" + entradas;
    }
}
