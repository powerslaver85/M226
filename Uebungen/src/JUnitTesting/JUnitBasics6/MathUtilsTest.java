package JUnitTesting.JUnitBasics6;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * MathUtilsTest -> Testklasse -> Parameterized Test
 * Beispielklasse für JUnit Test Übung
 * Beispielklasse f&uuml;r den Umgang mit JUnit 4
 *
 *
 * Created by Lord Ramon Schenk on 19.01.15.
 * @version 1.0
 * @author Ramon Schenk
 *
 */



@RunWith(value = Parameterized.class)
public class MathUtilsTest {

    private int numberA;
    private int numberB;
    private int expected;

    //Parameter mit Konstruktor weitergeben
    public MathUtilsTest(int numberA, int numberB, int expected) {
        this.numberA = numberA;
        this.numberB = numberB;
        this.expected = expected;
    }

    //Deklaration Parameter mit JUnit Annotation @Parameters
    @Parameters(name = "{index}: add({0}+{1})={2}")
    public static Iterable<Object[]> data1() {
        return Arrays.asList(new Object[][]{
                { 1, 1, 2 },
                { 2, 2, 4 },
                { 8, 2, 10 },
                { 4, 5, 9 }
        });
    }

    /*
    * @Parameter
    * */

    @Test
    public void testAdd() {
        assertEquals(expected, MathUtils.add(numberA, numberB));
    }

}