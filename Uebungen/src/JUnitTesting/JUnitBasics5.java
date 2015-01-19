package JUnitTesting;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * JUnit - Suite Test / @RunWith & @Suite
 * Beispielklasse f&uuml;r den Umgang mit JUnit 4
 * Sollen mehrere Klassen mit einer TestKlasse getestet
 * werden, bieten sich sog. Suite Tests an.
 * In diesem Beispiel wird der SuiteTest die beiden
 * vorherigen Test Beispiele Testen.
 *
 * PS: Das Wort Test klingt sehr komisch wenn man es
 * zu oft verwendet...
 *
 * Created by Lord Ramon Schenk on 19.01.15.
 * @version 1.0
 * @author Ramon Schenk
 *
 */

/* Um einen Suite Test zu starten muss mittels
   RunWith Annotation eine Test Suite gestartet
   werden. Diese wird gleich darunter mit @Suite
   gebündelt.

   SYNTAX:
   RunWith(SuiteName.class) führt die TestSuite aus
*/

@RunWith(Suite.class)
/* Die Suite Annotation dient dazu mehrere Testklassen in
   einem sog. Test Suite zu bündeln.

   SYNTAX:
   @Suite.SuiteClasses({TestClass1.class, TestClass2.class})
 */
@Suite.SuiteClasses({
        JUnitBasics1.class,
        JUnitBasics2.class
})

public class JUnitBasics5 {
    //Leer
}

/* OUTPUT:
*  Das Zeug aus JUnitBasics1 & JUnitBasics2
*/
