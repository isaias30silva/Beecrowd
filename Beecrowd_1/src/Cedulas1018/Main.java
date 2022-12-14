/*Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) 
no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. 
A seguir mostre o valor lido e a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).

Saída
Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo necessárias, 
conforme o exemplo fornecido. Não esqueça de imprimir o fim de linha após cada linha, 
caso contrário seu programa apresentará a mensagem: “Presentation Error”.
*/

package Cedulas1018;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int valor = teclado.nextInt();
		int centena;
		int dezena50;
		int dezena20;
		int dezena10;
		int unidade5;
		int unidade2;
		int unidade1;
		
		centena = valor/100; // 1
		dezena50 = (valor%100)/50; // 76/50 = 1
		dezena20 = (valor%100)%50/20; // 76%50=26/20=1
		dezena10 = (valor%100)%50%20/10; // 76%50=26%20=6/10=0
		unidade5 = (valor%100)%50%20%10/5; //76%50=26%20=6%10=6/5=1
		unidade2 = (valor%100)%50%20%10%5/2; //76%50=26%20=6%10=6%5=1/2=0
		unidade1 = (valor%100)%50%20%10%5%2/1; //76%50=26%20=6%10=6%5=1%2=1
		
		System.out.println(valor);
		System.out.println(centena + " nota(s) de R$ 100,00");
		System.out.println(dezena50 + " nota(s) de R$ 50,00");
		System.out.println(dezena20 + " nota(s) de R$ 20,00");
		System.out.println(dezena10 + " nota(s) de R$ 10,00");
		System.out.println(unidade5 + " nota(s) de R$ 5,00");
		System.out.println(unidade2 + " nota(s) de R$ 2,00");
		System.out.println(unidade1 + " nota(s) de R$ 1,00");
		
		teclado.close();
	}

}
