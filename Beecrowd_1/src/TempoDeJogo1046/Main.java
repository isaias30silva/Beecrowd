/*
Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e 
terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

Entrada
A entrada contém dois valores inteiros representando a hora de início e a hora de fim do jogo.

Saída
Apresente a duração do jogo conforme exemplo abaixo.

 */

package TempoDeJogo1046;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		//criando as variaveis para armazenar os valores de início, fim e a duração do jogo
		int hora1, hora2, duracao;
		
		hora1 = teclado.nextInt();
		hora2 = teclado.nextInt();
		
		//criando a primeira condição.
		//se a hora1(inicio) for maior ou igual a hora2(fim), então a duração do jogo será o fim do jogo + 24.
		//Depois, pega o resultado e subtrai pelo valor da hora1(inicio)
		
		//exemplo: hora1 = 16 e hora2 = 2
		//hora1 é maior ou igual à hora2, então: 24+2 = 26 - 16 = 10
		if(hora1 >= hora2) {
			duracao = (24 + hora2) - hora1;
		}
		
		//caso contrário, a duração do jogo será a hora2(fim) menos a hora1(inicio)
		
		//exemplo: hora1 = 2 e hora2 = 16
		//hora1 é menor ou igual à hora2, então: 16 - 2 = 14
		
		//outro exemplo: 0 e 0 (meia noite)
		//hora1 é maior ou igual a hora2, então: 24+0 = 24 - 0 = 24
		
		else {
			duracao = hora2 - hora1;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		teclado.close();
	}

}
