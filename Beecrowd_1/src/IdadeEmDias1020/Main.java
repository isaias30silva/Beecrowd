/*
Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, 
meses e dias

Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias. 
Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 
ou 364. Este é apenas um exercício com objetivo de testar raciocínio matemático simples.

Entrada
O arquivo de entrada contém um valor inteiro.

Saída
Imprima a saída conforme exemplo fornecido.
 */

package IdadeEmDias1020;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//variáveis que armazenarão o valor informado pelo usuário e, a partir desse valor
		//o resultado dos cálculos de conversão para dias, meses e anos.
		int idadeDias = teclado.nextInt();
		
		int anos;
		int meses;
		int dias;
		
		//para descobrir a quantidade de anos de pessoas, é só dividir o valor informado por 365.
		anos = idadeDias/365;
		
		//para descobrir a quantidade de meses, é preciso obter o resto da divisão
		//do valor informado pelo usuário por 365. E com o resultado dessa operação dividir por 30.
		meses = (idadeDias%365)/30;
		
		//para descobrir a quantidade de dias, basta obter o resto da divisão do valor
		//informado pelo usuário por 365, e o resultado dessa operação deve ser dividido por 30.
		//o resto dessa divisão será a quantidade de dias.
		dias = (idadeDias%365)%30;
		
		System.out.println(anos + " ano(s)");
		System.out.println(meses + " mes(es)");
		System.out.println(dias + " dia(s)");
		
		teclado.close();

	}

}
