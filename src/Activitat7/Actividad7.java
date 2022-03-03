package Activitat7;

import java.util.ArrayList;
import java.util.HashSet;

public class Actividad7 {
    public static void main(String[] args) {
        ArrayList<Participante>prueba1 = new ArrayList<>();
        prueba1.add(new Participante("54545k", "El jose",10.12f));
        prueba1.add(new Participante("5454534k", "Josejas",12.23f));
        prueba1.add(new Participante("54534245k", "Ermanuel",15.30f));
        prueba1.add(new Participante("3435334L", "Alberto",18.30f));

        ArrayList<Participante>prueba2 = new ArrayList<>();
        prueba2.add(new Participante("54545k", "El jose",10.12f));
        prueba2.add(new Participante("5454534k", "Josejas",12.23f));
        prueba2.add(new Participante("54534245k", "Ermanuel",15.30f));
        prueba2.add(new Participante("3435334L", "Alberto",18.30f));

        HashSet<Participante> participantes = new HashSet<>();
        for (Participante partipante:prueba1) {
            participantes.add(partipante);
        }
        for (Participante partipante:prueba2) {
            participantes.add(partipante);
        }
        for (Participante participante:participantes) {
            System.out.println(participantes);
        }

    }

}
