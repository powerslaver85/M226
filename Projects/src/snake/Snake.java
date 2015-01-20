package snake;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.Vector;


/**
 * Snake ist abgeleitet von GameElement, die Klasse beschreibt
 * die Schlange welche vom Spieler gesteuert wird. Hier wird
 * das Aussehen und die Reaktion der Schlange bei einer
 * Eigenkollision festgelegt.
 * @Version 1.0 Final
 */
@SuppressWarnings("unused")
public class Snake extends GameElement {
	
	/**
	 * Head ist der Schlangenkopf welcher vom Spieler gesteuert wird.
	 */
	public Rectangle head;
	/**
	 * Der Body der Schlange ist ein Vektor aus einzelnen Elementen die in einem
	 * Vektor abgelegt werden, diese werden anhand der Anzahl Diamanten die gefressen
	 * wurden, und deren Wert festgelegt bzw. Addiert.
	 */
	public Vector<Rectangle> body = new Vector<Rectangle>();
	/**
	 * String mit der aktuellen bewegungsrichtung.
	 */
	public String direction;
	
	/**
	 * Seitenlaenger eines Schlangenelements.)
	 */
	private int LENGTH = 10;
	
	/**
	 * Snake Constructor
	 * Generiert den Kopf der Schlange und ein erstes Koerperteil.
	 * (Wuerde sonst komisch aussehen)
	 * @param x X-Koordinate head
	 * @param y Y-Koordinate head
	 */
	public Snake (int x, int y)
	{
		position = new Rectangle(x,y,LENGTH,LENGTH);
		direction = "unten";
		head = position;
		body.add(new Rectangle((head.x +head.width),head.y,LENGTH,LENGTH));
	}

	/** 
	 * checkCollision prueft auf Eigenkollision.
	 */
	public void checkCollision(Snake s)
	{
		for(Rectangle k : body)
		{
			if(s.head.intersects(k))
				s.isAlive = false;
		}
	}
	
	//Abstract
	@Override
	public void collisionCheck(Snake s) {
		
	}
	
	
	/** 
	 * draw zeichnet die Schlange.
	 */
	public void draw (Graphics g)
	{
		g.fillRect(head.x, head.y, head.width, head.height);
		//g.setColor(Color.green); TODO: Soll Kopf auch faerben, nicht aber Border
		for(Rectangle r:body)
		{
			g.fillRect(r.x, r.y, r.width, r.height);
		}
	}
	
	/**
	 * move legt die Art und Weise fest wie sich die Schlange bewegt, der Kopf wird
	 * direkt gestuert, bei den Rechtecken wird die letzte Position jedes Rechtecks gespeichert
	 * und mit einem Schritt-lag verzoegerung nachgezogen.
	 * @param diff int Step
	 */
	public void move (int diff)
	{
		Point tmp = new Point(head.x, head.y);
		calcDirection(diff);
		for(Rectangle r : body)
		{
			Point lastpos = new Point(r.x,r.y);
			r.x = tmp.x;
			r.y = tmp.y;
			tmp = lastpos;
		}
	}
	
	/**
	 * Diese Methode sorgt dafuer das Koerperteile am ende der Schlange hinzugefuegt werden.
	 * @return rectangle-koerperteil
	 */
	public Rectangle addBodyPart()
	{
		Rectangle part = body.lastElement();
		Rectangle bodyPart = new Rectangle(part.x,part.y,part.width,part.height);
		return bodyPart;
		
	}
	
	
	/**
	 * Diese Methode legt die Richtung fest in die
	 * der Kopf bewegt wird.
	 * @param diff Schrittweite
	 */
	private void calcDirection(int diff)
	{
		switch (direction)
		{
			case "rechts":
				head.x +=diff;
			break;
			case "oben":
				head.y -= diff;
				break;
			case "links":
				head.x -= diff;
				break;
			case "unten":
				head.y += diff;
				break;
		}
	}



		
}