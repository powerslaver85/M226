package JUnitTesting;

import org.junit.Test;

/**
 * JUnit - Time Test
 * Beispielklasse f&uuml;r den Umgang mit JUnit 4
 * Diese Testmethode pr&uuml;ft ob ein festgelegtes
 * Zeitlimit (In ms) &uuml;berschritten wird und gibt
 * einen Fehler aus wenn dies eintrifft.
 *
 * PS: Das Wort Test klingt sehr komisch wenn man es
 * zu oft verwendet...
 *
 * Created by Lord Ramon Schenk on 19.01.15.
 * @version 1.0
 * @author Ramon Schenk
 *
 */


public class JUnitBasics4 {

    //Pr&uuml;fe ob Testfall l&auml;nger als 1000ms (1 Sec) dauert.
    @Test(timeout = 1000)

    //infinity() -> Unendlicher Loop, Unendlich > 1000ms
    public void infinity() {
        while (true) ;
    }

    /*
    OUTPUT:
    java.lang.Exception: test timed out after 1000 milliseconds
	    at JUnitTesting.JUnitBasics4.infinity(JUnitBasics4.java:29)
     */

    //Netterweise konnte infinity() nur durch Neustart gekillt werden
}
