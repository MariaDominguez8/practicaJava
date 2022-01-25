package clase2401;

public class Clase240122 {

	public static void main(String[] param) {

		int maximo = 10;
		float precio;
		double sueldo;
		boolean estaAbierto = maximo < 9; // true
		int dias = 5;
		boolean segundaCondicion = (dias < 7 || dias == 0);
		if (estaAbierto && segundaCondicion) {
			System.out.println("esta abierto");

		}
		// fin del if

		int i = 0;
		int j = 0;
		while (i < maximo) {
			System.out.println(i);
			while (j < 10) {
				System.out.print(j + " ");
				j++;
			}
			j = 0;
			System.out.println();
			i++;
		}
		int valor = 2; // valor por defecto del switch
		switch (valor) {
		case 10:
			System.out.println(10);
			break;
		case 20:
			System.out.println(20);
			break;
		case 30:
			System.out.println(30);
			break;
		default:
			System.out.println("resto");
			break;
		}
		for (int indice = 0; indice < maximo; indice++) {
			System.out.println("indice: " + indice);
		} // tiene que si o si tener parametros separados por coma

		System.out.println("fin");
	}

}
