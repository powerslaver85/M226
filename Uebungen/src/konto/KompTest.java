package konto;

public class KompTest {
	public static void main(String[] args) {
		
		Konto k = new Girokonto(1020, 800., 2000.);

		//Die tatsächliche Klasse des Objekts bestimmt ob auf Methoden
		//Der Super oder Subklasse zugegriffen wird, indemfall die Subklasse.
		k.zahleAus(3000.);
		System.out.println(k.getSaldo());

	
		//Explizite Typenumwandlung (Downcast), da setLimit in der Klasse Konto nicht vorhanden ist
		((Girokonto) k).setLimit(2500.);

		k.zahleAus(3000.);
		System.out.println(k.getSaldo());
	
		System.out.println(k instanceof Konto);
		//oder
		System.out.println(k instanceof Girokonto);
		
		//Ergeben beide True da auf beide Klassen verwiesen wird von der Referenzvariabel (k)
	}
}
