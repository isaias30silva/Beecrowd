// Joaozinho quer calcular e mostrar a quantidade de litros de combustível gastos em uma viagem, 
//ao utilizar um automóvel que faz 12 KM/L. Para isso, ele gostaria que você o auxiliasse 
//através de um simples programa. Para efetuar o cálculo, deve-se fornecer o tempo gasto 
//na viagem (em horas) e a velocidade média durante a mesma (em km/h). 
//Assim, pode-se obter distância percorrida e, em seguida, calcular quantos litros seriam 
//necessários. Mostre o valor com 3 casas decimais após o ponto.

//Entrada
//O arquivo de entrada contém dois inteiros. O primeiro é o tempo gasto na viagem (em horas) 
//e o segundo é a velocidade média durante a mesma (em km/h).

//Saída
//Imprima a quantidade de litros necessária para realizar a viagem, 
//com três dígitos após o ponto decimal

package GastoCombustive1017;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		teclado.useLocale(Locale.US);
		
		//input do tempo gasto na viagem (horas)
		//input da velocidade média da viagem (horas)
		int tempoViagem = teclado.nextInt();
		int velocidadeMedia = teclado.nextInt();
	
		//valor fixo de litros gastos por km
		double litros = 12.0;
		double qntLitros;
		
		//para obter distância percorrida, basta multiplicar o tempo gasto pela velocidade média
		//com o resultado da multiplicação, o próximo passo é dividir pela quantidade de litros
		//que o carro faz por km.
		qntLitros = (velocidadeMedia*tempoViagem)/litros;
		
		System.out.printf("%.3f\n",qntLitros);
		
		teclado.close();
		
	}

}
