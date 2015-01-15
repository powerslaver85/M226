package lektion_6;

public class CD extends Medium {
	Sound sample;
	Player p = new Player();
	
	public void startSample() {
		p.playSound(sample);
		
	}
}
