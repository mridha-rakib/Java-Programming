package controlflow.rakib;

import java.util.Scanner;

public class LetterGradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner( System.in );
		
		System.out.print("Enter your score : ");
		int score = sc.nextInt();
		
		if ( score >= 80 )
			System.out.println("A+");
		else if ( score >= 70 && score <= 79 )
			System.out.println("A");
		else if ( score >= 60 && score <= 69 )
			System.out.println("A-");
		else if ( score >= 50 && score <= 59 )
			System.out.println("B");
		else if ( score >= 40 && score <= 49 )
			System.out.println("C");
		else if ( score >= 33 && score <= 39 )
			System.out.println("D");
		else 
			System.out.println("Failed");
		
	}

}
