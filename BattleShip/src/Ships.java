public class Ships {
	
	private int length;
	private String name;
	private int[][] coordinates;
	
	public Ships(String name, int length) {
		this.name = name;
		this.length = length;
		coordinates = new int[length][2];
	}
	
	public void setShipCoordinate(int startRow, int startCol, String dir) {
		coordinates[0][0] = startRow;
		coordinates[0][1] = startCol;

		for(int i = 1; i < length; i++) {
			
			if(dir.equals("up")) {
				coordinates[i][0] = coordinates[0][0] - i;
				coordinates[i][1] = coordinates[0][1];
			}
			
			if(dir.equals("down")) {
				coordinates[i][0] = coordinates[0][0] + i;
				coordinates[i][1] = coordinates[0][1];
			}
			
			if(dir.equals("left")) {
				coordinates[i][0] = coordinates[0][0];
				coordinates[i][1] = coordinates[0][1] - i;
			}
			
			if(dir.equals("right")) {
				coordinates[i][0] = coordinates[0][0];
				coordinates[i][1] = coordinates[0][1] + i;
			}
			


		}
	}
	
	public boolean isValid(String[][] board, int r, int c) {
		if(board[r][c].equals("-")) {
			return true;
		}
		
		return false;
	}
	
	public int[][] getCoordinates(){
		return coordinates;
	}
	
	public String getID() {
		return name.charAt(0) + "";
	}
	
	public String getName() {
		return name;
	}
	
	public int getLength() {
		return length;
	}

}

