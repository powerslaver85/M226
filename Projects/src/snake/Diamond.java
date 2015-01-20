
package snake;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;

/** 
 * Diamond ist abgeleitet von GameElement. Die Klasse legt 
 * den Standort und den jeweiligen Wert eines Diamanten fest. 
 * @Version	1.0 Final
 */
public class Diamond extends GameElement {

	/**
	 * Wert des Diamanten.
	 */
	public int pointValue;
	
	/**
	 * Diamond SIZE.
	 */
	private int SIZE = 14;
	
	/**
	 * Diamond Constructor
	 * Legt den Wert und Position des Diamanten fest.
	 * @param point Startpunkt
	 * @param wert Wert
	 */
	public Diamond(Point point, int wert) {
		position = new Rectangle(point.x,point.y,SIZE,SIZE);
		this.pointValue = wert;
		
	}
	
	
	/**
	 * Die Methode draw von GameElement zeichnet den Diamanten. FREMDCODE.
	 */
	public void draw (Graphics g)
	{
		//Punkte, in  der Mitte der vier Seiten
		Point point1 = new Point((position.x+SIZE/2),position.y);
		Point point2 = new Point((position.x +SIZE),(position.y +SIZE/2));
		Point point3 = new Point((position.x +SIZE/2),(position.y +SIZE));
		Point point4 = new Point((position.x),(position.y +SIZE/2));
		
		//Punkt, an dem der Wert gezeichnet wird
		Point point5 = new Point((position.x+SIZE/3),(position.y+SIZE*5/6));
				String diamantwert = Integer.toString(pointValue);
		
		g.setColor(Color.red);
		//Die vier Punkte werden durch Linien verbunden
		g.drawLine(point1.x,point1.y,point2.x,point2.y);
		g.drawLine(point2.x,point2.y,point3.x,point3.y);
		g.drawLine(point3.x,point3.y,point4.x,point4.y);
		g.drawLine(point4.x,point4.y,point1.x,point1.y);
		
		//Schriftgr�sse und Schriftart 
		g.setFont(new Font("Arial",Font.PLAIN,9));
		g.drawString(diamantwert, point5.x,point5.y);
		
	}
	
	
	/** 
	 * Prueft ob die Schlange (Kopf) mit einem Diamanten in Kontakt kommt.
	 */
	public void collisionCheck(Snake s)
	{
		
		if(s.head.intersects(this.position))
		{
			for(int i = 0; i<= pointValue; i++)
			{
				s.body.add(s.addBodyPart());
			}
			this.isVisible = false;
		}
		
	}

}
