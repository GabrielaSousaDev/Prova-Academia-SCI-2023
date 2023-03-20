package provaSci;

import java.util.Scanner;

public class DoisJava {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int[] numeros = new int[5];
		
		int maior = numeros[0];
		int menor = numeros[0];

		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite o " + (i + 1) + "º número: ");
			numeros[i] = scanner.nextInt();
		}

		
		for (int i = 1; i < numeros.length; i++) {
			if (numeros[i] > maior) {
				maior = numeros[i];
			}
			if (numeros[i] < menor) {
				menor = numeros[i];
			}
		}

		System.out.println("Número maior: " + maior);
		System.out.println("Número menor: " + menor);
	}

}
