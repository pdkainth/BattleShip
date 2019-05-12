
public class HiddenBoard extends Board{
	
	private String[][] hidden = new String[getLength()][getLength()];
	private final String EMPTY = "-";
	private final String HIT = "X";
	
	public HiddenBoard() {
		for(int row = 0; row < hidden.length; row++) {
			for(int col = 0; col < hidden[row].length; col++) {
				hidden[row][col] = EMPTY;
			}
		}
	}
	
	public void setHiddenBoard(int r, int c, String id) {
		hidden[r][c] = id;
	}
	
	public String[][] getHidden(){
		return hidden;
	}
	
	public boolean hasWon() {
		boolean won = true;
		
		for(int row = 0; row < hidden.length; row++) {
			for(int col = 0; col < hidden[row].length; col++) {
				if(!hidden[row][col].equals(EMPTY) || !hidden[row][col].equals(HIT)) {
					won = false;
				}
			}
		}
		
		return won;
		
	}


}
