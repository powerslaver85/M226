//Titel: TestPlayer.java | Author: Ramon Schenk | Date: 02/09/2014

package AB226_04_A2;


/** TestPlayer.java 
*  
*  @author Powerslave
*  Sonstiges: Runner
*/
public class TestPlayer {
	//RUNNER
	public static void main(String[] args) {
		Player p = new Player("Daisy"); 	//Erstelle Objekt p aus Klasse Player mit name "Daisy"
		p.score(99);						//setze score f�r p auf 99 (Set)
		
		Player q = new Player("Donald");	//Same f�r q und mit name "Donald"
		
		Player[] players = new Player[3];	//Erstelle Array "players" mit 3 Feldern
		players[0] = q;						//Referenziere players Feld 0 (index) mit q;
		players[2] = p;						//Same f�r p und Index 2
		players[0].score(100);				//Setze Score f�r players[0] (Donald bzw. q) auf 100 (Set)

	}

}