import java.util.Random;
import java.util.Random.*;

public class ComputerPerson extends Player {
	
	private VisibleBoard personVisible = new VisibleBoard();
	private HiddenBoard personHidden = new HiddenBoard();
	private Ships carrier = new Ships("Carrier", 5);
	private Ships submarine = new Ships("Submarine", 4);
	private Ships destroyer = new Ships("Destroyer", 3);
	private Random r = new Random();
	
	/**
	 * @param name
	 */
	public ComputerPerson(String name) {
		super(name);
		setShips();
//		Board.printBoard(personHidden.getHidden());

	}
	
	/**
	 * @param s
	 */
	public void setOneShip(Ships s) {
		int row = getValid();
		
		int col = getValid();
		
		while(!(personHidden.isValidStarting(row, col))) {
			row = getValid();

			col = getValid();

		}
		
		String dir = getValidDirection();
		
		while(!(personHidden.isValidDirection(row, col, s.getLength(), dir))) {
			dir = getValidDirection();
		}
		
//		System.out.println("Row: " + row + " , Col: " + col + ", Dir: " + dir);
		s.setShipCoordinate(col, row, dir);
		setShipHidden(s.getCoordinates(), s.getID());

		
	}
	
	/* (non-Javadoc)
	 * @see Player#setShips()
	 */
	public void setShips() {
		setOneShip(carrier);
		setOneShip(submarine);
		setOneShip(destroyer);
		
	}
	
	/**
	 * @param coord
	 * @param id
	 */
	private void setShipHidden(int[][] coord, String id) {
		for(int row = 0; row < coord.length; row++) {
			personHidden.setHiddenBoard(coord[row][0], coord[row][1], id);
		}
	}
	
//	private int getValidY() {
//		String test = in.next();
//		test = test.toLowerCase();
//		boolean valid = true;
//		
//		if(test.compareTo("a") < 0 || test.compareTo("j") > 0) {
//			valid = false;
//		} else {
//			valid = true;
//		}
//		
//		String test1 = test;
//		while(!valid) {
//			System.out.print("Invalid coordinate, enter a valid coordinate from a to j--> ");
//			
//			test1 = in.next();
//			if(test1.compareTo("a") < 0 || test1.compareTo("j") > 0) {
//				valid = false;
//			} else {
//				valid = true;
//			}
//
//		}
//		
//		char testChar = test1.charAt(0);
//		
//		return (testChar - 'a');
//	}
	
	/**
	 * @return
	 */
	public int getValid() {

		int test = r.nextInt(10);
		
		boolean valid = true;
		
		if(test < 0 || test > 9) {
			valid = false;
		} else {
			valid = true;
		}
		
		
		while(!valid) {
			
			test = r.nextInt(10);
			if(test < 0 || test > 9) {
				valid = false;
			} else {
				valid = true;
			}

		}

		return test;
	}
	
	/**
	 * @return
	 */
	private String getValidDirection() {
		String dir = "";
		
		int dirIndex = r.nextInt(4);
		if(dirIndex == 0) {
			dir = "left";
		}

		if(dirIndex == 1) {
			dir = "up";
		}

		if(dirIndex == 2) {
			dir = "right";
		}

		if(dirIndex == 3) {
			dir = "down";
		}

		return dir;
	
	}
	
	/**
	 * @return
	 */
	public VisibleBoard getVisible() {
		return personVisible;
	}
	
	/**
	 * @return
	 */
	public HiddenBoard getHidden() {
		return personHidden;
	}
	
	/**
	 * 
	 */
	public void printHidden() {
		Board.printBoard(personHidden.getHidden());
	}
	
	/**
	 * 
	 */
	public void printVisible() {
		Board.printBoard(personVisible.getBoard());
	}
	
	/**
	 * @return
	 */
	public String[][] getComputerVisibleBoard(){
		return personVisible.getBoard();
	}
	
	
	
}
