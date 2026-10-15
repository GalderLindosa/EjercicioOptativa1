package main;

import java.util.Scanner;
 
public class Principal4 {
 
    public static void main(String[] args) {
 
        try {
 
           Controlador4.controlador();
 
        } catch (RuntimeException e) {
 
            Exceptcion4.manejarExcepcion(e);
        }
 
        System.out.println("Aplicación terminada");
    }
 
    // Simula un controlador (capa del controlador)

 

 

 

}
