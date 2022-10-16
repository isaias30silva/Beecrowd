/*Dois carros (X e Y) partem em uma mesma direção. O carro X sai com velocidade constante 
de 60 Km/h e o carro Y sai com velocidade constante de 90 Km/h.

Em uma hora (60 minutos) o carro Y consegue se distanciar 30 quilômetros do carro X, 
ou seja, consegue se afastar um quilômetro a cada 2 minutos.

Leia a distância (em Km) e calcule quanto tempo leva (em minutos) para o carro Y 
tomar essa distância do outro carro.

Entrada
O arquivo de entrada contém um número inteiro.

Saída
Imprima o tempo necessário seguido da mensagem "minutos".
*/

package Distancia1016;

import java.util.Scanner;

public class Main {
	
public static void main(String[] args) {
		
		//importando o scanner para inserção dos dados
		Scanner teclado = new Scanner(System.in);
		
		//inserção da distância em KM
		int distancia = teclado.nextInt();
		
		//agora que o usuário informou a distância em km:
		//o que o exercício pede é o tempo em minutos, então, sabe-se que a cada 60 minutos
		//30 km são percorridos.
		//então, é preciso mutiplicar a distância informada pelo usuário pelos 60 minutos
		//e depois dividir por 30, que é a diferença entre os dois carros, x e y.
		int minutos = (60 * distancia) / 30;
		
		System.out.println(minutos + " minutos");
		
		
		teclado.close();
	}
		
}
