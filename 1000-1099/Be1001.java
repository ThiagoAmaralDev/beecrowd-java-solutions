package e1001;

import java.util.Scanner;

public class Be1001 {

	public static void main(String[] args) {

		/*
		 * Leia 2 valores inteiros e armazene-os nas variáveis A e B.
		 *  Efetue a soma de A
		 * e B atribuindo o seu resultado na variável X. 
		 * Imprima X conforme exemplo
		 * apresentado abaixo. 
		 * Não apresente mensagem alguma além daquilo que está sendo
		 * especificado e 
		 * não esqueça de imprimir o fim de linha após o resultado, caso
		 * contrário, você receberá "Presentation Error".
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		int soma = 0;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		soma = a + b;
		
		System.out.println("X = "+ soma);
		
		sc.close();
	}

}
