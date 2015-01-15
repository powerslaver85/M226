package AB06;

import java.awt.Graphics;

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
public class Papier extends JPanel {
	
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
}
