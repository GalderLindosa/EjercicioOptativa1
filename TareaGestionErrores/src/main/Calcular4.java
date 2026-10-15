package main;

import java.util.Scanner;

public class Calcular4 {
    // Simula una operación de negocio (capa de negocio)
    public static void calcular() {
 
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Introduce un número: ");
        int numero = Integer.parseInt(sc.nextLine());
 
        int resultado = 100 / numero;
 
        System.out.println("Resultado: " + resultado);
    }
}
