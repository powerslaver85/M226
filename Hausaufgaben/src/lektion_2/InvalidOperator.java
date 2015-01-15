package lektion_2;

/**Filename:	InvalidOperator.java
 * @author 		Lord Ramon Schenk
 */

@SuppressWarnings("serial") //Nicht Aufgabenrelevant

public class InvalidOperator extends Exception{	
	InvalidOperator() {}	
	
	InvalidOperator(String message) {
		super (message);
		}
}
