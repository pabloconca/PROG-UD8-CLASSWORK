package Activitat8;

import Activitat8.Foros.Foro;
import Activitat8.Foros.ForoInteligente;

import java.util.HashSet;
import java.util.LinkedList;

public class TestForo {
    public static void main(String[] args) {
        HashSet<String> palabras = new HashSet();
        HashSet<String> palabras2 = new HashSet();
        palabras.add("facebook");
        palabras.add("thepiratebay");
        palabras2.add("fotos");
        palabras2.add("ataque");
        Foro foro = new Foro("basico1");
        ForoInteligente foroInteligente = new ForoInteligente("inteligente1",palabras);
        ForoInteligente foroInteligente2 = new ForoInteligente("inteligente2",palabras2);
        LinkedList<Foro> listaForos = new LinkedList<>();

        listaForos.add(foro);
        listaForos.add(foroInteligente);
        listaForos.add(foroInteligente2);
        foro.registrarEntrada("¿Habéis utilizado el servicio de Instagram, ayer me saltó un error en el servicio?");
        foro.registrarEntrada("Los de thepiratebay informaron que podría haber sido un ataque");
        foro.registrarEntrada("Algunos usuarios compartieron la publicación en facebook junto con una foto en la que aparecían los causantes del problema. ¡Era un error de programación!");
        foroInteligente.registrarEntrada("¿Habéis utilizado el servicio de Instagram, ayer me saltó un error en el servicio?");
        foroInteligente.registrarEntrada("Los de thepiratebay informaron que podría haber sido un ataque");
        foroInteligente.registrarEntrada("Algunos usuarios compartieron la publicación en facebook junto con una foto en la que aparecían los causantes del problema. ¡Era un error de programación!");
        foroInteligente2.registrarEntrada("¿Habéis utilizado el servicio de Instagram, ayer me saltó un error en el servicio?");
        foroInteligente2.registrarEntrada("Los de thepiratebay informaron que podría haber sido un ataque");
        foroInteligente2.registrarEntrada("Algunos usuarios compartieron la publicación en facebook junto con una foto en la que aparecían los causantes del problema. ¡Era un error de programación!");

        System.out.println(foro.toString().replace(",","").replace("[","").replace("]",""));
        System.out.println(foroInteligente.toString().replace(",","").replace("[","").replace("]",""));
        System.out.println(foroInteligente2.toString().replace(",","").replace("[","").replace("]",""));
    }
}
