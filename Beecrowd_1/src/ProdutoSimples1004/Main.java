//Leia dois valores inteiros. A seguir, calcule o produto entre estes dois valores e 
//atribua esta operação à variável PROD. 
//A seguir mostre a variável PROD com mensagem correspondente.   
//Entrada - O arquivo de entrada contém 2 valores inteiros.
//Saída - Imprima a mensagem "PROD" e a variável PROD conforme exemplo abaixo, 
//com um espaço em branco antes e depois da igualdade. 
//Não esqueça de imprimir o fim de linha após o produto, 
//caso contrário seu programa apresentará a mensagem: “Presentation Error”.



package ProdutoSimples1004;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int valor1 = teclado.nextInt();
		int valor2 = teclado.nextInt();
		
		int prod = valor1*valor2;
		
		System.out.println("PROD = "+prod);
		
		teclado.close();

	}

}
