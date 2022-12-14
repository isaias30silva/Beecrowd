//Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. 
//Em seguida, calcule e mostre:
//a) a área do triângulo retângulo que tem A por base e C por altura.
//b) a área do círculo de raio C. (pi = 3.14159)
//c) a área do trapézio que tem A e B por bases e C por altura.
//d) a área do quadrado que tem lado B.
//e) a área do retângulo que tem lados A e B.
//Entrada - O arquivo de entrada contém três valores com um dígito após o ponto decimal.
//Saída
//O arquivo de saída deverá conter 5 linhas de dados. Cada linha corresponde a uma das áreas 
//descritas acima, sempre com mensagem correspondente e um espaço entre os dois pontos e o valor. 
//O valor calculado deve ser apresentado com 3 dígitos após o ponto decimal.



package Area1012;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		double pi = 3.14159;
		
		Scanner teclado = new Scanner(System.in);
		teclado.useLocale(Locale.US);
		
		double A = teclado.nextDouble();
		double B = teclado.nextDouble();
		double C = teclado.nextDouble();
		
		//Para encontrar a área de um triângulo retângulo, basta dividir por 2 o resultado
		//da multiplicação da base pela altura.
		double triangulo = (A*C)/2.0;
		
		//Para calcular a área do círculo é preciso multiplicar o valor de pi= 3.14159
		//pelo valor do raio elevado a 2.
		double circulo = pi * Math.pow(C, 2);
		
		//Para calcular a área de um trapézio basta somar a base maior e a base menor
		//depois, multipliar o resultado pela altura e dividir esse resultado por 2.
		double trapezio = ((A+B)*C)/2.0;
		
		//Para calcular a área do quadrado, basta multiplicar a medida de dois lados.
		//Ou seja, elevar a medida ao quadrado.
		double quadrado = Math.pow(B, 2);
		
		//Para calcular a área do retângulo é preciso multiplicar a medida do comprimento
		//pela medida da largura
		double retangulo = A * B;
		
		System.out.printf("TRIANGULO: %.3f%n",triangulo);
		System.out.printf("CIRCULO: %.3f%n",circulo); 
		System.out.printf("TRAPEZIO: %.3f%n",trapezio); 
		System.out.printf("QUADRADO: %.3f%n",quadrado);
		System.out.printf("RETANGULO: %.3f%n",retangulo);
		
		teclado.close();
	}

}
