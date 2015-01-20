package objekterzeugungVererbung;

public class B extends A {
	{
		System.out.println("Initialisierung B");
	}

	B() { //Default Konstruktor B
		System.out.println("Konstruktorrumpf B");
	}
}