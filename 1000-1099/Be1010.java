package e1010;

import java.util.Scanner;

public class Be1010 {

	public static void main(String[] args) {

		/*
		 * Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o
		 * valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e
		 * o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.
		 * 
		 * Entrada O arquivo de entrada contém duas linhas de dados. Em cada linha
		 * haverá 3 valores, respectivamente dois inteiros e um valor com 2 casas
		 * decimais.
		 * 
		 * Saída A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo,
		 * lembrando de deixar um espaço após os dois pontos e um espaço após o "R$". O
		 * valor deverá ser apresentado com 2 casas após o ponto.
		 */
		
		
		
		Scanner sc = new Scanner(System.in);
		
		int codigoPeca1, codigoPeca2, numeroDePecas1, numeroDePecas2;
		double precoPeca1, precoPeca2;
		
		codigoPeca1 = sc.nextInt();
		numeroDePecas1 = sc.nextInt();
		precoPeca1 = sc.nextDouble();
		
		codigoPeca2 = sc.nextInt();
		numeroDePecas2 = sc.nextInt();
		precoPeca2 = sc.nextDouble();
		
		double totalAPagar = (numeroDePecas1 * precoPeca1) + (numeroDePecas2 * precoPeca2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", totalAPagar);
		
		sc.close();
		
	}

}
