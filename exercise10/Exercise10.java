package exercise10;

import java.util.Scanner;

public class Exercise10 {
	public static void main(String[] args) {
		/*
		 * 10) Escribir un programa que calcule lo que tiene que cobrar un empleado
		 * sabiendo que se le tiene que aplicar al sueldo una retención del 20%.
		 */
		System.out.print("Introduzca el salario bruto del trabajador: ");
		Scanner entrada = new Scanner(System.in);
		double retencion = 0.2;
		double salarioBruto = entrada.nextDouble();
		double salarioNeto = salarioBruto - (salarioBruto * retencion);
		entrada.close();
		System.out.println("El salario neto del trabajador será de " + salarioNeto + " €.");
	}
}
