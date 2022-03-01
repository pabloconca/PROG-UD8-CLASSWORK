package Activitat4;

public class Videojuego {
    //si esta alquilado o no
    //metodo q permita alquirar el videojuego
    //metodo q permita saber si un juego esta disponible o no
    //videoclub:
    //videoclub lista videojuegos
    //constructor meter todos lso videojuegos
    //videoclub un metodo que diga si un videojuego esta disponible o no teniendo en cuenta q lo que se va a preguntar del videojuego es el nombre
    private String titulo;
    private String genero;
    private int precio;
    private boolean esMultijugador;
    private boolean estaAlquilado;

    public Videojuego(String titulo, String genero, int precio, boolean esMultijugador, boolean estaAlquilado) {
        this.titulo = titulo;
        this.genero = genero;
        this.precio = precio;
        this.esMultijugador = esMultijugador;
        this.estaAlquilado = estaAlquilado;
    }


}
