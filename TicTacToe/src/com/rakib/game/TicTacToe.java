package com.rakib.game;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
	private static final char EMPTY_BOX = ' ';
	private static final char PLAYER_ONES_SYMBOL = 'X';
	private static final char PLAYER_TWOS_SYMBOL = '0';
	
	private final char[][] gameboard = new char[3][3];
	
	private final Scanner input = new Scanner(System.in);
	
	/// Player Declaration
	private String playerOne;
	private String playerTwo;
	private String CurrentPlayer;
	private String WhoWonTheGame;
	
	public void startGame() {
		initializeBoard();
		askForUserNames();
		
		while( isGameNotOver() ) {
			drawBoard();
			printPlayerTurn();
			
		}
		
		printGameOver();
	}
	
	private void initializeBorad()
	{
		for ( char[] chars: gameBoard)
		{
			Arrays.fill(chars, EMPTY_BOX);
		}
	}
	
	private void askForUserNames() {
		System.out.println("Welcome to Tic Tac Toe!");
		System.out.println("what is your name ? ");
		playerOne = input.nextLine();
		
		System.out.println("Who are you playing with? ");
		playerTwo = input.nextLine();
		
		System.out.println("Who is playing first? press" + "\n for" + "");
	}
	
}
