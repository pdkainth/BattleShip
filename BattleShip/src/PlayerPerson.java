import java.util.Scanner;

public class PlayerPerson extends Player {
	
	private VisibleBoard personVisible = new VisibleBoard();
	private HiddenBoard personHidden = new HiddenBoard();
	private Ships carrier = new Ships("Carrier", 4);
	private Ships cruiser = new Ships("Cruiser", 3);
	private Ships destroyer = new Ships("Destroyer", 2);
	private Scanner in = new Scanner(System.in);
	
	public PlayerPerson(String name) {
		super(name);
	}
	
	public void setOneShip(Ships s) {
		Board.printBoard(personHidden.getHidden());
		System.out.print("Enter the starting x coordinates for the " +  s.getName() + " ( " + s.getLength() + " units long) -- > ");
		int col = getValidX();
		
		System.out.print("Enter the starting y coordinates for the " +  s.getName() + " ( " + s.getLength() + " units long) -- > ");
		int row = getValidY();
		
		while(!(personHidden.isValidStarting(row, col))) {
			System.out.println("Invalid starting coordinate, this spot has already been taken.");

			System.out.print("Please enter another starting x coordinate for the " + s.getName() + " --> ");
			col = getValidX();

			System.out.print("Please enter another starting y coordinate for the " + s.getName() + " --> ");
			row = getValidY();

		}
		
		System.out.print("Please choose the direction for the " + s.getName() + " (up, down, left, or right) --> ");
		String dir = get
		
	}
	
	private void setShipHidden(int[][] coord, String id) {
		for(int row = 0; row < coord.length; row++) {
			personHidden.setHiddenBoard(coord[row][0], coord[row][1], id);
		}
	}
	
	private int getValidY() {
		String test = in.next();
		test = test.toLowerCase();
		boolean valid = true;
		
		if(test.compareTo("a") < 0 || test.compareTo("j") > 0) {
			valid = false;
		} else {
			valid = true;
		}
		
		String test1 = test;
		while(!valid) {
			System.out.print("Invalid coordinate, enter a valid coordinate from a to j--> ");
			
			test1 = in.next();
			if(test1.compareTo("a") < 0 || test1.compareTo("j") > 0) {
				valid = false;
			} else {
				valid = true;
			}

		}
		
		char testChar = test1.charAt(0);
		
		return (testChar - 'a');
	}
	
	private int getValidX() {
		int test = in.nextInt();
		boolean valid = true;
		
		if(test < 0 || test > 9) {
			valid = false;
		} else {
			valid = true;
		}
		
		int test1 = test;
		while(!valid) {
			System.out.print("Invalid coordinate, enter a valid coordinate from 0 to 9--> ");
			
			test1 = in.nextInt();
			if(test1 < 0 || test1 > 9) {
				valid = false;
			} else {
				valid = true;
			}

		}
		
		return test1;
	}
	
	private String getValidDirection() {
		
	}
	
	
}
