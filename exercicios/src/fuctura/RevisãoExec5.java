package fuctura;

import java.util.Scanner;
import java.util.Vector;

public class RevisãoExec5 {

	public static void main(String[] args) {
//		Ler uma lista de 5 números inteiros e mostre cada número juntamente
//		com a sua posição na lista.
		
		Scanner input = new Scanner(System.in);
		int [] vetor = new int [5];
		
		int timer = 0;
		
		System.out.println("Type 5 numbers");
		vetor [0] = 0;
		vetor [1] = 0;
		vetor [2] = 0;
		vetor [3] = 0;
		vetor [4] = 0;
		while (timer<vetor.length) {
			vetor [timer] = input.nextInt();
			timer ++;
		}
		timer = 0;
		
		do {
			System.out.println(vetor[timer]);
			timer ++;
		} while (timer<vetor.length);

	}

}
