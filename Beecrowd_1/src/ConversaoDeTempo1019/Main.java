/*
Leia um valor inteiro, que é o tempo de duração em segundos de um determinado 
evento em uma fábrica, e informe-o expresso no formato horas:minutos:segundos.

Entrada
O arquivo de entrada contém um valor inteiro N.

Saída
Imprima o tempo lido no arquivo de entrada (segundos), 
convertido para horas:minutos:segundos, conforme exemplo fornecido.
 */

package ConversaoDeTempo1019;

import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//variaveis para armazenar o valor informado pelo usuário e, a partir de entao
		//calcular os segundos, minutos e horas
		int tempoDuracao = teclado.nextInt();
		int segundos;
		int minutos;
		int horas;
		
		//para obter os segundos, é preciso encontrar o resto da divisão do valor
		//informado pelo usuário por 60 segundos.
		segundos = tempoDuracao%60;
		
		//para obter os minutos, é preciso dividir o valor informado pelo usuário 
		//por 60(minutos), e com o resultado, obter o resto da divisão por 60(segundos)
		minutos = tempoDuracao/60%60;
		
		//para obter as horas, é preciso dividir o valor informado pelo usuário por 
		//60(minutos) e dividir esse valor por 60 novamente.
		horas = tempoDuracao/60/60;
		
		System.out.println(horas+":"+minutos +":" +segundos);
		
		
		teclado.close();
		
		}

}
