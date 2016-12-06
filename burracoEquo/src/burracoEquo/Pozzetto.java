package burracoEquo;

import java.util.ArrayList;

public class Pozzetto {
	
	//attributo: arraylist di carte che un giocatore per carta deve prendere dopo che ha finito
	//le carte in mano nella prima fase del gioco
	
	private ArrayList<Carta> pozzo;
	
	

	public Pozzetto(ArrayList<Carta> pozzo) {
		super();
		this.pozzo = pozzo;
	}

	public ArrayList<Carta> getPozzo() {
		return pozzo;
	}

	public void setPozzo(ArrayList<Carta> pozzo) {
		this.pozzo = pozzo;
	}

}
