package lektion_2;


/**Hausaufgabe_2.java
 * @version		1.0
 * @author 		Lord Ramon Schenk (Der Titel ist echt)
 * @date		02/NOV/2014
 * Modul:		M226
 * Klasse:		Inf12.5H
 * 
 * Note			Demonstration fuer den Gebrauch von Methoden. 
 * 				Bezogen auf die Aufgabe im Arbeitsblatt ab226.02 
 * 				Aufgabe 3 a, b ,c.
 */

public class Hausaufgabe_2 {
	
	/**calc
	 * @param 		operand1
	 * @param 		operand2
	 * @param 		operator
	 * @return
	 * @throws 		InvalidOperator
	 * operator code:
	 * 1 -> Addition
	 * 2 -> Subtraktion
	 * 3 -> Multiplikation
	 * 4 -> Division
	 * 5 -> Modulo
	 * 
	 * Beschreibung:
	 * Die Methode behandelt Integer Zahlen mathematisch, es stehen oben genannte Operatoren
	 * zur Verfuegung. 
	 * Beispiel:
	 * calc(2, 8, 3) Entspricht 2 * 8
	 */
	
	public static int calc(int operand1,int operand2, int operator) throws InvalidOperator{
		int result = 0;
		
		switch(operator) {
		case 1:
			result = operand1 + operand2;
			break;
		case 2:
			result = operand1 - operand2;
			break;
		case 3:
			result = operand1 * operand2;
			break;
		case 4:
			result = operand1 / operand2;
			break;
		case 5:
			result = operand1 % operand2;
			break;
		default:
			throw new InvalidOperator("Operator Wert ungueltig. Werte 1-5 sind zugelassen.");
		}
		
		return result;
	}
	
	//Main-Methode
	public static void main(String[] args) throws InvalidOperator {
	       //Aufruf der calc Methode innerhalb von println calc(param1, param2, param3)
        
		//Testen der Exception InvalidOperator
		//System.out.println("Ausgabe ErrorOperation 10 X 10: " + calc(10, 10, 6));
		
		System.out.println("==========================================================");
        System.out.println("=                   AB226.02 Hausaufgabe                 =");
        System.out.println("==========================================================");
        System.out.println("Ausgabe Addition 8 + 8: " + calc(8,8, 1));
        System.out.println("Ausgabe Subtraktion 12 - 8: " + calc(12,8, 2));
        System.out.println("Ausgabe Multiplikation 8 * 8: " + calc(8,8, 3));
        System.out.println("Ausgabe Division 222 / 2: " + calc(222,2, 4));
        System.out.println("Ausgabe Modulo 1234 % 777: " + calc(1234,777, 5));
        System.out.println("==========================================================");
        System.out.println("=                         Ende                           =");
        System.out.println("==========================================================");

	}

}
