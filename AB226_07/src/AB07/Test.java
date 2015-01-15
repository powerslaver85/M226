package AB07;

//Runner & Testklasse

import java.util.Vector;

public class Test {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Figur f;
		
		f = new Rechteck(10, 20, 10, 10);
		f = new Kreis(10, 10, 10);
		f.laenge = 70;
		
		//f = new Linie5(10, 20, 30, 40);
		f.move(15, 15);
		
		Rechteck r = new Rechteck(200, 300, 100, 100);
		r.move(30, 20);
		
		Linie l = new Linie(180, 90, 130, 340);
		l.move(10, 10);
		
		Kreis k = new Kreis(400, 60, 60);
		
		//Zeichnung z = new Zeichnung(new Figur[]{f, r, l, k});
		Zeichnung z = new Zeichnung(new Vector<>());
		//z.addFigur(f);
		//z.addFigur(k);
		
		//aufgabe 3
		Zeichenbrett zb = new Zeichenbrett();
		zb.zeige(z);
		
		/*System.out.printf("Rechteck -> Posx: %d, Posy: %d, L�nge: %d, Breite: %d", r.px, r.py, r.laenge, r.getBreite());
		System.out.println();
		System.out.printf("Linie -> Posx: %d, Posy: %d, Posx2: %d, Posy2: %d", l.px, l.py, l.getPx2(), l.getPy2());
		System.out.println();
		System.out.printf("Kreis -> Posx: %d, Posy: %d, Radius: %d", f.px, f.py, f.laenge);*/

	}

}
