//Titel: Konto.java | Author: Ramon Schenk | Date: 02/09/2014
package AB226_04_A1;

/** 
*  Konto.java 
*  Klasse dient der Demonstration von Objektorienterter 
*  Programmierung, mit Objekten und Methoden, sowie der
*  Nutzung von Getter und Setter f�r einen sauberen, sicheren
*  und wartbaren code.
*  @author Powerslave
*/

public class Konto {
	private double zinssatz;
	protected double saldo;
	private Kunde inhaber;
	//GETTER
	
	/**
	 * @return double saldo			Rückgabe der Variable "saldo"
	 */
	public double getSaldo() {
		
		return saldo;
	}
	
	public Kunde getInhaber() {
		return inhaber;
	}
	
	//SETTER
	
	/**
	 * @param double betrag 		Initialisiert die Variable "saldo"
	 */
	public void setSaldo(double betrag) {
	
		saldo = betrag;
	}
	
	/**
	 * @param double zins			Initialisert die Variable "zinssatz"
	 */
	public void setZinssatz(double zinsSatz) {
		zinssatz = zinsSatz;
	}
	
	public void setInhaber(Kunde inhaber) {
		this.inhaber = inhaber;
	}
	
	
	//ANDERE METHODEN
	
	/**
	 * @param betrag				Addiere betrag zu saldo
	 */
	public void einZahlen(double betrag) {
		saldo += betrag;
	}
	
	/**
	 * @param double laufzeit		Die Anzahl Tage für die der Zins berechnet wird
	 * @return double zins			Mittels Zinsformel ermittelt. 
	 */
	public double verzinsen(double laufzeit) {
		return saldo * zinssatz * laufzeit / 365;
	}
	
	//Ausgabe Kontoinformation 
	public void kontoInfo(){
		//System.out.println(getInhaber().getInhaberInfo());
		System.out.println("Saldo: " + saldo + "\nZinssatz: " + zinssatz);
		
	}
	
	
	
	//KONSTRUKTOREN
	
	//Default Konstrukor (Keine Parameter beim erstellen des Objekts)
	Konto(){}
	
	//Konstruktor für Girokonto
	Konto(int kontonummer, double saldo) {} 
	
	//Konstruktor für Zinssatz (Double Wert als Param)
	Konto(double zinssatz) {	
		this.zinssatz = zinssatz;
	}
	
	Konto(double saldo, double zinssatz, Kunde inhaber) {
		this.saldo = saldo;
		this.zinssatz = zinssatz;
		this.inhaber = inhaber;
		
	}
}