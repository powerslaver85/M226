//Titel: AB226_03_A1c | Author: Ramon Schenk | Datum: 01/09/2014

public class AB226_03_A1c {
//RUNNER
	public static void main(String[] args){
		double[][] dblPI = new double[2][8];
		
		for (int i = 1; i <= dblPI[0].length; i++) {
			dblPI[0][i - 1] = getLeibnizPI((int)Math.pow(10, i)); //Math.pow(basis, exponent)
			dblPI[1][i - 1] = dblPI[0][i - 1] - Math.PI;
			if (dblPI[1][i - 1] < 0)
				dblPI[1][i - 1] = -dblPI[1][i - 1];
		}
		
		System.out.printf("%-25s | %-25s | %-25s\n", "Berechnung", "Resultat", "Abweichung von Math.PI");
		System.out.printf("%-25s + %-25s + %-25s\n", "-------------------------", "-------------------------", "-------------------------");
		
		for (int i = 0; i < dblPI[0].length; i++)
			System.out.printf("%-25s | %-25s | %-25s\n", "getLeibnizPI(" + (int)Math.pow(10, i + 1) + ")", dblPI[0][i], dblPI[1][i]);
	}
	
	private static double getLeibnizPI(int AnzRechnungsschritte) {
		
		byte op = 0;
		
		double div = 3.0;
		
		double antwort = 1;
		
		for (int i = 1; i <= AnzRechnungsschritte; i++) {
			if (op < 1) {
				antwort -= 1.0 / div;
				op = 1;
			} else {
				antwort += 1.0 / div;
				op = 0;
			}
			
			div += 2;
		}
		
		return antwort * 4;
		
	}
}