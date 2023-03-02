package Principal;

import java.util.Scanner;

public class Clase1Ejercicio1_V1 {

	public static void main(String[] args) {
		int numeroInicio = -2;
		int numeroFinal = 30;
		char elegirParidad = 's'; // "n" = pares o "s" = todos
		char elegirAscendencia = '+'; // "+" = positiva y "-" = negativa

		eligirMetodo(elegirParidad, elegirAscendencia, numeroInicio, numeroFinal);
	}

	static void imprimeRangoAscendente(int numeroInicio, int numeroFinal) {
		System.out.println("----------- Rango completo Ascendente ---------------");
		System.out.println("----------- Nro inicio = " + numeroInicio + " Nro final " + numeroFinal + " ------------");
		int n = 0; // Contador de impresiones para hacer un "CR"al llegar al valor del if.
		// While para imprimir rango
		while (numeroInicio <= numeroFinal) {
			// If para encolumnar los datos
			if (n == 10) {
				System.out.printf("%+03d \n", numeroInicio);
				n = 0;
			} else {
				System.out.printf("%+03d, ", numeroInicio);
				n = n + 1;
			}
			++numeroInicio;
		}
	}

	static void imprimeRangoDescendente(int numeroInicio, int numeroFinal) {
		System.out.println("----------- Rango completo descendente --------------");
		System.out.println("----------- Nro inicio = " + numeroInicio + " Nro final " + numeroFinal + " ------------");
		int n = 0; // Contador de impresiones para hacer un "CR"al llegar al valor del if.
		while (numeroFinal >= numeroInicio) {
			if (n == 10) {
				System.out.printf("%+03d \n", numeroFinal);
				n = 0;
			} else {
				System.out.printf("%+03d, ", numeroFinal);
				n = n + 1;
			}
			--numeroFinal;
		}
	}

	static void imprimeRangoAscendentePar(int numeroInicio, int numeroFinal) {
		System.out.println("------------ Imprime rango ascendente par -----------");
		System.out.println("------------- Nro inicio = " + numeroInicio + " Nro final " + numeroFinal + " ----------");
		int n = 0; // Contador de impresiones para hacer un "CR"al llegar al valor del if.
		while (numeroInicio <= numeroFinal) {
			if (numeroInicio % 2 == 0) {
//				System.out.print(numeroInicio + ", ");
				if (n == 10) {
					System.out.printf("%+03d \n", numeroInicio);
					n = 0;
				} else {
					System.out.printf("%+03d, ", numeroInicio);
					n = n + 1;
				}
			}
			++numeroInicio;
		}
	}

	static void imprimeRangoDescendentePar(int numeroInicio, int numeroFinal) {
		System.out.println("----------- Imprime rango descendente par -----------");
		System.out.println("--------------- Nro inicio = " + numeroInicio + " Nro final " + numeroFinal + "---------");
		int n = 0; // Contador de impresiones para hacer un "CR"al llegar al valor del if.
		while (numeroFinal >= numeroInicio) {
			if (numeroFinal % 2 == 0) {
				if (n == 10) {
					System.out.printf("%+03d \n", numeroFinal);
					n = 0;
				} else {
					System.out.printf("%+03d, ", numeroFinal);
					n = n + 1;
				}
			}
			--numeroFinal;
		}
	}

	static void imprimeRangoAscendentePar1(int numeroInicio, int numeroFinal) {
		System.out.println("------- Imprime rango ascendente par 1 con for ------");
		System.out.println("----------- Nro inicio = " + numeroInicio + " Nro final " + numeroFinal + " ------------");
		int n = 0; // Contador de impresiones para hacer un "CR"al llegar al valor del if.
		for (int p = numeroInicio; p <= numeroFinal; p++) {
			if (p % 2 == 0) {
//				System.out.print(p + ", ");
				if (n == 10) {
					System.out.printf("%+03d \n", p);
					n = 0;
				} else {
					System.out.printf("%+03d, ", p);
					n = n + 1;
				}
			}
		}
	}

	static void eligirMetodo(char elegirParidad, char elegirAscendencia, int numeroInicio, int numeroFinal) {
		String c = String.valueOf(elegirParidad) + String.valueOf(elegirAscendencia);
		switch (c.toString()) {
		case "s+":
			imprimeRangoAscendente(numeroInicio, numeroFinal);
			break;
		case "s-":
			imprimeRangoDescendente(numeroInicio, numeroFinal);
			break;
		case "n+":
			imprimeRangoAscendentePar(numeroInicio, numeroFinal);
			break;
		case "n-":
			imprimeRangoDescendentePar(numeroInicio, numeroFinal);
			break;
		}
	}

}
