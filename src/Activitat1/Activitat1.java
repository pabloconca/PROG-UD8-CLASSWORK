package Activitat1;

import java.util.ArrayList;
import java.util.Scanner;

public class Activitat1 {
    public static void main(String[] args) {
        ArrayList<String> arcoiris = new ArrayList<>();
        arcoiris.add("Rojo");
        arcoiris.add("Amarillo");
        arcoiris.add("Naranja");
        arcoiris.add("Verde");
        arcoiris.add("Azul");
        arcoiris.add("Añil");
        arcoiris.add("Violeta");

        System.out.println("El arcoiris tiene " + arcoiris.size() + " colores");
        System.out.println("El color Rojo está en la posición " + arcoiris.indexOf("Rojo"));

        buscarColor(arcoiris);

        for (int i = 0; i < arcoiris.size(); i++) {
            System.out.println(arcoiris.get(i));
        }
    }

    private static void buscarColor(ArrayList<String> arcoiris) {
        System.out.println("Dime un color: ");
        Scanner scanner = new Scanner(System.in);
        String color = scanner.next();

        if (arcoiris.contains(color)) {
            System.out.println("El color " + color + " sí existe");
        } else {
            arcoiris.add(color);
        }
    }

}
