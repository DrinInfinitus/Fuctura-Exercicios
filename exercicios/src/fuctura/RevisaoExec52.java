package fuctura;

import java.util.Scanner;

public class RevisaoExec52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int [] [] matriz = new int [2] [3];
		
		for (int i=0; i<matriz.length; i++) {
			for (int t=0; t<matriz[0].length; t++) {
				System.out.println("Digite um número: ");
				int e = input.nextInt();
				matriz [i] [t] = e;
			}
		}
		
		for (int i=0; i<matriz.length; i++) {
			for (int t=0; t<matriz[0].length; t++) {
				System.out.println(matriz[i][t]*2);
			}
		}
		

	}

}
