package AB06;

import java.awt.Graphics;

public class PolyLinie extends Figur {

	private int px2;
	private int py2;
	private int px3;
	private int py3;
	
	public PolyLinie(int px, int py, int px2, int py2, int px3, int py3) {
		super(px, py);
		
		this.px2 = px2;
		this.py2 = py2;
		this.px3 = px3;
		this.py3 = py3;
	}

	void move(int dx, int dy) {
		this.px += dx;
		this.py += dy;
		this.px2 += dx;
		this.py2 += dy;
		this.px3 += dx;
		this.py3 += dy;
	}
	
	public void zeichne(Graphics g) {
		int[] xs = {px, px2, px3};
		int[] ys = {py, py2, py3};
		
		g.drawPolyline(xs, ys, 3);
	}
	
}
