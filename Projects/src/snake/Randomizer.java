package snake;
import java.util.Random;

/**
 * Hilfsklasse zum Erzeugen von Zufallszahlen.
 * 
 * @author Andres Scheidegger
 * NOTE: Um die Konsistenz zu wahren wurde die Klasse ins
 * Englische "Randomizer" uebersetzt. 
 * NOTE: FREMDCODE.
 */
public class Randomizer {

  /** Random-Objekt zur Erzeugung von Zufallszahlen */
  private static final Random RANDOM = new Random(System.currentTimeMillis());;

  /**
   * Hilfsmethode zum Erzeugen von Zufallszahlen in einem gegebenen Intervall,
   * inklusive Intervallgrenzen.
   * @param untereGrenze Unter Grenze des Intervalls
   * @param obereGrenze  Obere Grenze des Intervalls
   * @return Zufallszahl innerhalb des gegebenen Intervalls
   */
  public static int randomValue(int untereGrenze, int obereGrenze)
  {
    return Math.abs(RANDOM.nextInt() % (obereGrenze + 1 - untereGrenze)) + untereGrenze;
  }

}
