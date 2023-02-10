package exercise09;

import java.util.Scanner;

public class Exercise09 {
	public static void main(String[] args) {
		/*
		 * 9) Calcular el precio medio de un producto, calculado a partir del precio del
		 * mismo en tres establecimientos distintos. Los precios para el cálculo son
		 * introducidos por el usuario.
		 */
		System.out.print("Introduzca el precio del producto en tres establecimientos diferentes: ");
		Scanner entrada = new Scanner(System.in);
		double precio1 = entrada.nextDouble();
		double precio2 = entrada.nextDouble();
		double precio3 = entrada.nextDouble();
		double precioMedio = (precio1 + precio2 + precio3) / 3;
		System.out.println("----------------------------------------");
		System.out.println("El precio medio del producto es de: " + precioMedio + ".");
		entrada.close();
	}
}
