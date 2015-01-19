package snakeFinal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


/**
 * Die Klasse GUI stellt das Fenster (JFrame) und  das Spielfeld (JPanel) des Snake-Spiels zur Verf�gung. Implentiert den KeyListener
 * @author   A. Scheidegger, M.Frieden
 * NOTE: FREMDCODE.
 */

@SuppressWarnings("serial")
public class GUI extends JFrame implements KeyListener {

  /** Referenz auf das Game-Objekt. */
  private Game game;

  /** Das JPanel, welches als Spielfeld dient. Anonyme innere Klasse. */
  private JPanel field = new JPanel() {
    /**
     * Wird automatisch aufgerufen, wenn das Fenster neu gezeichnet werden
     * muss. Delegiert das Zeichnen des Spiels an das Game-Objekt.
     * @param g Graphics-Objekt zum Zeichnen
     * NOTE: FREMDCODE.
     */
	  
	  
    @Override
    public void paintComponent(Graphics g){
      game.draw(g);
    }
  };

  /**
   * GUI Constructor 
   * Initialisiert den Frame. Registriert das Game-Objekt
   * als KeyListener.
   * NOTE: FREMDCODE.
   */
  public GUI(Game game) {
    this.game = game;
    setSize(600, 400);
    setTitle("Snake V1.0 Final");
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    setContentPane(field);
    addKeyListener(this);
    setVisible(true);
  }

  /**
   * Gibt die Breite des Spielfeldes zurueck.
   * @return Breite des Spielfeldes.
   */
  public int getWidth() {
    return field.getWidth();
  }

  /**
   * Gibt die Hoehe des Spielfeldes zurueck.
   * @return Hoehe des Spielfeldes
   */
  public int getHeight() {
    return field.getHeight();
  }
  
	 /***
	 * Die Key-Listener-Methoden
	 */
	
	/**
	 * Methode die die Richtung des snakenkopfs bestimmt,
	 * anhand der gedrueckten Tasten. Die Richtung laesst sich mit den
	 * Pfeiltasten oder mit WASD bestimmen
	 */
	@Override
	public void keyPressed(KeyEvent e) {
		int keycode = e.getKeyCode();
		if (keycode == KeyEvent.VK_UP || keycode == KeyEvent.VK_W)
			game.snake.direction = "oben";
		if (keycode==KeyEvent.VK_DOWN || keycode == KeyEvent.VK_S)
			game.snake.direction = "unten";
		if(keycode==KeyEvent.VK_RIGHT || keycode == KeyEvent.VK_D)
			game.snake.direction= "rechts";
		if(keycode== KeyEvent.VK_LEFT || keycode == KeyEvent.VK_A)
			game.snake.direction = "links";
			
		
	}
	/**
	 * Leere Methoden des KeyListeners, sie haben keine Funktion.
	 */
	@Override
	public void keyTyped(KeyEvent arg0) {
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

}
