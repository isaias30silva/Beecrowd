//Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, 
//p1(x1,y1) e p2(x2,y2) e calcule a distância entre eles, mostrando 4 casas decimais após a 
//vírgula, segundo a fórmula:

//Distancia =

//Entrada
//O arquivo de entrada contém duas linhas de dados. A primeira linha contém dois valores 
//de ponto flutuante: x1 y1 e a segunda linha contém dois valores de ponto flutuante x2 y2.

//Saída
//Calcule e imprima o valor da distância segundo a fórmula fornecida, 
//com 4 casas após o ponto decimal.

package DistanciaEntreDoisPontos1015;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//importando o scanner para inserção dos dados
		Scanner teclado = new Scanner(System.in);
		teclado.useLocale(Locale.US);
		
		//inserção dos 4 valores de ponto flutuante
		double x1 = teclado.nextDouble();
		double y1 = teclado.nextDouble();
		double x2 = teclado.nextDouble();
		double y2 = teclado.nextDouble();
		
		//fórmula para o cálculo da distância utilizando o Math.sqrt(que retorna a raiz quadrada)
		//e o Math.pow(que retorna a base elevada ao expoente 2, descrito no desafio)
		double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		
		//imprimindo o resultado, com 4 casas decimais. 
		System.out.printf("%.4f%n", distancia);
		
		teclado.close();

	}

}
