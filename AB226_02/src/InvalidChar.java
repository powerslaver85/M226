//Filename: InvalidChar.java | Author: Ramon Schenk | Date: 22.08.2014

 
@SuppressWarnings("serial")
public class InvalidChar extends Exception {
    public InvalidChar() {
 
    }
    //Nimmt als Parameter einen String entgegen.
    public InvalidChar(String message) {
        super(message);
    }
}