package provaSci;

import java.util.Scanner;

public class TresJava {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		double somaNotas = 0;
		double media = 0;
		String nome = "";
		
		boolean continuar = true;
		while (continuar) {

			
			System.out.print("Digite o nome do aluno: ");
			nome = scanner.next();
			

			for (int i = 0; i < 4; i++) {
				
				System.out.print("Digite a " + (i+1) +"° nota: ");
				somaNotas = scanner.nextDouble() + somaNotas;
			
			}
	
			media = somaNotas / 4;

			System.out.println("Aluno: " + nome);
			System.out.println("Média: " + media);
			if (media < 6) {
				System.out.println("Situação: Reprovado");
			} else {
				System.out.println("Situação: Aprovado");
			}
			
			somaNotas = 0;

			System.out.print("Deseja continuar? (S/N) ");
			String resposta = scanner.next();
			if (!resposta.equalsIgnoreCase("S")) {
				continuar = false;
				System.out.println("Processo encerrado");
			}
		}
	}
}
