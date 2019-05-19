public class Ships {
	
	private int length;
	private String name;
	private int[][] coordinates;
	
	/**
	 * @param name
	 * @param length
	 */
	public Ships(String name, int length) {
		this.name = name;
		this.length = length;
		coordinates = new int[length][2];
	}
	
	/**
	 * @param startRow
	 * @param startCol
	 * @param dir
	 */
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
	
	/**
	 * @param board
	 * @param r
	 * @param c
	 * @return
	 */
	public boolean isValid(String[][] board, int r, int c) {
		if(board[r][c].equals("-")) {
			return true;
		}
		
		return false;
	}
	
	/**
	 * @return
	 */
	public int[][] getCoordinates(){
		return coordinates;
	}
	
	/**
	 * @return
	 */
	public String getID() {
		return name.charAt(0) + "";
	}
	
	/**
	 * @return
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @return
	 */
	public int getLength() {
		return length;
	}

}

