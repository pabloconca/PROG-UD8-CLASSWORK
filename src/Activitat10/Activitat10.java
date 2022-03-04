package Activitat10;

import java.util.HashMap;
import java.util.Scanner;

public class Activitat10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String,String> credenciales = new HashMap<>();
        credenciales.put("pablo","prueba");
        int aux = 0;
        do {
            System.out.println("Introduce tu nombre: ");
            String nombre = scanner.next();
            System.out.println("Introduce una contrasenya");
            String contrasenya = scanner.next();
            if (credenciales.containsKey(nombre) && credenciales.containsValue(contrasenya)) {
                System.out.println("Has accedido al area restringida");
                break;
            }
            aux++;
        }while (aux  < 3);
    }
}
