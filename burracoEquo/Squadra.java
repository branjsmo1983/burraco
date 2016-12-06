package burracoEquo;


public class Squadra {
	
	private Giocatore giocatore1;
	private Giocatore giocatore2;
	
	

	public Squadra(Giocatore giocatore) {
		super();
		this.giocatore1 = giocatore;
		
	}
	
	public Squadra(Giocatore g1, Giocatore g2) {
		super();
		this.giocatore1 = g1;
		this.setGiocatore2(g2);
	}

	
	public Giocatore getGiocatore1() {
		return giocatore1;
	}

	public void setGiocatore1(Giocatore g) {
		this.giocatore1 = g;
	}

	public Giocatore getGiocatore2() {
		return giocatore2;
	}

	public void setGiocatore2(Giocatore g2) {
		this.giocatore2 = g2;
	}

}
