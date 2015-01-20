package snake;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;

/**
 * Border ist von GameElement abgeleitet und ist fuer die Position der Schlange und
 * deren Verhalten bei einer Kolision zustaendig.
 * @Version	1.0 Final
 */

public class Border extends GameElement {
	/**
	 * BEGINN dient als Startposition des Spielers.
	 */
	private Point BEGINN = new Point(10,10);
	/**
	 * Border Constructor
	 * Zeichnet die Border Linie, bzw. die Spielfeldgrenze 
	 * als Rechteck.
	 * @param width
	 * @param height
	 */
	public Border (int width, int height)
	{
		this.position = new Rectangle(BEGINN.x,BEGINN.y, width,height);
		
	}
	
	/**
	 * collisionCheck prueft ob der Kopf der Schlange mit dem Border kollidiert und setzt
	 * isAlive auf false bei Kontakt. 
	 */
	@Override
	public void collisionCheck(Snake s)
	{
		if(s.head.x <= position.x || s.head.x >= (position.x +position.width - s.head.width)) 
			isAlive = false;
		if(s.head.y <= position.y || s.head.y >= (position.y + position.height- s.head.height))
			isAlive = false;
	}


	
	/**
	 * Die draw Methode zeichnet das Spielfeld
	 */
	@Override
	public void draw(Graphics g) {
		
		g.drawRect(position.x, position.y, position.width, position.height);
	}
	

}