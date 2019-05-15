public class Ships {
	
	private int length;
	private String name;
	private int[][] coordinates;
	
	public Ships(String name, int length) {
		this.name = name;
		this.length = length;
		coordinates = new int[length][2];
	}
	
	public void setShipCoordinate(int startX, int startY, String dir) {
		for(int i = 0; i < length; i++) {
			coordinates[0][0] = startX;
			coordinates[0][1] = startY;
			
			if(dir.equals("u")) {
				coordinates[i + 1][0] = coordinates[0][0];
				coordinates[i + 1][1] = startY - i - 1;
			}
			
			if(dir.equals("d")) {
				coordinates[i + 1][0] = coordinates[0][0];
				coordinates[i + 1][1] = startY + i + 1;
			}
			
			if(dir.equals("l")) {
				coordinates[i + 1][0] = startX - i - 1;
				coordinates[i + 1][1] = coordinates[0][1];
			}
			
			if(dir.equals("r")) {
				coordinates[i + 1][0] = startX + i + 1;
				coordinates[i + 1][1] = coordinates[0][1];
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

