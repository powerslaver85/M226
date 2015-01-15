//Titel: KonstruktorDemo.java | Author: Ramon Schenk | Date: 02/09/2014
package beispiele;

public class KonstruktorDemo {
	@SuppressWarnings("unused")
	private int x; 

    // Standardkonstruktor muss nicht angegeben werden 
    public KonstruktorDemo() { 
         
    } 
     
    
    // zweiter Konstruktor 
    public KonstruktorDemo(int i){ 
        this.x=i; //Der Konstruktor dient zur Instanzierung einer Instanzvariabel (i)
    }
    
    //Nutzung des Standardkonstruktors
    KonstruktorDemo konst1 = new KonstruktorDemo();
    
    //Nutzung des zweiten Konstruktors
    KonstruktorDemo konst2 = new KonstruktorDemo(2);
}