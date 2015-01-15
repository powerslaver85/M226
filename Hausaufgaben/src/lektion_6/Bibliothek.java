package lektion_6;

public class Bibliothek {

		@SuppressWarnings("unused")
		private Medium[] katalog;
		
		//Durch den Parameter "Medium" weis Bibliothek
		//wo sie die Methode showSample beziehen muss.
		public void showSample(Medium m) {
				m.startSample();
		}
	}

