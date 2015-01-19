package JUnitTesting;

import org.junit.Ignore;
import org.junit.Test;

/**
 * JUnit - @Ignore
 * Beispielklasse f&uuml;r den Umgang mit JUnit 4
 * Soll ein Testfall ignoriert werden, z.B weil die
 * Methode noch nicht fertig ist (TDD) oder der
 * Testfall nicht relevant ist gibt es eine Annotation.
 *
 * Created by Lord Ramon Schenk on 19.01.15.
 * @version 1.0
 * @author Ramon Schenk
 *
 */


public class JUnitBasics3 {

    /* Mittels @Ignore kann ein Testfall ignoriert
    werden, zus&auml;tzlich kann eine Meldung platziert werden. */
    @Ignore("Noch nicht zum testen bereit.")
    @Test
    public void divisionWithException() {
        System.out.println("Die Methode ist nicht bereit");
    }

    //OUTPUT: Test 'JUnitTesting.JUnitBasics3.divisionWithException' ignored (Noch nicht zum testen bereit.)
    //Der Test wird als Ignored in den Resultaten aufgelistet, nicht als "Bestanden".
}
