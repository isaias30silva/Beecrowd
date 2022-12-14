/*
Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um triângulo. 
Em caso positivo, calcule o perímetro do triângulo e apresente a mensagem:

Perimetro = XX.X


Em caso negativo, calcule a área do trapézio que tem A e B como base e C como altura, 
mostrando a mensagem

Area = XX.X

Entrada
A entrada contém três valores reais.

Saída
O resultado deve ser apresentado com uma casa decimal.
*/

package Triangulo1043;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		teclado.useLocale(Locale.US);
		
		//valores informados pelo usuário
		double valorA = teclado.nextDouble();
		double valorB = teclado.nextDouble();
		double valorC = teclado.nextDouble();
		
		//variáveis para guardar os valores do perimetro e da área
		double perimetro;
		double area;
		
		//para um número ser triangulo é preciso obdecer a seguinte regra:
		//1 - um de seus lados deve ser maior que a subtração e maior que soma dos outros dois lados
		//assim, foram calculadas as subtrações e somas de dois lados, considerando todas as possibilidades
		//os valores foram armazenados em variáveis específicas
		double condicao1 = valorB-valorC;
		double condicao2 = valorB+valorC;
		double condicao3 = valorA-valorC;
		double condicao4 = valorA+valorC;
		double condicao5 = valorA-valorB;
		double condicao6 = valorA+valorB;
		
		//primeira condição: verificar se os numeros informados foram um triângulo
		//para isso, é preciso comparar um valor por vez com as condições correspondentes
		//assim, o procedimento foi realizado três vezes
		if(valorA > condicao1 && valorA < condicao2 
				&& valorB > condicao3 && valorB < condicao4 
				&& valorC > condicao5 && valorC < condicao6) {
			
			//o calculo do perímetro do triângulo é feito da seguinte forma:
			//basta somar todos os três valores!
			perimetro = valorA+valorB+valorC;
			System.out.println("Perimetro = " + String.format("%.1f", perimetro));
			
		} else {
			
			//o cálculo da área do trapézio é feito da seguinte forma:
			//1. basta somar as bases (que no exercicio são os valores A e B)
			//2. multiplicar o resultado da soma pela altura (que no exercício é o valor de C)
			//3. dividir o resultado da multiplicação por 2
			area = (valorA+valorB) * valorC / 2;
			System.out.println("Area = " + String.format("%.1f", area));
		}
		
		teclado.close();
	}

}
