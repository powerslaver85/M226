package konto;

//Girokonto.java
class Girokonto extends Konto {
	double limit;

	Girokonto(int kontonummer, double saldo, double limit) {
		super(kontonummer, saldo);
		this.limit = limit;
	}

	void setLimit(double limit) {
		this.limit = limit;
	}

	void zahleAus(double betrag) {
		if (betrag <= saldo + limit)
			saldo -= betrag;
	}

	void info() {
		super.info();
		System.out.println("Limit: " + limit);
	}
}
