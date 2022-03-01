package Activitat2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Activitat2 {
    private static final int NUM_COMPANYEROS = 6;
    public static void main(String[] args) {
        ArrayList<String> companyeros = new ArrayList<>(NUM_COMPANYEROS);
        companyeros.add("Blas");
        companyeros.add("Pedro");
        companyeros.add("Izan");
        companyeros.add("Pablo");
        companyeros.add("Samuel");
        companyeros.add("Carolina");
        Iterator iterator = companyeros.iterator();

        while (iterator.hasNext()) {
            String nombre = (String)iterator.next();
            System.out.println(nombre);
        }

        buscarCompanyero(companyeros);
    }
    private static void buscarCompanyero(ArrayList<String> nombres) {
        System.out.println("Dime un nombre: ");
        Scanner scanner = new Scanner(System.in);
        String nombre = scanner.next();

        if (nombres.contains(nombre)) {
            System.out.println(nombre + " es un compañero de clase");
        } else {
            System.out.println(nombre + " no es un compañero de clase");
        }
    }

}
