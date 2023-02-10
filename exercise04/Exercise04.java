package exercise04;

import java.util.Scanner;

public class Exercise04 {
	public static void main(String[] args) {
		final double iva = 0.21;
		double compra = 0;
		System.out.print("Introduzca la base imponible: ");
		Scanner entrada = new Scanner(System.in);
		compra = entrada.nextDouble();
		while (compra <= 0) {
			System.out.println("El valor de la compra debe ser superior a 0.");
			System.out.print("Introduzca el valor de su compra sin IVA: ");
			compra = entrada.nextDouble();
		}
		if (compra > 0) {
			System.out.println("--------------------------------------------");
		}
		double compraConIva = compra + (compra * iva);
		System.out.printf("La compra con IVA es: " + "%22.2f",compraConIva);
		entrada.close();
	}
}
