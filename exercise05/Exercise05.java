package exercise05;

public class Exercise05 {
	public static void main(String[] args) {
		/*
		 * 5) Cálculo del área y el perímetro de un rectángulo de 2.5 cm de largo y de 4
		 * cm de alto.
		 * 
		 */
		double largo = 2.5;
		double alto = 4;
		double area = largo * alto;
		double perimetro = (2 * largo) + (2 * alto);
		System.out.println(
				"El área del rectángulo es: " + area + "." + "\nEl perímetro del rectángulo es: " + perimetro + ".");
	}
}
