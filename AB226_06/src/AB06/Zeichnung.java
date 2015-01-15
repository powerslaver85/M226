package AB06;

import java.awt.Graphics;

public class Zeichnung {

	Figur[] figuren;
	
	public Zeichnung(Figur[] f) {
		this.figuren = f;
	}
	
	//aufgabe 2
	public void zeichneFiguren(Graphics g) {
		for (Figur f : figuren) {
			f.zeichne(g);
		}
	}

	public void zeichne(Graphics g) {
		
	}
	
	public void move(int dx, int dy) {
		for (Figur f: figuren) {
			//f.px += dx;
			//f.py += dy;
			
			f.move(dx, dy);
			System.out.println(f.px + "\t" + f.py);	
		}
	}
	
}
