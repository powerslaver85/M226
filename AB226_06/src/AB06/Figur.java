package AB06;

import java.awt.Graphics;

public abstract class Figur {

	protected int laenge;
	
	protected int px;
	protected int py;
	
	public Figur(int px, int py) {
		this.px = px;
		this.py = py;
	}
	
	void move(int dx, int dy) {
		this.px += dx;
		this.py += dy;
	}
	
	//Aufgabe2
	public void zeichne(Graphics g) {
		
	}
}
