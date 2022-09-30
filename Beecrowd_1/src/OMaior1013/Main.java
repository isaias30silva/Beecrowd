//Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido 
//da mensagem “eh o maior”. Utilize a fórmula:

//Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). 
//Um segundo passo, portanto é necessário para chegar no resultado esperado.

//Entrada
//O arquivo de entrada contém três valores inteiros.

//Saída
//Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".

package OMaior1013;

import java.util.Scanner;

public class Main {
	
public static void main(String[] args) {
		
		//importando Scanner para inserção dos números
		Scanner teclado = new Scanner(System.in);
		
		//inserção dos 3 valores
		int a = teclado.nextInt();
		int b = teclado.nextInt();
		int c = teclado.nextInt();
		
		//fórmula para comparar, entre os dois primeiros valores, qual é o maior
		//Math.abs retorna o valor absoluto de uma operação, ou seja, o número sem sinal - ou +
		int mediaAB = (a+b+Math.abs(a-b)) / 2;
		
		//agora, com o resultado da primeira operação, é hora de verificar se o 
		//valor encontrado é maior que o terceiro. Basta utilizar a variável resultante na operação.
		int mediaABC = (mediaAB+c+Math.abs(mediaAB-c)) / 2;
		
		//impressão do resultado com a frase proposta.
		System.out.println(mediaABC + " eh o maior");
		
		teclado.close();
	}


}
