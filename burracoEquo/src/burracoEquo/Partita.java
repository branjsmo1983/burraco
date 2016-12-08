package burracoEquo;

import java.util.ArrayList;

public class Partita {

	private boolean duePlayers;
	private ArrayList<Giocatore> giocatori;
	private Mazzo carteTavolo;
	private Pozzetto pozzo1;
	private Pozzetto pozzo2;
	private Scarti scartiTavolo;
	private Tavolo tavolo1;
	private Tavolo tavolo2;
	public Mazzo getCarteTavolo() {
		return carteTavolo;
	}

	public void setCarteTavolo(Mazzo carteTavolo) {
		this.carteTavolo = carteTavolo;
	}

	public Pozzetto getPozzo1() {
		return pozzo1;
	}

	public void setPozzo1(Pozzetto pozzo1) {
		this.pozzo1 = pozzo1;
	}

	public Pozzetto getPozzo2() {
		return pozzo2;
	}

	public void setPozzo2(Pozzetto pozzo2) {
		this.pozzo2 = pozzo2;
	}

	public Scarti getScartiTavolo() {
		return scartiTavolo;
	}

	public void setScartiTavolo(Scarti scartiTavolo) {
		this.scartiTavolo = scartiTavolo;
	}

	public Tavolo getTavolo1() {
		return tavolo1;
	}

	public void setTavolo1(Tavolo tavolo1) {
		this.tavolo1 = tavolo1;
	}

	public Tavolo getTavolo2() {
		return tavolo2;
	}

	public void setTavolo2(Tavolo tavolo2) {
		this.tavolo2 = tavolo2;
	}

	private int turnoGiocatore;
	private boolean isEnded;
	
	
	
	public Partita(boolean duePlayers, ArrayList<Giocatore> giocatori, Mazzo carteTavolo, Pozzetto pozzo1,
			Pozzetto pozzo2, Scarti scartiTavolo, Tavolo tavolo1, Tavolo tavolo2, int turnoGiocatore, boolean isEnded) {
		super();
		this.duePlayers = duePlayers;
		this.giocatori = giocatori;
		this.carteTavolo = carteTavolo;
		this.pozzo1 = pozzo1;
		this.pozzo2 = pozzo2;
		this.scartiTavolo = scartiTavolo;
		this.tavolo1 = tavolo1;
		this.tavolo2 = tavolo2;
		this.turnoGiocatore = turnoGiocatore;
		this.isEnded = isEnded;
	}

	public int prossimoturno(int turnoAttuale){
		int result = turnoAttuale++;
		return (result % giocatori.size());
	}
	
	public void mossa(){
		
		//logica nel giocare una mano
	}
	
	public void start(){
		//inizio il gioco scegliendo a random chi inizia
		//posso fare o come burraconline che inizia una determinata postazione oppure
		//random pescando ogni giocatore una carta e inizia la carta più alta (come l'app android)
		
		
	}
	
	
	public boolean getDuePlayers() {
		return duePlayers;
	}
	public void setDuePlayers(boolean duePlayers) {
		this.duePlayers = duePlayers;
	}

	public int getTurnoGiocatore() {
		return turnoGiocatore;
	}
	public void setTurnoGiocatore(int turnoGiocatore) {
		this.turnoGiocatore = turnoGiocatore;
	}
	public boolean getIsEnded() {
		return isEnded;
	}
	public void setIsEnded(boolean isEnded) {
		this.isEnded = isEnded;
	}

	public ArrayList<Giocatore> getGiocatori() {
		return giocatori;
	}

	public void setGiocatori(ArrayList<Giocatore> giocatori) {
		this.giocatori = giocatori;
	}
	
	
	
	
	
	
	
	
	
	
}
