//Calcule o consumo médio de um automóvel sendo fornecidos a distância total percorrida (em Km) 
//e o total de combustível gasto (em litros).

//Entrada
//O arquivo de entrada contém dois valores: um valor inteiro X representando a distância total 
//percorrida (em Km), e um valor real Y representando o total de combustível gasto, com um dígito 
//após o ponto decimal.

//Saída
//Apresente o valor que representa o consumo médio do automóvel com 3 casas após a vírgula, 
//seguido da mensagem "km/l".


package Consumo1014;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	
public static void main(String[] args) {
		
		//importando o Scanner para inserção dos valores
		Scanner teclado = new Scanner(System.in);
		teclado.useLocale(Locale.US);
		
		//informando a distância em KM e o valor gasto em combustível
		int X = teclado.nextInt();
		double Y = teclado.nextDouble();
		
		//fórmula para descrobrir o consumo médio de combustível por KM rodado.
		//dividir a distância pelo valor do combustível
		double consumoMedio = X / Y; 
		
		
		//imprimindo o resultado com a formatação das três casas decimais
		System.out.printf("%.3f km/l%n", consumoMedio);
		
		teclado.close();
	}


}
