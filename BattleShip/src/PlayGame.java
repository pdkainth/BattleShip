import java.util.Iterator;
import java.util.Scanner;

public class PlayGame {
	
	/**
	 * 
	 */
	private PlayerPerson p;
	/**
	 * 
	 */
	private Scanner in = new Scanner(System.in);
	/**
	 * 
	 */
	private ComputerPerson c;
	/**
	 * 
	 */
	private int turn = 0;
	
	/**
	 * 
	 */
	public PlayGame() {
		preGame();
		currentGame();
	}
	
	/**
	 * 
	 */
	public void preGame() {
		System.out.println("Welcome to Battleship!");
		System.out.println();
		System.out.println("In this game, you will be playing against a computer and trying to hit its ships");
		System.out.println();
		System.out.println("Before we start playing the game, we need to set up your ships");
		System.out.print("What do you want your name to be? ");
		String name = in.next();
		System.out.println();
		p = new PlayerPerson(name);
		c = new ComputerPerson("bot");
		System.out.println("Now that you have seen your ships, you are ready to play. Good luck!");
		
	}
	
	/**
	 * 
	 */
	public void currentGame() {
		System.out.println("Your board: ");
		p.printHidden();
		System.out.println();
		
		System.out.println("\nYour opponents board: ");
		c.printVisible();
		System.out.println();
		
		while(!c.getHidden().hasLost() && !p.getHidden().hasLost()) {
			if(turn % 2 == 0) {
				onePersonTurn();
				
			} else {
				oneBotTurn();
			}
		}
		
		if(p.getHidden().hasLost() == false) {
			System.out.println("Congratulations, you've won!");
		} else {
			System.out.println("Better luck next time!");
		}
		
	}
	
	/**
	 * 
	 */
	private void onePersonTurn() {
		turn++;
		System.out.println("Where do you want to strike?");
		int potentialRow = getRow();
		int potentialCol = getCol();
		
		boolean already = c.getVisible().alreadyShot(potentialRow, potentialCol);
		
		while(already) {
			System.out.println("You have already attemted to strike at this point, please pick another point.");
			potentialRow = getRow();
			potentialCol = getCol();
			already = c.getVisible().alreadyShot(potentialRow, potentialCol);
		}
		
		boolean hit = c.getHidden().didHit(potentialRow, potentialCol);
		if(hit) {
			c.getVisible().hit(potentialRow, potentialCol);
			c.getHidden().hit(potentialRow, potentialCol);
			System.out.println();
			System.out.println("Nice job, you hit the opponent's ship!");

		} else {
			c.getVisible().miss(potentialRow, potentialCol);
			System.out.println();
			System.out.println("Try again next time!");
		}
		
		c.printVisible();
		System.out.println();
	}
	
	/**
	 * 
	 */
	private void oneBotTurn() {
		turn++;
		int potentialCol = c.getValid();
		int potentialRow = c.getValid();
		
		boolean already = p.getVisible().alreadyShot(potentialRow, potentialCol);
		
		while(already) {
			potentialCol = c.getValid();
			potentialRow = c.getValid();
			already = p.getVisible().alreadyShot(potentialRow, potentialCol);
			
		}
		
		boolean hit = p.getHidden().didHit(potentialRow, potentialCol);
		if(hit) {
			p.getVisible().hit(potentialRow, potentialCol);
			p.getHidden().hit(potentialRow, potentialCol);
			System.out.println();
			System.out.println("Oh no, the opponent hit your ship!");
			
		} else {
			p.getVisible().miss(potentialRow, potentialCol);
			p.getHidden().miss(potentialRow, potentialCol);
			System.out.println();
			System.out.println("The opponent missed your ship!");
		}
		
		p.printHidden();
		System.out.println();

	}
	
	/**
	 * @return
	 */
	private int getRow() {
		System.out.print("Row --> ");
		int potentialRow = in.nextInt();
		
		while(potentialRow < 0 || potentialRow > 9) {
			System.out.print("Invalid row, please enter a row from 0 to 9 --> ");
			potentialRow = in.nextInt();
		}
		
		return potentialRow;
	}
	
	/**
	 * @return
	 */
	private int getCol() {
		System.out.print("Column --> ");
		int potentialCol = in.nextInt();
		
		while(potentialCol < 0 || potentialCol > 9) {
			System.out.print("Invalid column, please enter a column from 0 to 9 --> ");
			potentialCol = in.nextInt();
		}
		
		return potentialCol;
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String args[]) {
		PlayGame pg = new PlayGame();
	}
}
