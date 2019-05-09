public abstract class Ships {
	
	private int [] carrier;
	private int [] battleShip;
	private int [] cruiser;
	private int [] subMarine;
	private int [] destroyer;
	
	public Ships() {
	}
	
	public void setCarrier(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4, int x5, int y5) {
		
		carrier[0] = x1;
		carrier[1] = y1;
		carrier[2] = x2;
		carrier[3] = y2;
		carrier[4] = x3;
		carrier[5] = y3;
		carrier[6] = x4;
		carrier[7] = y4;
		carrier[8] = x5;
		carrier[9] = y5;

	}
	
	public void setBattle(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
		
		battleShip[0] = x1;
		battleShip[1] = y1;
		battleShip[2] = x2;
		battleShip[3] = y2;
		battleShip[4] = x3;
		battleShip[5] = y3;
		battleShip[6] = x4;
		battleShip[7] = y4;

	}
	
	
	public void setCruiser(int x1, int y1, int x2, int y2, int x3, int y3) {
		
		cruiser[0] = x1;
		cruiser[1] = y1;
		cruiser[2] = x2;
		cruiser[3] = y2;
		cruiser[4] = x3;
		cruiser[5] = y3;

	}
	
	public void setSub(int x1, int y1, int x2, int y2, int x3, int y3) {
		
		subMarine[0] = x1;
		subMarine[1] = y1;
		subMarine[2] = x2;
		subMarine[3] = y2;
		subMarine[4] = x3;
		subMarine[5] = y3;
		
	}
	
	
	public void setDestroyer(int x1, int y1, int x2, int y2) {
		
		destroyer[0] = x1;
		destroyer[1] = y1;
		destroyer[2] = x2;
		destroyer[3] = y2;
		
	}
	
	public abstract void setCarrier();
	public abstract void setBattle();
	public abstract void setCruiser();
	public abstract void setSub();
	public abstract void setDestroyer();

	public int[] returnCarrier() {
		return carrier;
	}
	
	public int[] returnBattleShip() {
		return battleShip;
	}

	public int[] returnCruiser() {
		return cruiser;
	}

	public int[] returnSub() {
		return subMarine;
	}

	public int[] returnDestroyer() {
		return destroyer;
	}


	
}

