//Titel: Kunde.java | Author: Ramon Schenk | Date: 02/09/2014
package beispiele;

public class Treppe {
	public static void main(String[] args) {
		int h = 10;		//H�he (Endwert)
		int b = 3;		//Breite (Startwert) bestimmt die Anzahl Sterne f�r Treppe

		for (int i = 1; i <= h; i++) {	
			//For Schleife f�r Anzahl Zeilen (Schleife I)
			for (int j = 1; j <= h - i; j++) { //L�uft solange j <= h - i (Dekrementiert Anz. Zeilen)
				//For Schleife f�r die ausgabe von * bzw. deren Schleife (Schleife II)
				for (int k = 1; k <= b; k++) {
					//For Schleife f�r Ausgabe von Space, Bedinung k <= b
					System.out.print(" ");
				}
			}
			for (int j = 1; j <= i; j++) {
				//Ausgel�st durch Schleife II (Schleife II-II)
				for (int k = 1; k <= b; k++) {
					//Verschachtelte Schleife innerhalb der Schleife II-II (Schleife II-III)
					System.out.print("*");
					//Ausgabe *
				}
			}
			System.out.println();
			//Ausgabe bei jedem Durchgang von Schleife I
		}
	}
}


//OUTPUT:

/*
***
******
*********
************
***************
******************
*********************
************************
***************************
******************************/