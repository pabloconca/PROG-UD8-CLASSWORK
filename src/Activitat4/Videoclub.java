package Activitat4;

import java.util.ArrayList;

public class Videoclub {
    private static final int CAPACIDAD = 2;
    private ArrayList<Videojuego> videojuegos;

    public Videoclub(ArrayList<Videojuego> videojuegos) {
        Videojuego videojuego1 = new Videojuego("Fortnite","Accion",40,true,true);
        Videojuego videojuego2 = new Videojuego("Fifa","Deportes",50,true,true);
        this.videojuegos = new ArrayList<>(CAPACIDAD);
        videojuegos.add(videojuego1);
        videojuegos.add(videojuego2);
    }
}
