import java.util.*;
import javax.swing.JFrame;

public class Tester{
	static Board b;
	static GUI g;
	public static void main(String args[]) {
		//b = new Board();
		//g = new GUI();
		
		PlayerPerson p = new PlayerPerson("Me");
		ComputerPerson c = new ComputerPerson("Bob");
		
		
		

		//b.printBoard();
		//System.out.println("Placing ships now");
		//b.placeShips();
		//b.printBoard();
		
		
		//g.printBoard(b.getBoard());
		//Scanner in = new Scanner(System.in);
		
		
				
		/**
		while (!b.winnerExists()) {
			System.out.print("Where would you like to hit?");

			int ypos = in.nextInt();
			int xpos = in.nextInt();

			if (!b.alreadyChosen(xpos, ypos)) {
				System.out.println("Ok");
				b.checkPosition(xpos, ypos);
				g.printBoard(b.getBoard());
			}else {
				System.out.println("Enter another location. That location is already taken or is invalid.");
			}
			
			b.printBoard();
			
		}
		
		System.out.println("WE HAVE A WINNER");
		System.out.println("CONGRATS!!!");
		in.close();
		*/

	}
	
	/*public void GUIClick(int x, int y) {


		

		if (!b.alreadyChosen(x, y)) {
			b.checkPosition(x, y);
			g.printBoard(b.getBoard());
		}else {
			System.out.println("You have already attacked that spot. Please choose another");
		}
*/		
		
		
//		if (b.winnerExists()) {
//			System.out.println("CONGRATS YOU WIN");
//		}
		

	
	
	}
	
	

