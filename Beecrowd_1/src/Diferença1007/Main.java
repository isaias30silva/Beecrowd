//Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto 
//de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
//Entrada - O arquivo de entrada contém 4 valores inteiros.
//Saída
//Imprima a mensagem DIFERENCA com todas as letras maiúsculas, 
//conforme exemplo abaixo, com um espaço em branco antes e depois da igualdade.


package Diferença1007;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		teclado.useLocale(Locale.US);
		
		int A = teclado.nextInt();
		int B = teclado.nextInt();
		int C = teclado.nextInt();
		int D = teclado.nextInt();
		
		int produtoAB = A*B;
		int produtoCD = C*D;
		
		int diferenca = produtoAB - produtoCD;
		
		System.out.println("DIFERENCA = "+diferenca);
		
		teclado.close();
		
	}

}
