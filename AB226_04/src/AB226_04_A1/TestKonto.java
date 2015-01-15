//Titel: KontoTest.java | Author: Ramon Schenk | Date: 02/09/2014
package AB226_04_A1;




/** KontoTest.java 
*  Diese Klasse wird genutzt um die in Konto.java erstellten Methoden
*  zu nutzen, und um aus der Konto Klasse ein Objekt zu erstellen.
*  Die Klasse ist ausserdem ein Runner (Main-Methode).
*  @author Powerslave
*/

public class TestKonto {
	
	//RUNNER
	public static void main(String[] args) {
		//Erzeuge Kundenobjekt welches auf die Klasse Kunde referenziert
		Kunde kunde1 = new Kunde("Muster", "Max", 2);
		Kunde kunde2 = new Kunde("Meier", "Fritz", 3);
		
		//Erzeuge Konobjekt welches auf die Klasse Konto referenziert und das Referenzobjekt Kunde1 als Inhaber einbinded
		Konto kundenKonto1 = new Konto(10000, 0.05, kunde1);
		
	
		//Zugriff auf kundenKonto1 um inhaber zu ändern
		kundenKonto1.setInhaber(kunde2);
		
		//Modifizieren von kunde1 mit entsprechenden Setter.
		kunde1.setName("Meiser");
		kunde1.setVorname("Hans");
		kunde1.setKundennummer(1);
		
		//Beispielzugriffe auf die Kontoobjekte
		kundenKonto1.setSaldo(15000.);	
		kundenKonto1.einZahlen(500.);		
		

		

	
		
		//Ermittle Zins von kundenKonto1
		kundenKonto1.setZinssatz(0.04); //Setze Zinssatz auf 4%
		
		//System.out.println(kundenKonto1.getInhaber().getInhaberInfo()); //Ausgabe Inhaber
		//double verzinst = kundenKonto1.verzinsen(365); 
		//System.out.println("Zinsgewinn kundenKonto1: " + verzinst);
		//System.out.println("Saldo mit Zinsgewinn: " + (kundenKonto1.getSaldo() + verzinst));

		
	
		
		kundenKonto1.kontoInfo();


	}

}