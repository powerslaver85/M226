package snake;

import java.awt.Graphics;
import java.awt.Rectangle;


/** 
 * Die Klasse GameElement ist das Herzstueck von Snake. Sie ist
 * die Superklasse aller Spielelemente. 
 * GameElement bestimmt die Position und prueft ob das jeweilige 
 * Element lebendig ist (auf dem Spielfeld).
 * @Version	1.0 Final
 */
public abstract class GameElement {
	
	/**
	 * Rectangle legt den Standort eines GameElements fest.
	 */
	protected Rectangle position;
	/**
	 * isAlive spiegelt den Zustand des jeweiligen GameElements (Snake)
	 * wieder. Solange "true" geht das Spiel weiter, "false" resultiert 
	 * im Spielende.
	 */
	protected boolean isAlive;
	
	/**
	 * isVisible bestimmt ob ein GameElement sichtbar ist oder nicht.
	 */
	protected boolean isVisible;;
	
	
	/**
	 * GameElement Constructor
	 * Legt den Defaultwert der beiden Bool-Zustaende auf "true", um das
	 * Spiel starten zu koennen.
	 */
	public GameElement(){
		isAlive = true;
		isVisible = true;
	}
	
	
	/**
	 * Abstrakte Methode draw, dient dem Zeichnen von Elementen.
	 */
	abstract public void draw (Graphics g);
	
	/**
	 * Abstrakte Methode collisionCheck, prueft auf kollision.
	 * @param s Graphics-Objekt
	 */
	abstract public void collisionCheck(Snake s);
	

}
