package AB06;

public class Test {

	public static void main(String[] args) {
		
		//Figur f;
		Figur fL0 = new Linie(100, 200, 300, 400);
		//fL0.move(15, 15);
				
		Figur fR0 = new Rechteck(300, 150, 100, 80);
		fR0.laenge = 100;
				
		Figur fK0 = new Kreis(10, 10, 50);
				
		Figur fP0 = new PolyLinie(25, 75, 80, 160, 90, 50);
				
		/*Rechteck r = new Rechteck(200, 300, 100, 100);
		r.move(30, 20);
		Linie l = new Linie(180, 90, 130, 340);
		l.move(10, 10);
		Kreis k = new Kreis(400, 60, 60);*/
		
		Zeichnung z = new Zeichnung(new Figur[]{fL0, fR0, fK0, fP0});
		//z.move(100, 100);
				
		//aufgabe 3
		Zeichenbrett zb = new Zeichenbrett();
		zb.zeige(z);
		
		/*
		System.out.printf("Rechteck -> Posx: %d, Posy: %d, L�nge: %d, Breite: %d", fR0.px, fR0.py, fR0.laenge, ((Rechteck)fR0).getBreite());
		System.out.println();
		System.out.printf("Linie -> Posx: %d, Posy: %d, Posx2: %d, Posy2: %d", fL0.px, fL0.py, ((Linie)fL0).getPx2(), ((Linie)fL0).getPy2());
		System.out.println();
		System.out.printf("Kreis -> Posx: %d, Posy: %d, Radius: %d", fK0.px, fK0.py, fK0.laenge);
		*/

		/*
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
		
		Zeichnung z = new Zeichnung(new Figur[]{f, r, l, k});
		
		//aufgabe 3
		Zeichenbrett zb = new Zeichenbrett();
		zb.zeige(z);
		*/
		
		/*System.out.printf("Rechteck -> Posx: %d, Posy: %d, L�nge: %d, Breite: %d", r.px, r.py, r.laenge, r.getBreite());
		System.out.println();
		System.out.printf("Linie -> Posx: %d, Posy: %d, Posx2: %d, Posy2: %d", l.px, l.py, l.getPx2(), l.getPy2());
		System.out.println();
		System.out.printf("Kreis -> Posx: %d, Posy: %d, Radius: %d", f.px, f.py, f.laenge);*/
	}

}
