package burracoEquo;

import java.util.ArrayList;

public class Giocatore {
	
	/*
	 *  --------------------- oggetto giocatore ---------------------------
	 *  --------------------- attributi         ---------------------------
	 */

	private String nome;				
	private int punteggio;				//somma i punti delle canaste nel tavolo suo o della sua squadra
	private boolean seiDmano;			//disabilita le mosse degli altri giocatori
	private int posizione;				//posizione nel tavolo della partita
	private ArrayList<Carta> carteMano;
	
	
	
	//------------------------- overloading dei costruttori

	public Giocatore(String nome, int punteggio, boolean seiDmano) {
		super();
		this.nome = nome;
		this.punteggio = punteggio;
		this.seiDmano = seiDmano;
	}

	public Giocatore(String nome, int punteggio, boolean seiDmano , int posizione) {
		super();
		this.nome = nome;
		this.punteggio = punteggio;
		this.seiDmano = seiDmano;
		this.posizione = posizione;
	}

	public Giocatore(String nome, int punteggio) {
		super();
		this.nome = nome;
		this.punteggio = punteggio;
	}
	
	//---------------------- get e set degli attributi

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPunteggio() {
		return punteggio;
	}

	public void setPunteggio(int punteggio) {
		this.punteggio = punteggio;
	}

	public boolean getSeiDmano() {
		return seiDmano;
	}

	public void setSeiDmano(boolean seiDmano) {
		this.seiDmano = seiDmano;
	}

	public int getPosizione() {
		return posizione;
	}

	public void setPosizione(int posizione) {
		this.posizione = posizione;
	}

	public ArrayList<Carta> getCarteMano() {
		return carteMano;
	}

	public void setCarteMano(ArrayList<Carta> carteMano) {
		this.carteMano = carteMano;
	}
}
