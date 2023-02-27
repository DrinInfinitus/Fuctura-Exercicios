package fuctura;

import java.util.Scanner;

public class revisãoExec1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is the name of the first team?");
		String team1 = input.next();
		System.out.println("What is the name of the second team?");
		String team2 = input.next();
		System.out.print("How much points the first team scored?");
		byte team1sco = input.nextByte();
		System.out.print("How much points the second team scored?");
		byte team2sco = input.nextByte();
		
		if (team1sco > team2sco) {
			System.out.println("The team "+team1+" was the winner with "+team1sco+" scored!");
		}else {
			System.out.println("The team "+team2+" was the winner with "+team2sco+" scored!");
		}
	}

}
