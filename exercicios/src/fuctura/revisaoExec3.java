package fuctura;

import java.util.Scanner;
import java.util.Vector;

public class revisaoExec3 {

	public static void main(String[] args) {
		// Faça um programa que leia 10 valores para uma variável n e, para cada um deles,
//		calcule a tabuada de 1 até n. Mostre a tabuada na forma:

		Scanner input = new Scanner (System.in);
		int [] vetor = new int[10];
		//Vector vec = new Vector();
		int timer = 0;
		
		System.out.println("Enter 10 numbers of your choice to multiply");
		vetor[0] = input.nextInt();
		vetor[1] = input.nextInt();
		vetor[2] = input.nextInt();
		vetor[3] = input.nextInt();
		vetor[4] = input.nextInt();
		vetor[5] = input.nextInt();
		vetor[6] = input.nextInt();
		vetor[7] = input.nextInt();
		vetor[8] = input.nextInt();
		vetor[9] = input.nextInt();
		
		int number = 0;
		int number2 = 0;
		
		while (timer<vetor.length) {
			do {
			System.out.println(vetor[number2]+" x "+number+" = "+number*vetor[number2]);
			number ++;
			}while(number<=vetor[number2]);
			number = 0;
			number2++;
			timer++;
			System.out.println("-----------------");
		}
	}

}
