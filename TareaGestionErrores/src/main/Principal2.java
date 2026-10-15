package main;

public class Principal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer numero = null;
		int num;

		try {
			num=5/numero;
		} catch (NullPointerException e) {
			System.out.println("Error el numero por el que intentas dividir es null");
		}


	}

}
