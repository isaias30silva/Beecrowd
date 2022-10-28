/*
 Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" 
 ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si.

Entrada
A entrada contém valores inteiros.

Saída
A saída deve conter uma das mensagens conforme descrito acima.
 */

package Multiplos1044;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		//variáveis para armazenar os valores inseridos pelo usuário
		double valorA = teclado.nextDouble();
		double valorB = teclado.nextDouble();
		
		//uma forma de descobrir se um número é múltiplo de outro:
		//faça a divisão entre eles e, se o resto da divisão for 0, o dividendo será múltiplo do divisor.
		
		if(valorA%valorB == 0 || valorB%valorA == 0) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao Multiplos");
		}
		
		teclado.close();
	}

}
