package fuctura;

import java.util.Scanner;

public class revisaoExec2 {

	public static void main(String[] args) {
		// Faça um programa que irá cadastrar um cadastro de cliente em uma rede de farmácias.
//		Leia o nome, o sexo e o estado civil de uma pessoa. Caso o sexo seja “F” e o estado
//		civil seja “CASADA”, solicitar o tempo de casada (anos). Se a idade for maior do que
//		25 anos, imprima: “Você tem 25% de desconto nos nossos remédios”.

		Scanner input = new Scanner (System.in);
		
		String f = "female";
		String state = "married";
		
		System.out.println("What is your name?");
		String name = input.next().toLowerCase();
		System.out.println("What is your gender?");
		String gender = input.next().toLowerCase();
		System.out.println("What is your civil state?");
		String civilsta = input.next().toLowerCase();
		
		if (gender .equals(f)) {
			if (civilsta .equals(state)) {
				System.out.println("How long have you been married?");
				int married = input.nextInt();
				
				if (25<married) {
					System.out.println("You have a 25% discount cupon on your purchase.");
				}
			}
		}
		
		System.out.println("Have a great day!");
		
	}

}
