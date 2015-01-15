package AB226_04_A1;

public class GirokontoTest {

	public static void main(String[] args) {
		Girokonto gk = new Girokonto(4710, 500., 2000.);
		
		gk.kontoInfo();
		gk.zahleAus(3000.);
		gk.kontoInfo();
		gk.setLimit(2500.);
		gk.zahleAus(3000.);
		gk.kontoInfo();

	}

}
