package vererbungKonto;


class Konto {
	int kontonummer;
	double saldo;
	
	
	Konto() {
	}

	Konto(int kontonummer) {
		this.kontonummer = kontonummer;
	}

	Konto(int kontonummer, double saldo) {
		this.kontonummer = kontonummer;
		this.saldo = saldo;
	}

	Konto(Konto k) {
		kontonummer = k.kontonummer;
		saldo = k.saldo;
	}

	int getKontonummer() {
		return kontonummer;
	}

	void setKontonummer(int nr) {
		kontonummer = nr;
	}

	double getSaldo() {
		return saldo;
	}

	void setSaldo(double betrag) {
		saldo = betrag;
	}

	void zahleEin(double betrag) {
		saldo += betrag;
	}

	void zahleAus(double betrag) {
		saldo -= betrag;
	}

	void info() {
		System.out.println("Kontonummer: " + kontonummer + " Saldo: " + saldo);
	}

	public void setInhaber(Kunde inhaber) {		
	}
}
