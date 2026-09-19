package main;

import java.io.IOException;

import banco.Banco;
import banco.Cuenta;
import banco.GestorFicheros;
import banco.TransferenciaException;

public class principal5 {
	public static void main(String[] args) throws IOException, TransferenciaException { 

		Cuenta cuenta1 = new Cuenta("Ana", 1000); 
		Cuenta cuenta2 = new Cuenta("Luis", 500); 

		Banco banco = new Banco(); 

		banco.transferir(cuenta1, cuenta2, 300); 

		System.out.println( 
				"Saldo Ana: " + cuenta1.getSaldo()); 

		System.out.println( 
				"Saldo Luis: " + cuenta2.getSaldo()); 

		GestorFicheros gestor = new GestorFicheros(); 

		gestor.comprobarFichero(); 
	} 

}
