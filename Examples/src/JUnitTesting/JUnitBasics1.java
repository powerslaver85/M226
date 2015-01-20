package JUnitTesting;


import org.junit.*; //Import JUnit Stuff
import static org.junit.Assert.*; //Import JUnit Assert *STATIC*


import java.util.ArrayList;
import java.util.Collection;

/**
 * JUnit - Annotationen f&uuml;r Testing
 * Beispielklasse f&uuml;r den Umgang mit JUnit 4
 * Die Klasse beschreibt die jeweiligen Annotationen
 * die f&uuml;r JUnit Tests verwendet werden.
 * Erstellt mit IntelliJ IDEA 14
 * Created by Lord Ramon Schenk on 19.01.15.
 * @version 1.0
 * @author Ramon Schenk
 *
 */

public class JUnitBasics1 {

    private Collection<String> demoCollection;

    @BeforeClass
    public static void oneTimeSetUp() {
        //Einmalige Initialisierung der Klasse
        System.out.println("@BeforeClass -> oneTimeSetUp");
    }

    @AfterClass
    public static void oneTimeTearDown() {
        //Einmaliger TearDown (Bereinigung/Reset der Klasse nach dem Test
        System.out.println("@AfterClasse -> oneTimeTearDown");
    }

    @Before
    public void setUp() {
        //Einrichten der Klasse für den Test wird bei jedem Test initialisiert
        demoCollection = new ArrayList<String>(); //Initialisiere demoCollection
        System.out.println("@Before -> setUp");
    }

    @After
    public void tearDown() {
        demoCollection.clear(); //demoCollection clearen/reset -> tearDown
        System.out.println("@After - tearDown");
    }

    //Testen ob die demoCollection leer ist
    @Test
    public void testEmptyDemoCollection() {
        assertTrue(demoCollection.isEmpty()); //Prüfe ob demoCollection.isEmpty() -> true
        System.out.println("@Test - testEmptyDemoCollection");
    }

    //Testen ob sich ein Attribut innerhalb von demoCollection befindet (Genau 1)
    @Test
    public void testOneItemDemoCollection() {
        //Befülle demoCollection mit itemA (OneItem)
        demoCollection.add("itemA");

        //Prüfe auf Gleichheit 1 == demoCollection.size() (Anz. Items)
        assertEquals(1, demoCollection.size());
        System.out.println("@Test - testOneItemDemoCollection");
    }
/*

OUTPUT:
@BeforeClass -> oneTimeSetUp
@Before -> setUp
@Test - testOneItemDemoCollection
@After - tearDown
@Before -> setUp
@Test - testEmptyDemoCollection
@After - tearDown
@AfterClasse -> oneTimeTearDown

--> No Errors
*/



}
