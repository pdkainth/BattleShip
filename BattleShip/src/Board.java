import java.util.Random;


/**
 * This class creates the game board that the game is going to take place. This class 
 * is used by creating an instance of it and set up the structure where all contents 
 * of the game are displayed.
 * @author  Quick Edits 
 *
 */
public class Board {


	
	private final int LENGTH = 10;
	

	
	
	public Board() {
		
	}
	
	
	/**
	 * This method sets up and prints the current game board on display.
	 * @param board - String array that displays a 9x9 board
	 */
	
	public static void printBoard(String[][] board) {
		System.out.print("  ");
		for(int row = 0; row < board.length; row++) {
			System.out.print(row + " ");
		}
		System.out.println();
		
		for(int row = 0; row < board.length; row++) {
			System.out.print(row + " ");
			for(int col = 0; col < board[row].length; col++) {
				System.out.print(board[row][col] + " ");
			}
			System.out.println();
		}
	}
	
	/**
	 * gets the value of the length of one side of the game board
	 * @return - length of  one side of the game board
	 */
	public int getLength() {
		return LENGTH;
	}


	
	
	
	
}
