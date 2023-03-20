package provaSci;

import java.util.Scanner;

public class CincoJava {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		double nota1 = 0;
		double nota2 = 0;
		double nota3 = 0;
		double nota4 = 0;
		String nome = "";
		double mediaGeral = 0;
		String nomeMaiorMedia = "";
		String nomeMenorMedia = "";
		double maiorMedia = 0;
		double menorMedia = 0;
		double soma = 0;
		double media = 0;
		
		
		
		String[][] alunosNotas = new String[3][5];

		for (int i = 0; i < alunosNotas.length; i++) {

			System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
			nome = scanner.next();

			System.out.print("Digite a primeira nota: ");
			nota1 = scanner.nextDouble();
			System.out.print("Digite a segunda nota: ");
			nota2 = scanner.nextDouble();
			System.out.print("Digite a terceira nota: ");
			nota3 = scanner.nextDouble();
			System.out.print("Digite a quarta nota: ");
			nota4 = scanner.nextDouble();

			alunosNotas[i][0] = nome;
			alunosNotas[i][1] = Double.toString(nota1);
			alunosNotas[i][2] = Double.toString(nota2);
			alunosNotas[i][3] = Double.toString(nota3);
			alunosNotas[i][4] = Double.toString(nota4);
		}

		double[] medias = new double[3];
		mediaGeral = 0;
		nomeMaiorMedia = "";
		nomeMenorMedia = "";
		maiorMedia = 0;
		menorMedia = Double.MAX_VALUE;
		for (int i = 0; i < alunosNotas.length; i++) {
			soma = 0;
			for (int j = 1; j < alunosNotas[i].length; j++) {
				soma += Double.parseDouble(alunosNotas[i][j]);
			}
			media = soma / 4;
			medias[i] = media;
			mediaGeral += media;
			if (media > maiorMedia) {
				maiorMedia = media;
				nomeMaiorMedia = alunosNotas[i][0];
			}
			if (media < menorMedia) {
				menorMedia = media;
				nomeMenorMedia = alunosNotas[i][0];
			}
		}
		mediaGeral /= 3;

		for (int i = 0; i < alunosNotas.length; i++) {
			System.out.println("Aluno: " + alunosNotas[i][0] + " Média: " + medias[i]);
		}
		System.out.println("Média geral: " + mediaGeral);
		System.out.println("Aluno com a maior média: " + nomeMaiorMedia);
		System.out.println("Aluno com a menor média: " + nomeMenorMedia);
	}
}
