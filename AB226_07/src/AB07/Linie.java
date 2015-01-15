package AB07;

//Subklasse von Figur für Linien

import java.awt.Graphics;

public class Linie extends Figur {

	private int px2;
	private int py2;
	
	public Linie(int px, int py, int px2, int py2) {
		super(px, py);
		this.setPx2(px2);
		this.setPy2(py2);
	}

	public int getPx2() {
		return px2;
	}

	public void setPx2(int px2) {
		this.px2 = px2;
	}

	public int getPy2() {
		return py2;
	}

	public void setPy2(int py2) {
		this.py2 = py2;
	}
	
	void move(int dx, int dy) {
		this.px += dx;
		this.py += dy;
		this.px2 += dx;
		this.py2 += dy;
	}

	public void zeichne(Graphics g) {
		g.drawLine(px, py, px2, py2);
	}
}

