package AB226_05;

public class Rechteck extends Figur {
	private int breite, hoehe;
	
	
	public Rechteck(int x, int y,int b, int h) {
		super(x, y);
		breite = b; hoehe = h;
	}


	/**
	 * @return the breite
	 */
	public int getBreite() {
		return breite;
	}


	/**
	 * @param breite the breite to set
	 */
	public void setBreite(int breite) {
		this.breite = breite;
	}


	/**
	 * @return the hoehe
	 */
	public int getHoehe() {
		return hoehe;
	}


	/**
	 * @param hoehe the hoehe to set
	 */
	public void setHoehe(int hoehe) {
		this.hoehe = hoehe;
	}
	
	
	
}
