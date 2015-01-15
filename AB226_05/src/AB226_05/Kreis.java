package AB226_05;

public class Kreis extends Figur {
	public Kreis(int posx, int posy) {
		super(posx, posy);
	}

	private int radius;
	@SuppressWarnings("unused")
	private final double pi = 3.14;
	
	



	/**
	 * @return the radius
	 */
	public int getRadius() {
		return radius;
	}

	/**
	 * @param radius the radius to set
	 */
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
}
