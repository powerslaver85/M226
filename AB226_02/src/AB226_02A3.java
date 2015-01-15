//Filename: AB226_02A3.java | Author: Ramon Schenk | Date: 22.08.2014

 
@SuppressWarnings("serial")
public class AB226_02A3 extends Exception {
    //Calc Methode mit drei Parameter.
 
    public static int calc(int operand1,int operand2,char operator) throws InvalidChar {
 
        //Initialisere resultat Variable.
        int resultat = 0;
 
        //Switch-Anweisung überprüft operator Eingabe.
        switch (operator) {
            //Addition
            case '+':
                resultat = operand1 + operand2;
                break;
            //Subtraktion
            case '-':
                resultat = operand1 - operand2;
                break;
            //Multiplikation
            case '*':
                resultat = operand1 * operand2;
                break;
            //Division
            case '/':
                resultat = operand1 / operand2;
                break;
            //Modulo
            case '%':
                resultat = operand1 % operand2;
                break;
            default:
                throw new InvalidChar("Fehlerhafter Operator!");
                //Erzeugt ein InvalidChar Objekt mit entsprechender Fehlermeldung als Parameter.
        }
        //Rückgabe des Wertes aus der Variable resultat
        return resultat;
    }
 
    //Main Methode
    public static void main(String[] args) throws InvalidChar {
        //Aufruf der calc Methode innerhalb von println calc(param1, param2, param3)
        System.out.println("==========================================================");
        System.out.println("= AB226.02 Aufgabe 3 Calc Methode mit Switch-Auswertung  =");
        System.out.println("==========================================================");
        System.out.println("Ausgabe Addition 8 + 8: " + calc(8,8,'+'));
        System.out.println("Ausgabe Subtraktion 12 - 8: " + calc(12,8,'-'));
        System.out.println("Ausgabe Multiplikation 8 * 8: " + calc(8,8,'*'));
        System.out.println("Ausgabe Division 222 / 2: " + calc(222,2,'/'));
        System.out.println("Ausgabe Modulo 1234 % 777: " + calc(1234,777,'%'));
        System.out.println("==========================================================");
        System.out.println("=                         Ende                           =");
        System.out.println("==========================================================");

        //Exception Tester -> Fehlerhafer Operator
        System.out.println("Ausgabe Modulo 1234 % 777: " + calc(1234,777,'X'));
 
    }
 
}