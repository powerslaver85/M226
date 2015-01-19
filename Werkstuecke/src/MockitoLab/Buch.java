package MockitoLab;

import java.util.List;

/**
 * MockitoLab - TDD Werkstueck
 * Buch.java dient als Model Klasse für dieses
 * Beispiel / Werkstück.
 *
 * Ziel der Arbeit ist es mit hilfe von JUnit
 * und Mockito zu demonstrieren wie ein
 * Test Driven Projekt ablaufen könnte.
 *
 * Es wird eine fiktive Datenbank gemockt die
 * mit einer DAL Klasse (Data Access Layer)
 * angesprochen wird.
 *
 * Created by Lord Ramon Schenk on 19.01.15.
 * @version 1.0
 * @author Ramon Schenk
 *
 */

public class Buch {

    //Variablen zur Beschreibung eines Buchs
    private String isbn;
    private String titel;
    private List<String> authoren;
    private String publikationen;
    private Integer erscheinungsJahr;
    private Integer anzahlSeiten;
    private String image;

    /** Konstruktor erzeugt ein Buch Objekt
     * @param isbn
     * @param titel
     * @param authoren
     * @param verleger
     * @param erscheinungsJahr
     * @param anzahlSeiten
     * @param image
     * */
    public Buch(String isbn,
                String titel,
                List<String> authoren,
                String verleger,
                Integer erscheinungsJahr,
                Integer anzahlSeiten,
                String image){

        this.isbn = isbn;
        this.titel = titel;
        this.authoren = authoren;
        this.publikationen = verleger;
        this.erscheinungsJahr = erscheinungsJahr;
        this.anzahlSeiten = anzahlSeiten;
        this.image = image;

    }

    //Getter
    public String getIsbn() {
        return isbn;
    }

    public String getTitel() {
        return titel;
    }

    public List<String> getAuthoren() {
        return authoren;
    }

    public String getPublikationen() {
        return publikationen;
    }

    public Integer getErscheinungsJahr() {
        return erscheinungsJahr;
    }

    public Integer getAnzahlSeiten() {
        return anzahlSeiten;
    }

    public String getImage() {
        return image;
    }
}