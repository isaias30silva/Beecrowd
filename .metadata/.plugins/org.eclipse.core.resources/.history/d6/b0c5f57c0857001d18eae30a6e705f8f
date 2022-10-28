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
		
		double valorA = teclado.nextDouble();
		double valorB = teclado.nextDouble();
		double valorC = teclado.nextDouble();
		
		double perimetro;
		double area;
		
		double condicao1 = valorB-valorC;
		double condicao2 = valorB+valorC;
		double condicao3 = valorA-valorC;
		double condicao4 = valorA+valorC;
		double condicao5 = valorA-valorB;
		double condicao6 = valorA+valorB;
		
		if(valorA > condicao1 && valorA < condicao2 
				&& valorB > condicao3 && valorB < condicao4 
				&& valorC > condicao5 && valorC < condicao6) {
			
			perimetro = valorA+valorB+valorC;
			System.out.printf("Perimetro = " + String.format("%.1f", perimetro));
			
		} else {
			
			area = (valorA+valorB) * valorC / 2;
			System.out.printf("Area = " + String.format("%.1f", area));
		}
		
		teclado.close();
	}

}
