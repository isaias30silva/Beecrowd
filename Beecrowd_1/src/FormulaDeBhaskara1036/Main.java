/* 
Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara. 
Se não for possível calcular as raízes, mostre a mensagem correspondente “Impossivel calcular”, 
caso haja uma divisão por 0 ou raiz de numero negativo.

Entrada
Leia três valores de ponto flutuante (double) A, B e C.

Saída
Se não houver possibilidade de calcular as raízes, apresente a mensagem "Impossivel calcular". 
Caso contrário, imprima o resultado das raízes com 5 dígitos após o ponto, com uma mensagem 
correspondente conforme exemplo abaixo. Imprima sempre o final de linha após cada mensagem
 */

package FormulaDeBhaskara1036;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		teclado.useLocale(Locale.US);
		
		double A = teclado.nextDouble();
		double B = teclado.nextDouble();
		double C = teclado.nextDouble();
		
		double delta;
		double r1, r2;
		
		delta = (B*B - (4*A*C));
		r1 = (-B + Math.sqrt(delta)) / (2*A);
        r2 = (-B - Math.sqrt(delta)) / (2*A);
		
		if (delta < 0 | A == 0) {
			System.out.println("Impossivel calcular");
		} else {
			System.out.printf("R1 = " + String.format("%.5f\n",r1));
			System.out.printf("R2 = " + String.format("%.5f\n",r2));
		}
		
		teclado.close();
	}

}
