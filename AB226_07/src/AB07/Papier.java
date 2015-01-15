package AB07;

//FigurAuswahl & ZeichenFlaeche & Listener

import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

/**
 * Papier ist eine von JPanel abgeleitete Swing-Komponente.
 * - Sie dient als "Zeichenblatt" f�r Zeichnungen.
 * - Sie speichert die Zeichnung in einer Instanzvariablen.
 * - Sie �berschreibt die Methode paintComponent der Klasse JPanel
 *   so, dass bei ihrem Aufruf die Zeichnung auf das Papier gezeichnet
 *   wird.
 * 
 * @author Andres Scheidegger
 */
@SuppressWarnings("serial")
public class Papier extends JPanel implements MouseListener {
	
	/**
	 * Die Zeichnung.
	 */
	private Zeichnung zeichnung;
	
	/**
	 * Die Methode paintComponent zeichnet die Zeichnung auf das Papier.
	 * Sie erh�lt dazu ein Graphics-Objekt, welches sie an die Zeichnung
	 * weitergibt.
	 * 
	 * @param g  Graphics-Objekt, welches zum zeichnen verwendet werden soll.
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	@Override
	public void paintComponent(final Graphics g) {
    super.paintComponent(g);
		if (zeichnung != null) zeichnung.zeichneFiguren(g);
	}
	
	/**
	 * Setter f�r die Instanzvariable zeichnung.
	 * 
	 * @param zeichnung Die zu zeichnende Zeichnung.
	 */
	public void setZeichnung(final Zeichnung zeichnung) {
		this.zeichnung = zeichnung;
	}

	/**
	   * Position der Maus beim Dr�cken der Maustaste. Wird von der
	   * Methode mousePressed() gesetzt und von der Methode mouseReleased()
	   * gelesen.
	   */
	private int x, y;
	private String s = "r";
	/**
	  * Konstruktor. Registriert das eigene Objekt als MousListener.
	  */

	public Papier() {
		this.setFocusable(true);
		addMouseListener(this);
		//addKeyListener(this);
		addKeyListener(new MyKeyListener());
	}

	
	
	/**
	 * Wird aufgerufen, wenn die Maustaste gedr�ckt wird
	 * @param e Maus-Ereignis f�r das Dr�cken der Maustaste
	 */	
	  
	@Override
	public void mousePressed(MouseEvent e) {
	// Speichern den Ort des Ereignisses.
		x = e.getX();
		y = e.getY();
	}

	/** Wird aufgerufen, wenn die Maustaste wieder losgelassen wird
	 * @param e Maus-Ereignis f�r das Loslassen der Maustaste
	 */
	  
	@Override
	public void mouseReleased(MouseEvent e) {
		// Bestimmen Breite und Hoehe des neuen Rechtecks
		int breite = e.getX() - x;
		int hoehe = e.getY() - y;
		// Erzeugen ein neues Rechteckobjekt und speichern dieses
		// in der Zeichnung. Anschliessend alles neu zeichnen.
			  
		/*
		Rechteck figur = new Rechteck(x, y, breite, hoehe);
		zeichnung.addFigur(figur);
		*/
		//TODO: Switch-Struktur abändern	  
		//System.out.println(s);
		if (s.equals("l")) {
			//System.out.println("lll");
			Linie figur = new Linie(x, y, e.getX(), e.getY());
			zeichnung.addFigur(figur);
		} else if (s.equals("k")) {
			//System.out.println("kkk");
			int d = (int)Math.sqrt((Math.pow(breite, 2) + Math.pow(hoehe, 2)));
			Kreis figur = new Kreis(x, y, d);
			zeichnung.addFigur(figur);
		} else {
			//System.out.println("rrr");
			Rechteck figur = new Rechteck(x, y, breite, hoehe);
			zeichnung.addFigur(figur);
		}
			repaint();
	}
	
	
	// Weitere Ereignisse werden nicht bearbeitet, die Methoden m�ssen
	// aber implementiert werden!
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub	
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub	
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub	
	}
	
	public class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			//System.out.println(e.getKeyChar());
			if (e.getKeyCode() == KeyEvent.VK_R) {
				//System.out.println("r pressed");
				s = "r";
		    } else if (e.getKeyCode() == KeyEvent.VK_L) {
		    	//System.out.println("l pressed");
		    	s = "l";
		    } else if (e.getKeyCode() == KeyEvent.VK_K) {
		    	//System.out.println("k pressed");
		    	s = "k";
		    }
		}
	}
	
	/* 
	@Override
	public void keyPressed(KeyEvent e) {
		//System.out.println(e.getKeyChar());
		if (e.getKeyCode() == KeyEvent.VK_R) {
			//System.out.println("r pressed");
			s = "r";
	    } else if (e.getKeyCode() == KeyEvent.VK_L) {
	    	//System.out.println("l pressed");
	    	s = "l";
	    } else if (e.getKeyCode() == KeyEvent.VK_K) {
	    	//System.out.println("k pressed");
	    	s = "k";
	    }
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}
	*/
	
}
