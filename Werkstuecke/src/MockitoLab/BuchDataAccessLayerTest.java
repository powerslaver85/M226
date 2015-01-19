package MockitoLab;

//JUnit & Mockito Imports
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

/**
 * BuchDataAccessLayerTest ist das Herzstück
 * des Projekts MockitoLab. Bei TDD spielt die
 * Musik in der Testklasse.
 * Während Buch und BuchDataAccessLayer Inhaltlich
 * eher wie ein Gerüst wirken, wird in der Testklasse
 * festgelegt wie sich das Programm verhalten soll.
 *
 * Created by Lord Ramon Schenk on 19.01.15.
 * @version 1.0
 * @author Ramon Schenk
 *
 */

public class BuchDataAccessLayerTest {

    private static BuchDataAccessLayer mockedBuchDataAccessLayer;
    private static Buch buch1;
    private static Buch buch2;

    //Setup
    @BeforeClass
    public static void setUp(){
        //Mocken des Objekts mockedBuchDataAccessLayer aus der DAL Klasse
        mockedBuchDataAccessLayer = mock(BuchDataAccessLayer.class);

        //Befüllen des Buch Objekts Buch1 mit Daten
        buch1 = new Buch("2100781019","Die 120 Tage von Sodom",
                Arrays.asList("Marquis de Sade","Rocco Siffredi", "John Wayne", "Monica Levinsky"),
                "ANACONDA", 2006,480,"BOOK_IMAGE");

        //Befüllen des Buch Objekts Buch2 mit Daten
        buch2 = new Buch("9788184528970","Die Bibel",
                Arrays.asList("Freunde von Jesus"),"Lord Publishment", 300,675,"BOOK_IMAGE");

        /*Erklärung:
        * Mockito gibt mithilfe von when(Objekt.Methode()).thenReturn(Rückgabe) jeweils die Resultate
        * züruck die man ihm vorgibt, dies ist äusserts praktisch um das verhalten von Methoden zu simulieren
        * ohne sie dazu schreiben zu müssen, so können einfach und schnell Tests gemacht werden und verschiedene
        * Methoden-Rückgabetypen ausprobiert werden.*/

        //Wenn die Methode getAllBocks() ausgeführt wird gibt der Mock einen Array mit den Werten von buch1 & buch2 zurück.
        when(mockedBuchDataAccessLayer.getAllBooks()).thenReturn(Arrays.asList(buch1, buch2));

        //Wenn die Methode getBuch() mit dem Parameter "2100781019" (ISBN Nummer buch1) ausgeführt wird, gibt sie buch1 zurück.
        when(mockedBuchDataAccessLayer.getBuch("2100781019")).thenReturn(buch1);

        //Wenn die Methode addBuch() mit dem Parameter buch1 ausgeführt wird wird das objekt buch1 mit der Methode getIsbn zurückgegeben.
        when(mockedBuchDataAccessLayer.addBuch(buch1)).thenReturn(buch1.getIsbn());

        //Wenn die Methode updateBuch() mit dem Parameter buch1 gestartet wird wird auch buch1 mit der Methode getIsbn zurückgegeben.
        when(mockedBuchDataAccessLayer.updateBuch(buch1)).thenReturn(buch1.getIsbn());

        //Somit kann man genau bestimmen welche Methode welchen Wert bei welchem Parameter zurückgibt.

    }


    @Test
    public void testGetAllBooks() throws Exception {
        //Die Liste alleBuecher wird mit der Methode getAllBooks() wie mit Mockito vorbestimmt mit buch1 & buch2 befüllt
        List<Buch> alleBuecher = mockedBuchDataAccessLayer.getAllBooks();

        //Prüfe ob die Liste alleBuecher (mit .size) == 2
        assertEquals(2, alleBuecher.size()); //true

        //Das Buch Objekt meinBuch wird mit den werten des Eintrags aus Index 0 der Liste alleBuecher befüllt.
        Buch meinBuch = alleBuecher.get(0);
        //Prüfe ob ISBN nummer von meinBuch == 2100781019
        assertEquals("2100781019", meinBuch.getIsbn()); //true

        //Prüfe ob die Namen identisch sind.
        assertEquals("Die 120 Tage von Sodom", meinBuch.getTitel()); //true

        //Pruefe ob Anz. Authoren == 4
        assertEquals(4, meinBuch.getAuthoren().size()); //true

        //Prüfe ob Erscheinungsjahr von meinBuch == 2006
        assertEquals((Integer) 2006, meinBuch.getErscheinungsJahr()); //true

        //Prüfe ob meinBuch Anz. Seiten == 488
        assertEquals((Integer) 480, meinBuch.getAnzahlSeiten()); //true

        //Prüfe ob Publizist == ANACONDA
        assertEquals("ANACONDA", meinBuch.getPublikationen()); //true

        //Prüfe ob Bild == BOOK_IMAGE
        assertEquals("BOOK_IMAGE", meinBuch.getImage()); //true
    }




    @Test
    public void testGetBook(){

        String isbn = "2100781019";

        Buch myBuch = mockedBuchDataAccessLayer.getBuch(isbn);

        //Prüfe auf NotNull
        assertNotNull(myBuch);
        assertEquals(isbn, myBuch.getIsbn());
        assertEquals("Die 120 Tage von Sodom", myBuch.getTitel());
        assertEquals(4, myBuch.getAuthoren().size());
        assertEquals("ANACONDA", myBuch.getPublikationen());
        assertEquals((Integer)2006, myBuch.getErscheinungsJahr());
        assertEquals((Integer)480, myBuch.getAnzahlSeiten());

    }

    @Test
    public void testAddBook(){
        String isbn = mockedBuchDataAccessLayer.addBuch(buch1);
        assertNotNull(isbn);
        assertEquals(buch1.getIsbn(), isbn);
    }

    @Test
    public void testUpdateBook(){

        String isbn = mockedBuchDataAccessLayer.updateBuch(buch1);
        assertNotNull(isbn);
        assertEquals(buch1.getIsbn(), isbn);
    }
}