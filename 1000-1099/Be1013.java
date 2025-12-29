package e1013;

import java.util.Scanner;

public class Be1013 {

	public static void main(String[] args) {

		/*
		 * Faça um programa que leia três valores e apresente o maior dos três valores
		 * lidos seguido da mensagem “eh o maior”. Utilize a fórmula:
		 * 
		 * 
		 * 
		 * Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). Um
		 * segundo passo, portanto é necessário para chegar no resultado esperado.
		 * 
		 * Entrada O arquivo de entrada contém três valores inteiros.
		 * 
		 * Saída Imprima o maior dos três valores seguido por um espaço e a mensagem
		 * "eh o maior".
		 */

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int maiorAB = (a + b + Math.abs(a - b)) / 2;

		int maiorDeTodos = (maiorAB + c + Math.abs(maiorAB - c)) / 2;

		System.out.println(maiorDeTodos + " eh o maior");

		sc.close();

	}

}
