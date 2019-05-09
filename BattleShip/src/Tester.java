import java.util.*;

public class Tester {

	public static void main(String args[]) {
		Board b = new Board();

		b.printBoard();
		
		System.out.println("Placing ships now");
		
		b.placeShips();
		
		b.printBoard();
		
		Scanner in = new Scanner(System.in);
		
		
		
		
		while (!b.winnerExists()) {
			System.out.print("Where would you like to hit?");

			int xpos = in.nextInt();
			int ypos = in.nextInt();

			
			if (!b.alreadyChosen(xpos, ypos)) {
				System.out.println("Ok");
				
				b.checkPosition(xpos, ypos);
				
			}else {
				System.out.println("Enter another location. That location is already taken or is invalid.");
			}
			
			b.printBoard();
			
		}
		
		System.out.println("WE HAVE A WINNER");
		System.out.println("CONGRATS!!!");
		in.close();

	}
}
