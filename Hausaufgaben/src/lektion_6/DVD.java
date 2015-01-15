package lektion_6;

public class DVD extends Medium {
	Player p = new Player();
	Video sample;

	
	public void startSample() {
		p.playVideo(sample);
		
	}
}
