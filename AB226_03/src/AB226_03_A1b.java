//Titel: AB226_03_A1b | Author: Ramon Schenk | Datum: 01/09/2014


public class AB226_03_A1b {

	public static void main(String[] args) {
		//Aufgabe:
		//Schreiben Sie ein Programm in welchem zwei Int Arrays
		//mit unterschiedlichen Grösse, sowie ein Double-Array
		//erstellt wird. Versuchen sie nun die verschiedenen
		//Arrayvariablen zuzuweisen. Was stellen sie fest?
		
		int[] array1 = {1, 2, 3, 4, 5};
		int[] array2 = new int[10];
		double[] array3 = new double[10];
		
		//Int --> Int kein Problem
		array2[2] = array1[2]; 
		
		//Int --> Double --> Ausgabe = Double
		array3[1] = array1[1];
		
		//Double --> Int -->Fehler, muss mit (int) gecastet werden
		array2[1] = (int) array3[2];
		
		//Ausgabe
		System.out.println(array1[2]);
		System.out.println(array1[1]);
		System.out.println(array2[1]);
	}

}
/*OUTPUT
3
2.0
0.0
*/