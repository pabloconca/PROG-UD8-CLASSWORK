package Activitat3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Activitat3 {
    private static final int MAX_NUMEROS = 50;
    private static final int MAX_NUMERO = 100;
    public static void main(String[] args) {

        ArrayList<Integer>numeros = crearArrayAleatorio();
        System.out.println(numeros.toString());
        System.out.println("La suma es "+calcularSuma(numeros));
        System.out.println("La media es "+calcularMedia(numeros));
        System.out.println("El maximo es "+calcularMaximo(numeros));
        System.out.println("El minimo es "+calcularMinimo(numeros));
    }
    private static ArrayList<Integer> crearArrayAleatorio(){
        ArrayList<Integer> numerosAleatorios = new ArrayList<>(MAX_NUMEROS);
        for (int i = 0; i < MAX_NUMEROS ; i++) {
            Random random = new Random();
            numerosAleatorios.add(random.nextInt(MAX_NUMERO + 1));
        }
        return numerosAleatorios;
    }
    private static int calcularMedia(ArrayList<Integer>numeros){
        return calcularSuma(numeros) / numeros.size();
    }
    private static int calcularSuma(ArrayList<Integer>numeros){
        int suma = 0;
        for (Integer numero: numeros) {
            suma += numero;
        }
        return suma;
    }
    private static int calcularMaximo(ArrayList<Integer>numeros){
        int maximo = Integer.MIN_VALUE;
        for (Integer numero: numeros) {
            if (numero > maximo){
                maximo = numero;
            }
        }
        return maximo;
    }
    private static int calcularMinimo(ArrayList<Integer>numeros){
        int minimo = Integer.MAX_VALUE;
        Iterator iterator = numeros.iterator();
        while (iterator.hasNext()){
            int numero = (Integer)iterator.next();
            if (numero < minimo){
                minimo = numero;
            }
        }
        return minimo;
    }
}
