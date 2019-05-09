
public class Board {

	private final int SIDE = 10;
	private String[][] board = new String[SIDE][SIDE];
	private final String EMPTY = "-";
	private final String HIT = "X";
	private final String MISS = "O";
	
	
	
	
	public Board() {
		for(int row = 0; row < board.length; row++) {
			for(int col = 0; col < board[row].length; col++) {
				board[row][col] = EMPTY;
			}
		}
	}
	
	public void printBoard() {
		System.out.print("  ");
		for(char row = 'a'; row < 'k'; row++) {
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
		if(board[row][col] == "-") {
			return false;
		} else {
			return true;
		}
	}
	
	public void hit(int row, int col) {
		board[row][col] = HIT;
	}
	
	public void miss(int row, int col) {
		board[row][col] = MISS;
	}
	
	
}
