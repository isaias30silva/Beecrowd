/*
 Leia 3 valores inteiros e ordene-os em ordem crescente. No final, mostre os valores em ordem 
 crescente, uma linha em branco e em seguida, os valores na sequência como foram lidos.

Entrada
A entrada contem três números inteiros.

Saída
Imprima a saída conforme foi especificado
 */

package SortSimples1042;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		//criação de duas variáveis para o menor e maior valor
		int menor;
		int maior;
		
		int valor1 = teclado.nextInt();
		int valor2 = teclado.nextInt();
		int valor3 = teclado.nextInt();
		
		//descobrindo qual o menor valor
		menor = Math.min(valor1, Math.min(valor2, valor3));
		
		//descobrindo qual o maior valor
		maior = Math.max(valor1, Math.max(valor2, valor3));
		
		//imprimindo o menor valor
		System.out.println(menor);
		
		//descobrindo e imprimindoqual o segundo menor valor na ordem crescente
		//para isso, os 3 valores inseridos pelo usuário foram comparados com o maior e o menor
		if(valor1 != menor && valor1 != maior) {
			System.out.println(valor1);
		} else if (valor2 != menor && valor2 != maior) {
			System.out.println(valor2);
		} else if (valor3 != menor && valor3 != maior) {
			System.out.println(valor3);
		}

		//imprimindo o maior valor
		System.out.println(maior);
		System.out.println("");
		System.out.println(valor1);
		System.out.println(valor2);
		System.out.println(valor3);
		
		teclado.close();
	}

}


