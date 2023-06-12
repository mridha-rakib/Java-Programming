package controlflow.rakib;

import java.util.Scanner;
import java.io.*;

public class VoterEligibilityChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		
		System.out.print("Enter your  age : ");
		int age = Sc.nextInt();
		
		if ( age >= 18 )
			System.out.println("Congratulations! you are eligible to vote");
		else
			System.out.println("Sorry! Better luck next time.");

	}

}
