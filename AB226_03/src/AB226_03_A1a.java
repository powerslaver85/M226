//Titel: AB226_03_A1a | Author: Ramon Schenk | Datum: 01/09/2014


//Aufgabenstellung:
/*Erstellen Sie ein Programm, welches mithilfe eines Arrays die Zeugnisnoten 
*in einem Fach für 10 Schüler erstellt. Der Array soll an eine Methode 
*weitergegeben werden welche die Durchschnittsnote sowie min und max Noten ausgibt. 
*Weitere Bemerkung:
*Originalcode von D. Wenger, wurde von mir in eigenen Stil abgeleitet. Und ins
*Javadoc integriert
* */

//Import von Random um Zufallszahlen zu generieren.
import java.util.Random;

/** Beschreibung AB226_03_A1a
* @author Ramon Schen
* @version 1.0a Sep. 01, 2014
*/
public class AB226_03_A1a {
//RUNNER
	public static void main(String[] args){
//Initialisierung eines neuen Arrays für 10 Schulnoten
double[] Noten = new double[10];

//Array wird mit Zufallswerten aus der Methode getRandomDouble gefüllt
for (int i = 0; i < Noten.length; i++) {
	//Der wert wird zusätzlich * 10 und danach / 10 gerechnet um die
	//Nachkommastellen in den Griff zu bekommen.
	Noten[i] = ((double)(int)(getRandomDouble(1.0, 6.0) * 10)) / 10;
	}

//Zwischenspeichern der Noten aus Methode getAuswertung
double[] resultat = getAuswertung(Noten);
//Durchschnittsnote auf eine Stelle nach dem Komma runden
	resultat[2] = ((double)(int)(resultat[2] * 10)) / 10;

	
//Ausgabe der Zufallsnoten (For-Schleife in Kurzschreibweise)
	System.out.println("=======Noten=======");
	for(int i = 0; i<Noten.length; i++)
		System.out.println("Sch�ler " + i + ": " + Noten[i]);
	System.out.println("===================");
	System.out.println();
	

	
//Ausgabe der Auswertung
	System.out.println("=======Fazit=======");
	System.out.println("H�chstnote: " + resultat[0] + "\nTiefstnote: " + resultat[1]
			+ "\nDurchschnitt: " + resultat[2]);
	
	System.out.println("===================");
}

//FUNKTIONEN
//Randomisierer
private static double getRandomDouble(double min, double max) {
/** Beschreibung getRandomDouble(double min, double max)
* @author			Ramon Schenk / David Wenger
* @param min		Tiefster Double Wert der generiert werden soll.
* @param max		Höchster Double Wert der generiert werden soll
* @return			Zufalls Double Wert zwischen min & max (Einschliesslich)
*/
	return (new Random().nextDouble() * (max - min)) + min;
	//Random().nextDouble generiert eine Zahl zwischen 0.0 und 1.0
	//diese wird mit (max - min) multipliziert und min dazugerechnet.
	//Beispiel: 0.6 * (6-1) + 1 also 5 * 0,6 = 3 + 1 ergibt 4.
	}

//Auswertung
private static double[] getAuswertung(double[] array){
	/** Beschreibung getRandomDouble(double min, double max)
	 * @author			Ramon Schenk / David Wenger
	 * @param array		Array mit Double werten (in diesem Fall die Noten)
	 * @return			Array mit Minimal(0) Maximal(1) und Durschnittswert(2)
	 */	
	//Initialisiere antwort Array mit Referenz auf array[0]
	double antwort[] = {array[0], array[0], 0};
	
	//Array durchlaufen um Max & Minimalwert sowie die Summe zu ermitteln
	//array[0] -> Minimalwert
	//array[1] -> Maximalwert
	//array[2] -> Totalwert -> Durchschnittswert
	for (int i = 0; i < array.length; i++) {
		if (antwort[0] < array[i]) //Wenn Wert in antwort[0] kleiner als array[i]
			antwort[0] = array[i]; //setze antwort[0] auf array[i]
		if (antwort[1] > array[i]) //Wenn antwort[1] grösser als array[i]
			antwort[1] = array[i]; //setze antwort[1] auf array[i]
		antwort[2] += array[i];
	}
	
	//Durchschnitte mithilfe von array.length berechnen
	antwort[2] /= array.length;
	
	//Rückgabe
	return antwort;
}
}

/**
* OUTPUT:
=======Noten=======
Schüler 0: 1.5
Schüler 1: 3.6
Schüler 2: 4.0
Schüler 3: 1.7
Schüler 4: 5.7
Schüler 5: 4.8
Schüler 6: 4.5
Schüler 7: 4.8
Schüler 8: 5.9
Schüler 9: 2.8
===================

=======Fazit=======
Höchstnote: 5.9
Tiefstnote: 1.5
Durchschnitt: 3.9
===================
*/