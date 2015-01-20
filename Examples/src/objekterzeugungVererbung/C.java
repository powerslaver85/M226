package objekterzeugungVererbung;

public class C extends B {
	{
		System.out.println("Initialisierung C");
	}

	C() { //Default Konstruktor C
		System.out.println("Konstruktorrumpf C");
	}

	public static void main(String[] args) {
		new C();
	}
}
