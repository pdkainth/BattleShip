import java.util.Random;

public class Board {

	private final int SIDE = 10;
	private String[][] board = new String[SIDE][SIDE];
	private final String EMPTY = " ";
	private final String HIT = "X";
	private final String MISS = "O";
	

	Random r = new Random();
	
	/**
	 *This method creates an instance of a Board object which sets up th game board for botht he player and the CPU.
	 */
	public Board() {
		for(int row = 0; row < board.length; row++) {
			for(int col = 0; col < board[row].length; col++) {
				board[row][col] = EMPTY;
			}
		}
	}
	/**
	 * Prints the board layout for both the player and CPU, with current layout
	 */
	public void printBoard() {
		System.out.print("  ");
		for(int row = 0; row < SIDE; row++) {
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
	 * @param row - row number of the board
	 * @param col - column number of the board
	 * @return boolean value for determining a taken space or an empty space
	 */
	public boolean alreadyChosen(int row, int col) {
		try {
			if(board[row][col] == EMPTY || board[row][col] == "S") {
				return false;
			} else {
				return true;
			}
		}catch(Exception e) {
			return true;
			
		}
	}
	
	/**
	 * 
	 * @param row - row number of the board
	 * @param col - column number of the board
	 */
	public void hit(int row, int col) {
		board[row][col] = HIT;
	}
	
	/**
	 * 
	 * @param row - number of rows on the board
	 * @param col - number of columns on the board
	 */
	public void miss(int row, int col) {
		board[row][col] = MISS;
	}
	
	/**
	 * This method allows the user to place ships on the game board with user input
	 */
	public void placeShips() {
		
		for (int i = 0; i < 4; i++) {
			int xpos = r.nextInt(SIDE-1) + 1;
			int ypos = r.nextInt(SIDE-1) + 1;
			
			board[xpos][ypos] = "S";
		}
	}
	
	/**
	 * 
	 * @param x - the position number for the column
	 * @param y- the position number for the row
	 */
	public void checkPosition(int x, int y) {
		if (board[x][y] == EMPTY) {
			miss(x, y);
		}
		if (board[x][y] == "S") {
			hit(x, y);
		}
	}
	
	/**
	 * This method determines who the winner is by looping through every element of the board, checking for any ships remaining
	 * @return - boolean value determining the existence of any remaining ships
	 */
	public boolean winnerExists() {
		for (int i = 0; i < SIDE; i++) {
			for (int k = 0; k < SIDE; k++) {
				if (board[i][k] == "S") {
					return false;
				}
			}
		}
		
		return true;
	}
	
	/**
	 * 
	 * @return - an array of Strings determining spots taken by ships, spots that are empty, and spots that have been hit or miss
	 */
	public String[][] getBoard(){
		return board;
	}
	
	
	
	
}

