package main;

import utilidades.Utilidades;

public class Principal3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=10;
		int num2=0;
		int operacion;
		char operando;
		
		
		System.out.println("Di que quieres hacer");
		operando=Utilidades.leerChar();
		
		
		
		
		try {
			operacion= 10/0;
		} catch(ArithmeticException e) {
			System.out.println("NO SE PUEDE DIVIDIR ENTRE 0");
		}
		
		
		
	}


}
