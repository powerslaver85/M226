package AB226_04_A1;

/* Vererbung
 * Mit dem Schlüsselwort "extends" und dem darauf folgenden Klassenname
 * wird eine Subklasse bzw. abgeleitete Klasse eingeleitet. Die Klasse
 * von der abgeleitet wird nennt man Superklasse oder Basisklasse.
 * 
 * Diese Subklasse kann auf alle Attribute und Methoden der Superklasse
 * zugreiffen (Ausser sie sind private)
 * 
 * Die Subklasse kann eigene Methoden und Attribute besitzenm es können
 * auch Elemente überschrieben (Override) werden die Signatur bleibt 
 * allerdings gleich. Spezielle Eigenschafften der Subklasse können
 * z.B im Methodenrumpf implementiert werden. 
 */
public class Girokonto extends Konto {
	double limit;
	
	Girokonto(int kontonummer, double saldo, double limit) {
		super(kontonummer, saldo); //Kontonummer und Saldo werden aus Superklasse bezogen
		this.limit = limit;
	}
	
	void setLimit(double limit) {
		this.limit = limit;
	}
	//zahleAus prüft ob der gewünschte betrag Kl/Gleich der Summe von saldo & limit ist.
	//Die Methode würde überschrieben um den Anforderungen eines Girokontos gerecht zu werden
	//sprich der Überziehungskredit wird geprüft im Gegensatz zum normalen Konto.
	void zahleAus(double betrag) {
		if (betrag <= saldo + limit)
			saldo -= betrag;
	}
	
	void info() {
		super.kontoInfo();
		System.out.println("Limit: " + limit);
	} 
	
	
}
