package AB07;

//Klasse Zeichnung nimmt Verarbeitet Rechteck/Kreis/Linie

import java.awt.Graphics;
import java.util.Vector;

public class Zeichnung {

	//Figur[] figuren;
	Vector<Figur> figuren = new Vector<Figur>();
	
	
	public Zeichnung(Vector<Figur> f) {
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
		
	}
	
	public void addFigur(Figur f) {
		figuren.add(f);
	}
	
}
