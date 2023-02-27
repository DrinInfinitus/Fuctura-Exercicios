package fuctura;

import java.util.Scanner;

public class revisaoExec4 {

	public static void main(String[] args) {
//		Faça um programa que represente um sistema de entradas e saídas de caixa. Se for uma
//		entrada, soma o valor ao total do caixa, se for uma saída, subtraia o valor do total do
//		caixa. Ao fim de todas as entradas e saídas, se o total do caixa for positivo, imprima na
//		tela: “Saldo positivo”, senão, imprima: “Saldo negativo”.
		
		Scanner input = new Scanner(System.in);
		
		float caixatotal = 1750.00f;
		int contador = 1;
		
		do {
		System.out.println("Sacar ou depositar?");
		String escolha = input.next().toLowerCase();
		
		switch (escolha) {
		case "sacar":
			System.out.println("Quanto deseja sacar?");
			float saque = input.nextFloat();
			caixatotal = caixatotal - saque;
			System.out.println("Deseja sacar novamente?"
					+ "\n1- Sim"
					+ "\n2- Não");
			int contador2 = input.nextInt();
			contador = contador2;
			break;
		case "depositar":
			System.out.println("Quanto deseja depositar?");
			float deposito = input.nextFloat();
			caixatotal = deposito + caixatotal;
			System.out.println("Deseja sacar novamente?"
					+ "\n1- Sim"
					+ "\n2- Não");
			int contador3 = input.nextInt();
			contador = contador3;
			break;
			default:
				System.out.println("Desculpe, escolha uma opção válida.");
				break;
		}
		} while(contador == 1);
		if (caixatotal>0) {
		System.out.println("Saldo positivo!");
		} else {
			System.out.println("Saldo negativo!");
		}
	}

}
