package AB06;

import java.awt.Graphics;

public class Kreis extends Figur {

	//private int radius;
	
	public Kreis(int px, int py, int radius) {
		super(px, py);
		this.laenge = radius;
	}

	public void zeichne(Graphics g) {
		g.drawOval(px, py, laenge, laenge);
	}
}
