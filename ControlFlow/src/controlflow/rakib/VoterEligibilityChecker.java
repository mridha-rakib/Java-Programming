package controlflow.rakib;

import java.util.Scanner;

public class VoterEligibilityChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your  age : ");
		int age = input.nextInt();
		
		if ( age >= 18 )
			System.out.println("Congratulations! you are eligible to vote");
		else
			System.out.println("Sorry! Better luck next time.");

	}

}
