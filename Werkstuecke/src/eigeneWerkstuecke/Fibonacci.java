//Titel: Fibonacci.java | Author: Ramon Schenk | Date: 02/09/2014
package eigeneWerkstuecke;

/** Fibonacci Klasse
* 
* Die Fibonacci-Sequenz ist eine Sequenz bei der die jeweils benachbarten
* Zahlen addiert werden. Dies wird hier mithilfe eines Rekursiven Methoden-
* aufrufs realisiert wird. Sprich die Methode ruft sich selbst mit Variablen
* Parametern auf.
*
* @author Ramon Schenk
* @param n 
* @version 1.00
*/
public class Fibonacci {

//Fibonacci Methode mit if Verzweigung und n als Parameter
public static long fib(int n) {

if (n <= 1) return n;   //Wenn n 1 oder kleiner soll n zur�ckgegeben werden
else return fib(n-1) + fib(n-2);
//Rekursiver Methodenaufruf, die Methode ruft sich in sich selbst auf.
}

public static void main(String[] args) {
int N = 20;  //Hier kann N definiert werden.
//For-Schleife zur Ausgabe der N Fibonacci Aufrufe.
for (int i = 1; i <= N; i++)
    System.out.println(i + ": " + fib(i));
}

}