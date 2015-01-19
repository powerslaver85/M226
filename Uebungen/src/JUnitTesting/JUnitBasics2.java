package JUnitTesting;

import org.junit.Test;

/**
 * JUnit - Erwartete/Erw&uuml;nschte Exceptions Testen
 * Beispielklasse f&uuml;r den Umgang mit JUnit 4
 * Die Klasse demonstriert wie man erwartete Exceptions
 * &uuml;berpr&uuml;fen kann.
 * Created by Lord Ramon Schenk on 19.01.15.
 * @version 1.0
 * @author Ramon Schenk
 *
 */

//Da IntelliJ weiss das Div/0 nicht gut ist wird die Warnung Suppressed
@SuppressWarnings("NumericOverflow")


public class JUnitBasics2 {

    /*
    Der Test soll prüfen ob die erwartete Exception geworfen wird
    in diesem Fall ist das die ArithmeticException die z.B bei Div/0
    geworfen wird.
    */
    @Test(expected = ArithmeticException.class)
    public void divisionWithException() {
        //Division durch 0, das mögen Computer
        int i = 1/0;      //OUTPUT: Exception geworfen alles OK -> Fehlerfrei dank Fehlermeldung (Exception)
        //int i = 10/2;     OUTPUT: java.lang.AssertionError: Expected exception: java.lang.ArithmeticException

    }


}
