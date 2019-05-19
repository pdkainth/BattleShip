import java.util.*;

public abstract class Player{
	
	private String name;

	/**
	 * @param name
	 */
	public Player(String name) {
		this.name = name;
	}	
	
	/**
	 * 
	 */
	public abstract void setShips();
	
	/**
	 * @return
	 */
	public String getName() {
		return name;
	}
}

