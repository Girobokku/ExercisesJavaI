package exercise07;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		/*
		 * 7) Crea un programa que almacene tu nombre en una variable y que luego
		 * muestre cuántas letras tiene, cuál es la primera letra y cuál es la última
		 * letra de tu nombre. Hazlo de manera que funcione con cualquier nombre que le
		 * asignes a la variable.
		 */
		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduce tu nombre: ");
		String nombre = entrada.nextLine().toLowerCase();
		int longitud = nombre.length();
		char primeraLetra = nombre.charAt(0);
		char ultimaLetra = nombre.charAt(longitud - 1);
		System.out.println("Tu nombre tiene " + longitud + " letras.");
		System.out.println("La primera letra de tu nombre es: " + primeraLetra);
		System.out.println("La última letra de tu nombre es: " + ultimaLetra);
		entrada.close();
	}
}
