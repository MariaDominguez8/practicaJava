package clase2401;

import java.util.Scanner;

public class practicados2201 {

	public static void main(String[] param) {

		// Ejercicio 5 cantidad mayor de las tres.

		int cantidad1, cantidad2, cantidad3;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese la cantidad 1:  ");
		cantidad1 = scanner.nextInt();

		System.out.println("Ingrese la cantidad 2 : ");
		cantidad2 = scanner.nextInt();

		System.out.println("Ingrese la cantidad 3 : ");
		cantidad3 = scanner.nextInt();

		if (cantidad1 > cantidad2 && cantidad1 > cantidad3) {
			System.out.println("La cantidad mayor es " + cantidad1);
		} else if (cantidad2 > cantidad1 && cantidad2 > cantidad3) {
			System.out.println("La cantidad mayor es " + cantidad2);

		} else {
			System.out.println("La cantidad mayor es " + cantidad3);
		}
	}
}
