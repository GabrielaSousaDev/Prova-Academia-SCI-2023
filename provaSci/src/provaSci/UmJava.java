package provaSci;

import java.util.Scanner;

public class UmJava {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int[] numeros = new int[5];

		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite o " + (i + 1) + "º número: ");
			numeros[i] = scanner.nextInt();
		}

		System.out.print("Números pares: ");
		for (int numPar : numeros) {
			if (numPar % 2 == 0) {
				System.out.print(numPar + " ");
			}
		}
		System.out.println();
		System.out.print("Números ímpares: ");
		for (int numImpar : numeros) {
			if (numImpar % 2 != 0) {
				System.out.print(numImpar + " ");
			}
		}
		
		int soma = 0;
		for (int numero : numeros) {
			soma += numero;
		}
		double media = (double) soma / numeros.length;
		System.out.println();

		System.out.println("Média geral: " + media);
	}

}
