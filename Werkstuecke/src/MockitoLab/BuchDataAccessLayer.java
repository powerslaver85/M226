package MockitoLab;

/**
 * Buch DAL (Data Access Layer) dient als
 * Schnittstelle zu einer gemockten DB oder
 * anderen Datenquelle.
 *
 * Created by Lord Ramon Schenk on 19.01.15.
 * @version 1.0
 * @author Ramon Schenk
 *
 */



import java.util.Collections;
import java.util.List;

/**
 * API layer for persisting and retrieving the Book objects.
 */
public class BuchDataAccessLayer {

    private static BuchDataAccessLayer buchDataAccessLayer = new BuchDataAccessLayer();

    public List<Buch> getAllBooks(){
        return Collections.EMPTY_LIST;
    }

    public Buch getBuch(String isbn){
        return null;
    }

    public String addBuch(Buch buch){
        return buch.getIsbn();
    }

    public String updateBuch(Buch buch){
        return buch.getIsbn();
    }

    public static BuchDataAccessLayer getInstance(){
        return buchDataAccessLayer;
    }
}