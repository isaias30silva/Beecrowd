/*
Leia 4 valores inteiros A, B, C e D. A seguir, se B for maior do 
que C e se D for maior do que A, e a soma de C com D for maior que a 
soma de A e B e se C e D, ambos, forem positivos e se a variável A 
for par escrever a mensagem "Valores aceitos", senão escrever 
"Valores nao aceitos".

Entrada
Quatro números inteiros A, B, C e D.

Saída
Mostre a respectiva mensagem após a validação dos valores
 * 
 */

package TesteDeSelecao1035;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int intA = teclado.nextInt();
		int intB = teclado.nextInt();
		int intC = teclado.nextInt();
		int intD = teclado.nextInt();
		
		if(intB > intC && intD > intA && (intC + intD) > (intA + intB) && intC >= 0 && intD >= 0 && intA%2 == 0) {
			System.out.println("Valores aceitos");
		} else {
			System.out.println("Valores nao aceitos");
		}
	}

}
