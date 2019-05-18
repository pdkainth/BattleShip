import java.util.Scanner;


public class PlayerPerson extends Player {
	
	private VisibleBoard personVisible = new VisibleBoard();
	private HiddenBoard personHidden = new HiddenBoard();
	private Ships carrier = new Ships("Carrier", 5);
	private Ships submarine = new Ships("Submarine", 4);
	private Ships destroyer = new Ships("Destroyer", 3);
	private Scanner in = new Scanner(System.in);
	
	public PlayerPerson(String name) {
		super(name);
		setShips();
	}
	
	public void setOneShip(Ships s) {
		System.out.print("Enter the starting column for the " +  s.getName() + " ( " + s.getLength() + " units long) -- > ");
		int row = getValid();
		
		System.out.print("Enter the starting row for the " +  s.getName() + " ( " + s.getLength() + " units long) -- > ");
		int col = getValid();
		
		while(!(personHidden.isValidStarting(col, row))) {
			System.out.println("Invalid starting coordinate, this spot has already been taken.");

			System.out.print("Please enter another starting column for the " + s.getName() + " --> ");
			row = getValid();

			System.out.print("Please enter another starting row for the " + s.getName() + " --> ");
			col = getValid();

		}
		
		System.out.print("Please choose the direction for the " + s.getName() + " (up, down, left, or right) --> ");
		String dir = getValidDirection();
		
		while(!(personHidden.isValidDirection(row, col, s.getLength(), dir))) {
			System.out.println("Invalid direction, ship will not fit.");
			
			System.out.print("Pease enter another direction --> ");
			dir = getValidDirection();
		}
		
		s.setShipCoordinate(col, row, dir);
		setShipHidden(s.getCoordinates(), s.getID());
		Board.printBoard(personHidden.getHidden());

		
	}
	
	public void setShips() {
		Board.printBoard(personHidden.getHidden());
		System.out.println();
		setOneShip(carrier);
		System.out.println();
		setOneShip(submarine);
		System.out.println();
		setOneShip(destroyer);
		
	}
	
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
	
	private int getValid() {
		int test = in.nextInt();
		boolean valid = true;
		
		if(test < 0 || test > 9) {
			valid = false;
		} else {
			valid = true;
		}
		
		
		while(!valid) {
			System.out.print("Invalid coordinate, enter a valid coordinate from 0 to 9--> ");
			
			test = in.nextInt();
			if(test < 0 || test > 9) {
				valid = false;
			} else {
				valid = true;
			}

		}
		
		return test;
	}
	
	private String getValidDirection() {
		String dir = in.next();
		dir = dir.toLowerCase();
		
		boolean valid = (dir.equals("right")) || (dir.equals("left")) || (dir.equals("up")) || (dir.equals("down"));
		
		while(!valid) {
			System.out.print("Invalid direction, please enter left, right, up, or down --> ");

			dir = in.next();
			dir = dir.toLowerCase();
			
			valid = (dir.equals("right")) || (dir.equals("left")) || (dir.equals("up")) || (dir.equals("down"));

		}
		
		return dir;
	
	}
	
	public VisibleBoard getVisible() {
		return personVisible;
	}
	
	public HiddenBoard getHidden() {
		return personHidden;
	}
	
	public void printHidden() {
		Board.printBoard(personHidden.getHidden());
	}
	
	public void printVisible() {
		Board.printBoard(personVisible.getBoard());
	}

	
	
	
	
}
