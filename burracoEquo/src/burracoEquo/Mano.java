package burracoEquo;

import java.util.ArrayList;

public class Mano {

	private ArrayList <Carta> carteMano;
	public ArrayList<Carta> getCarteMano() {
		return carteMano;
	}
	public void setCarteMano(ArrayList<Carta> carteMano) {
		this.carteMano = carteMano;
	}
	public int getGiocatore() {
		return giocatore;
	}
	public void setGiocatore(int giocatore) {
		this.giocatore = giocatore;
	}
	private int giocatore;
}
