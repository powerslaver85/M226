package vererbungKonto;

//GirokontoTest.java
public class GirokontoTest {
	public static void main(String[] args) {
		Girokonto gk = new Girokonto(4711, 500., 2000.);

		gk.info();
		gk.zahleAus(3000.);
		gk.info();
		gk.setLimit(2500.);
		gk.zahleAus(3000.);
		gk.info();
	}
}
