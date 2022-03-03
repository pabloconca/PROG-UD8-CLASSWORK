package Activitat8.Foros;

import Activitat8.Entradas;
import Activitat8.Foros.Foro;

import java.util.HashSet;
import java.util.LinkedList;

public class ForoInteligente extends Foro {
    private HashSet<String> palabrasProhibidas;
    private HashSet<String> spam;
    private LinkedList<Entradas> entradas;

    public ForoInteligente(String nombre,HashSet<String> palabrasProhibidas) {
        super(nombre);
        this.palabrasProhibidas = palabrasProhibidas;
        this.spam = new HashSet<>();
        this.entradas = new LinkedList<>();
    }
    @Override
    public boolean registrarEntrada(String mensaje){
        Entradas entradas = new Entradas(mensaje);
        for (String palabras: palabrasProhibidas) {
            if (mensaje.contains(palabras)){
                spam.add(mensaje);
                return false;
            }
        }
        this.entradas.addLast(entradas);

        return true;
    }

    @Override
    public String toString() {
        int numSpam  = spam.size();
        return "---- Foro "+nombre + " ----\n" + entradas +"\nSucesos spam: "+ numSpam;
    }

}
