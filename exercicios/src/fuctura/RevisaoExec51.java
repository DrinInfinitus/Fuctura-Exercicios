package fuctura;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RevisaoExec51 {

	public static void main(String[] args) {
//		Inicialize uma lista de 20 números inteiros. Armazene os números pares
//		em uma lista PAR e os números ímpares em uma lista IMPAR. Imprima as listas PAR
//		e IMPAR.
		
		Scanner input = new Scanner(System.in);
//		int [] [] matriz = new int [2] [10];
//		int [] pares  = new int [10];
//		int [] impares = new int [10];
		
		List<Integer> pares = new ArrayList<Integer>();
		List<Integer> impares = new ArrayList<Integer>();
	
		
		System.out.println("Type 1 to continue"
				+ "\n Or press X to quit.");
		String d = input.next().toLowerCase();
		if (d .equals("1")) {
			for (int i =0; i<20; i++) {
				int entrada = input.nextInt();
				if (entrada % 2 == 0) {
					pares.add(entrada);
			} else {
				impares.add(entrada);
			}
			}
			
		} else {
			
		}
		System.out.println(pares);
			System.out.println(impares);
		}
}
		
