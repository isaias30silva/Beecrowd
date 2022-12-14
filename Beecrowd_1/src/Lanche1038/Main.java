/*
 Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade 
 deste item. A seguir, calcule e mostre o valor da conta a pagar.

Entrada
O arquivo de entrada contém dois valores inteiros correspondentes ao código e à quantidade 
de um item conforme tabela acima.

Saída
O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo valor a ser pago, 
com 2 casas após o ponto decimal
 */

package Lanche1038;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int codigo = teclado.nextInt();
		int quantidade = teclado.nextInt();
		double total;
		
		if(codigo == 1) {
			total = quantidade * 4.00;
			System.out.println("Total: R$ " + String.format("%.2f", total));
		} else if (codigo == 2) {
			total = quantidade * 4.50;
			System.out.println("Total: R$ " + String.format("%.2f", total));
		} else if (codigo == 3) {
			total = quantidade * 5.00;
			System.out.println("Total: R$ " + String.format("%.2f", total));
		} else if (codigo == 4) {
			total = quantidade * 2.00;
			System.out.println("Total: R$ " + String.format("%.2f", total));
		} else if (codigo == 5) {
			total = quantidade * 1.50;
			System.out.println("Total: R$ " + String.format("%.2f", total));
		}
		
		teclado.close();

	}

}
