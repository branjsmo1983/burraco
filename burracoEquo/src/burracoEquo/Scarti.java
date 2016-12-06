package burracoEquo;

import java.util.ArrayList;

public class Scarti {
	
	
	// arraylist di carte che vengono scartate, una alla volta per turno di gioco dal giocatore che finisce il turno
	private ArrayList<Carta> scartate;
	
	

	public Scarti(ArrayList<Carta> scartate) {
		super();
		this.scartate = scartate;
	}

	public ArrayList<Carta> getScartate() {
		return scartate;
	}

	public void setScartate(ArrayList<Carta> scartate) {
		this.scartate = scartate;
	}

}
