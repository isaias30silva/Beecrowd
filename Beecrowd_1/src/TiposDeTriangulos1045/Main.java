/*
 
Leia 3 valores de ponto flutuante A, B e C e ordene-os em ordem decrescente, 
de modo que o lado A representa o maior dos 3 lados. 
A seguir, determine o tipo de triângulo que estes três lados formam, com base nos seguintes casos,
sempre escrevendo uma mensagem adequada:
se A ≥ B+C, apresente a mensagem: NAO FORMA TRIANGULO
se A2 = B2 + C2, apresente a mensagem: TRIANGULO RETANGULO
se A2 > B2 + C2, apresente a mensagem: TRIANGULO OBTUSANGULO
se A2 < B2 + C2, apresente a mensagem: TRIANGULO ACUTANGULO
se os três lados forem iguais, apresente a mensagem: TRIANGULO EQUILATERO
se apenas dois dos lados forem iguais, apresente a mensagem: TRIANGULO ISOSCELES
Entrada
A entrada contem três valores de ponto flutuante de dupla precisão A (0 < A) , B (0 < B) e 
C (0 < C).

Saída
Imprima todas as classificações do triângulo especificado na entrada
 */

package TiposDeTriangulos1045;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		teclado.useLocale(Locale.US);

		//criando as variáveis. A, B e C serão os valores inseridos pelo usuário
		//A2 será o valor maior elevado ao quadrado
		//BC a soma dos valores médio e menor
		//maior será o maior valor
		double A, B, C, A2, BC, maior;

		A = teclado.nextDouble();
		B = teclado.nextDouble();
		C = teclado.nextDouble();

		//Descobrindo qual o maior valor: Se B for maior que A, o maior passará a ser A, que vai receber o valor de B.
		//Assim, B passará a ser o maior.
		if (B > A) {
			maior = A;
			A = B;
			B = maior;
		}

		//Descobrindo qual o maior valor: Se C for maior que A, o maior passará a ser A, que vai receber o valor de C.
		//Assim, C passará a ser o maior.
		if (C > A) {
			maior = A;
			A = C;
			C = maior;
		}

		//variáveis que vão armazenar as potenciações
		A2 = Math.pow(A, 2);
		BC = Math.pow(B, 2) + Math.pow(C, 2);

		if (A >= B + C) {
			System.out.println("NAO FORMA TRIANGULO");
		}

		else {
			if (A2 > BC) {
				System.out.println("TRIANGULO OBTUSANGULO");
			}

			else if (A2 < BC) {
				System.out.println("TRIANGULO ACUTANGULO");
			}

			else {
				System.out.println("TRIANGULO RETANGULO");
			}

			if (A == B && B == C) {
				System.out.println("TRIANGULO EQUILATERO");
			}

			else if (A == B || A == C || B == C) {
				System.out.println("TRIANGULO ISOSCELES");
			}
		}
		
		teclado.close();
	}

}
