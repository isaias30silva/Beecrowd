//Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário 
//de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. 
//Após, calcule e mostre o valor a ser pago.
//Entrada
//O arquivo de entrada contém duas linhas de dados. 
//Em cada linha haverá 3 valores, respectivamente dois inteiros e um valor com 2 casas decimais.
//Saída
//A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, 
//lembrando de deixar um espaço após os dois pontos e um espaço após o "R$". 
//O valor deverá ser apresentado com 2 casas após o ponto.


package CalculoSimples1010;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		teclado.useLocale(Locale.US);
		
		int numeroP1 = teclado.nextInt();
		double valorP1 = teclado.nextDouble();
		
		int numeroP2 = teclado.nextInt();
		double valorP2 = teclado.nextDouble();
		
		double valor1 = numeroP1 * valorP1;
		double valor2 = numeroP2 * valorP2;
		
		double totalPagar = valor1 + valor2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f\n",totalPagar);
		
		teclado.close();

	}

}
