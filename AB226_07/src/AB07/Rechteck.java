//Klasse: Rechteck | Autor: RSchenk | Bemerkung: Erbt von Figur
package AB07;


//Subklasse von Figur zum erstellen von Rechtecken

import java.awt.Graphics;

public class Rechteck extends Figur {

	//private int laenge;
	private int breite;
			
	public Rechteck(int px, int py, int laenge, int breite) {
		super(px, py);
		this.laenge = laenge;
		this.breite = breite;
	}

	public int getBreite() {
		return breite;
	}

	public void setBreite(int breite) {
		this.breite = breite;
	}

	public void zeichne(Graphics g) {
		g.drawRect(px, py, laenge, breite);
	}
	
}
