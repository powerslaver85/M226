package lektion_6;

public class Buch extends Medium {
	
	String sample;

	//Implementieren von Medium
	public void startSample() {
		System.out.println(this.sample);
		//Die implementierte Methode startSample() ruft den
		//String auf der sich in der entsprechenden Klasse befindet
	}
}
