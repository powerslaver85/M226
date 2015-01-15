package lektion_4;

/**Hausaufgabe_4.java
 * @version		1.0
 * @author 		Lord Ramon Schenk (Der Titel ist echt)
 * @date		02/NOV/2014
 * Modul:		M226
 * Klasse:		Inf12.5H
 * 
 * Note			Es sollen Strings mit dem Operator "=="
 * 				und der Methode equals() verglichen werden.
 * 				Zudem soll der Unterschied der beiden Varianten
 * 				eroertert werden.
 */
public class Hausaufgabe_4 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String a = new String("hallo");
		String b = new String("hallo");
		String c = a; //c referenziert a
		
		int d = 10;
		int e = 10;
		String f = new String("10");
		
		/* Der Operator == vergleicht die Identitaet bzw die Referenz 
		 * des Objekts. 
		 * 
		 * equals() kann nicht auf Primitive Datentypen (int) angewendet werden
		 * (ausgenommen man implementiert es selbst). 
		 * 
		 * Unterschied:
		 * == prüft auf Identität der Attribute, auch wenn a & b Inhaltlich identisch
		 * sind, ist es die referenz bzw. die Speicheraddresse nicht. c == a hingegen
		 * liefert true, da c auf die Variable a referenziert, und es sich somit um
		 * die selbe Variable handelt, sie wurde lediglich referenziert, die Addresse
		 * der beiden ist allerdings identisch.
		 * 
		 * equals() prüft in der Regel auf gleichheit des Inhalts, jedenfalls bei String
		 * es gibt andere Datentypen bei denen equals etwas anders implementiert wurde.
		 * In dieser Hausaufgabe beschränken wir uns allerdings auf Strings. equals() prüft
		 * in diesem Fall lediglich ob a und b den selben Inhalt besitzen, das tun sie, deshalb 
		 * true.
		 * 
		 * Ausnahmen: 
		 * equals() wird jeweils von der Superklasse Object geerbt, es gibt allerdings Klassen 
		 * die equals() nicht für ihre bedürftnisse überschreiben (z.B. StringBuffer) in diesem
		 * Fall wird der default Typ der equals() Methode geerbt, diese Default Variante weis nicht
		 * was sie vergleicht (da sie von Object kommt), daher vergleicht sie wie == die Identität also
		 * die Speicheraddresse, nicht den Inhalt.
		 * */
		
		System.out.print("Vergleich mit Operator: a == b ergibt -> ");
		System.out.println(a == b); // False -> verschiedene Referenzen.
		
		System.out.print("Vergleich mit Operator: a == c ergibt -> ");
		System.out.println(a == c); // True -> c referenziert auf a = Identisches Objekt
		
		System.out.print("Vergleich mit equals() Methode: a.equals(b) ergibt -> ");
		System.out.println(a.equals(b)); // True -> Inhalt & Datentyp identisch
		
		System.out.print("Vergleich mit equals() Methode: a.equals(c) ergibt -> ");
		System.out.println(a.equals(c)); // True -> Inhalt & Datentyp identisch
		
		System.out.print("Vergleich mit Operator: d == e ergibt -> ");
		System.out.println(d == e); // True -> Komisch...
	
		System.out.print("Vergleich mit equals() Methode: d.equals(e) ergibt -> ");
		//System.out.println(d.equals(e)); equals() ist nicht auf Primitive Datentypen anwendbar
		
	}

}
