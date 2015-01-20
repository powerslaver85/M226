//Titel: Kunde.java | Author: Ramon Schenk | Date: 02/09/2014
package vererbungKonto;

/** Kunde.java 
*  Erzeugt das Objekt Kunde mit Name, Vorname und Kontonummer
*  @author Powerslave
*/
public class Kunde {
	private String name;
	private String vorname;
	private int kundennummer;
	

	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}



	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}



	/**
	 * @return the vorname
	 */
	public String getVorname() {
		return vorname;
	}



	/**
	 * @param vorname the vorname to set
	 */
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}



	/**
	 * @return the kundennummer
	 */
	public int getKundennummer() {
		return kundennummer;
	}



	/**
	 * @param kundennummer the kundennummer to set
	 */
	public void setKundennummer(int kundennummer) {
		this.kundennummer = kundennummer;
	}

	/**Ausgabe Kundendaten
	 * 
	 * @return vorname, name, kundennummer
	 */

	public String getInhaberInfo(){
		return "Kunde: " + vorname + " " + name + "\n" + "KundenNr.: " + kundennummer;
	}
	
	//KONSTRUKTOR
	//Default
	Kunde() {}

	//Mit Parameter
	Kunde(String name, String vorname, int kundennummer) {	
		this.name = name;
		this.vorname = vorname;
		this.kundennummer = kundennummer;
	}
	
	

}