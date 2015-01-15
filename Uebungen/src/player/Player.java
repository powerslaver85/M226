//Titel: Player.java | Author: Ramon Schenk | Date: 02/09/2014
package player;

/** Player.java 
*  
*  @author Powerslave
*/
public class Player {
	@SuppressWarnings("unused")
	private String 	name;
	@SuppressWarnings("unused")
	private int		score;

	//Getter f�r name
	public Player(String name) {
		this.name = name; 
		//This bezieht sich auf das Objekt f�r das die Methode aufgerufen wurde
	}


	//Setter f�r score
	public void score(int s) {
		score += s;
	}
}