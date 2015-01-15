//Titel: StringCompDemo.java | Author: Ramon Schenk | Date: 02/09/2014
package beispiele;

public class StringCompDemo {

	public static void main(String[] args) {
		String a = new String("Hallo");
		String b = new String("Hallo");
		
		System.out.println(a == b); 		//->False
		//a == b vergleicht ob es sich um die gleiche Variabel/Referenz handelt
		System.out.println(a.equals(b));	//-> True
		//equals() prüft nur ob der Inhalt von a und b gleich ist, daher true.

	}

}