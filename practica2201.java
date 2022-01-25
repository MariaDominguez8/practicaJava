package clase2401;

import java.util.Scanner;

public class practica2201 {

	public static void main(String[] param) {
		// Ejercicio 2.3
		// Solicitar cuántos lápices voy a comprar y guardarlo en una variable

		int cantidadLapices;
		float precioUnitario, precioTotal;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de lápices que desee comprar:  ");
		cantidadLapices = scanner.nextInt();

		if (cantidadLapices >= 1000) {

			precioUnitario = 85;
			System.out.println("El costo por lápiz es de " + precioUnitario);
		} else {
			precioUnitario = 90;
			System.out.println("El costo por lápiz es de " + precioUnitario);
		}

		precioTotal = cantidadLapices * precioUnitario;
		System.out.println("El costo total por la cantidad de lápices a comprar es de  " + precioTotal);
	}

}
