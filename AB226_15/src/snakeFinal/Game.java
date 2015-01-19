package snakeFinal;

import java.awt.*;
import java.util.Vector;

/**
 * Game enthaelt die main() Methode und dient als Runner fuer das Snake Spiel,
 * die Klasse enthaelt ausserdem die Spielsteuerung und liefert die optischen
 * Spielelemente.
 * @Version	1.0 Final
 * @Author	RSCHENK
 */
public class Game {
	
	/**
	 * GUI -> JPanel Element fuer die Fensterdarstellung.
	 */
	private GUI gui;
	/**
	 * Player Objekt (snake)
	 */
	public Snake snake;
	/**
	 * Border des Spielbereichs
	 */
	public Border border;
	/**
	 * Vektor der als Behaelter fuer alle Spielelemente dient
	 */
	public Vector<GameElement> gameElements;
	
	/**
	 * Schrittlaenge
	 */
	private int STEP = 10;

	/**
	 * Game Constructor, erzeugt alle Elemente auf dem Spielfeld
	 * inkl. dem Spielfeld selbst.
	 */
	public Game()
	{
		this.gameElements = new Vector<GameElement>();
		this.snake = new Snake(400,80);
		this.border =  new Border(580,345);
	}
	/**
	 * RUNNER
	 * @param args
	 */
	public static void main(String[] args) {
		Game game = new Game();
		game.gameElements.add(game.snake);
		game.gameElements.add(game.border);
		game.setDiamonds(8);
			
		game.gui = new GUI(game);
		game.checkState();
		
		
	}
	
	
	/**
	 * Die draw Methode wird in mehreren anderen Klassen als Ableitung
	 * genutzt um Spielelemente zu zeichnen, sie spielt eine zentrale Rolle
	 * bei dem Snake Programm.
	 * @param g Grafik
	 */
	public void draw(Graphics g)
	{
		for(GameElement se : gameElements)
		{
			se.draw(g);
		}
	}
	
	
	
	/**
	 * checkState prueft ob die Schlange am leben ist bzw. ob etwas
	 * (Kollision mit Border/Sich Selbst) diesen Status geaendert hat.
	 */
	public void checkState()
	{
		while(snake.isAlive && border.isAlive)
		{
			snake.move(STEP);
			checkGameElement(snake);
			checkGameOver();
			gui.repaint();
			try
			{
				Thread.sleep(200);
			}catch(InterruptedException e){}
			
		}
	}
	
	
	/**
	 * checkGameElement prueft spezifisch ob die Schlange mit einem 
	 * gameElement kollidiert ist.
	 * @param s Snake
	 */
	public void checkGameElement(Snake s)
	{
		for (int i = 0; i< gameElements.size(); i++)
		{
			GameElement element = gameElements.elementAt(i);
			element.collisionCheck(s);
			//Pruefe ob sichtbar.
			if(!element.isVisible)
				gameElements.remove(element);
			
		}
	}
	
	/**
	 * checkGameOver prueft ob die Bedingung erfuellt wurde die fuer ein
	 * Game Over erforderlich sind.
	 */
	private void checkGameOver()
	{
		if(!snake.isAlive)
			this.gui.setTitle("Game Over! Eigenkollision");
		if(!border.isAlive)
			this.gui.setTitle("Game Over! Borderkollision");
		if(gameElements.size() == 2) //True wenn alle Diamanten gefressen wurden.
		{
			snake.isAlive = false;
			gui.setTitle("Spiel gewonnen.");
		}
		
	}
	
	
	/**
	 * Mithilfe des Randomizers werden die Diamanten auf dem Spielfeld
	 * platziert. x, y Position und der Wert werden jeweils vom Randomizer
	 * zufaellig generiert, die Anzahl wird beim Aufruf vorgegeben.
	 * @param anzahl
	 */
	private void setDiamonds(int anzahl)
	{
		for(int i = 0; i<anzahl;i++)
		{
			int px = Randomizer.randomValue(20, 440);
			int py = Randomizer.randomValue(20, 340);
			int val = Randomizer.randomValue(1, 8);
			this.gameElements.add(new Diamond(new Point(px,py),val));
		}
	}

}
