package exercise08;

import java.util.Scanner;

public class Exercise08 {
	public static void main(String[] args) {
		/*
		 * 8) Cáculo del área de un triángulo pidiendo por teclado los valores de la
		 * base y de la altura.
		 */
		System.out.print("Introduzca la base del triángulo: ");
		Scanner entrada = new Scanner(System.in);
		double base = entrada.nextDouble();
		System.out.print("Introduzca la altura del triángulo: ");
		double altura = entrada.nextDouble();
		double area = (base * altura) / 2;
		System.out.println("El área del triángulo introducido es de: " + area);
		entrada.close();
	}
}
