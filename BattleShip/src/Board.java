import java.util.Random;

public class Board {

	private final int SIDE = 10;
	private String[][] board = new String[SIDE][SIDE];
	private final String EMPTY = " ";
	private final String HIT = "X";
	private final String MISS = "O";
	

	Random r = new Random();
	
	public Board() {
		for(int row = 0; row < board.length; row++) {
			for(int col = 0; col < board[row].length; col++) {
				board[row][col] = EMPTY;
			}
		}
	}
	
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
	
	public void hit(int row, int col) {
		board[row][col] = HIT;
	}
	
	public void miss(int row, int col) {
		board[row][col] = MISS;
	}
	
	public void placeShips() {
		
		for (int i = 0; i < 4; i++) {
			int xpos = r.nextInt(SIDE-1) + 1;
			int ypos = r.nextInt(SIDE-1) + 1;
			
			board[xpos][ypos] = "S";
		}
	}
	
	public void checkPosition(int x, int y) {
		if (board[x][y] == EMPTY) {
			miss(x, y);
		}
		if (board[x][y] == "S") {
			hit(x, y);
		}
	}
	
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
	
	public String[][] getBoard(){
		return board;
	}
	
	
	
	
}
