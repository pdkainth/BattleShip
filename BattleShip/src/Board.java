import java.util.Random;

public class Board {

//	private final int SIDE = 10;
//	private String[][] board = new String[SIDE][SIDE];
//	private String[][] hiddenBoard = new String[SIDE][SIDE];
//	private final String EMPTY = " ";
//	private final String HIT = "X";
//	private final String MISS = "O";

	private final int LENGTH = 10;
	

//	Random r = new Random();
//	
//	public Board() {
//		for(int row = 0; row < board.length; row++) {
//			for(int col = 0; col < board[row].length; col++) {
//				board[row][col] = EMPTY;
//			}
//		}
//	}
	
	public Board() {
		
	}
	
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
	
	public int getLength() {
		return LENGTH;
	}

//	
//	public boolean alreadyChosen(int row, int col) {
//		try {
//			if(board[row][col] == EMPTY || hiddenBoard[row][col] == "S") {
//				return false;
//			} else {
//				return true;
//			}
//		}catch(Exception e) {
//			return true;
//			
//		}
//	}
//	
//	public void hit(int row, int col) {
//		board[row][col] = HIT;
//		hiddenBoard[row][col] = "";
//	}
//	
//	public void miss(int row, int col) {
//		board[row][col] = MISS;
//	}
//	
//	public void placeShips() {
//		
//		int xpos = r.nextInt(SIDE-4) + 1;
//		int ypos = r.nextInt(SIDE-4) + 1;
//		
//		hiddenBoard[xpos][ypos] = "S";
//		
//		if (r.nextInt(2) + 1 == 1) {
//			hiddenBoard[xpos + 1][ypos] = "S";
//			hiddenBoard[xpos + 2][ypos] = "S";
//		}else {
//			hiddenBoard[xpos][ypos + 1] = "S";
//			hiddenBoard[xpos][ypos + 2] = "S";
//		}
//		
//		
//		xpos = r.nextInt(SIDE-6) + 1;
//		ypos = r.nextInt(SIDE-6) + 1;
//		
//		hiddenBoard[xpos][ypos] = "S";
//		
//		if (r.nextInt(2) + 1 == 1) {
//			hiddenBoard[xpos + 1][ypos] = "S";
//			hiddenBoard[xpos + 2][ypos] = "S";
//			hiddenBoard[xpos + 3][ypos] = "S";
//			hiddenBoard[xpos + 4][ypos] = "S";
//		}else {
//			hiddenBoard[xpos][ypos + 1] = "S";
//			hiddenBoard[xpos][ypos + 2] = "S";
//			hiddenBoard[xpos][ypos + 3] = "S";
//			hiddenBoard[xpos][ypos + 4] = "S";
//		}
//		
//
//		
//		xpos = r.nextInt(SIDE-1) + 1;
//		ypos = r.nextInt(SIDE-1) + 1;
//		hiddenBoard[xpos][ypos] = "S";
//		
//		
//		for (int i = 0; i < SIDE; i++) {
//			for (int k = 0; k < SIDE; k++) {
//				if (hiddenBoard[i][k] == null) {
//					hiddenBoard[i][k] = " ";
//				}
//				System.out.print(hiddenBoard[i][k] + " ");
//			}
//			System.out.println();
//		}
//		
//		/**
//		for (int i = 0; i < 4; i++) {
//			int xpos = r.nextInt(SIDE-1) + 1;
//			int ypos = r.nextInt(SIDE-1) + 1;
//			
//			hiddenBoard[xpos][ypos] = "S";
//		}
//		*/
//	}
//	
//	public void checkPosition(int x, int y) {
//		if (board[x][y] == EMPTY) {
//			miss(x, y);
//		}
//		if (hiddenBoard[x][y] == "S") {
//			hit(x, y);
//		}
//	}
//	
//	public boolean winnerExists() {
//		for (int i = 0; i < SIDE; i++) {
//			for (int k = 0; k < SIDE; k++) {
//				if (hiddenBoard[i][k] == "S") {
//					return false;
//				}
//			}
//		}
//		
//		return true;
//	}
//	
//	public String[][] getBoard(){
//		return board;
//	}
	
	
	
	
}
