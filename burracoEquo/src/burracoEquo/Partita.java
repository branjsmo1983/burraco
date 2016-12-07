package burracoEquo;

public class Partita {

	private boolean duePlayers;
	private Squadra squadra1;
	private Squadra squadra2;
	private int turnoGiocatore;
	private boolean isEnded;
	
	
	
	public Partita() {
		super();
		//costruttore, controllo se ha 2 giocatori o uno solo
		if(isDuePlayers()){
			//creo squadra con 2 giocatori
			
		}else{
			//creare squadra con 1 giocatore
		}
	}
	
	public void mossa(){
		
		//logica nel giocare una mano
	}
	
	
	public boolean isDuePlayers() {
		return duePlayers;
	}
	public void setDuePlayers(boolean duePlayers) {
		this.duePlayers = duePlayers;
	}
	public Squadra getSquadra1() {
		return squadra1;
	}
	public void setSquadra1(Squadra squadra1) {
		this.squadra1 = squadra1;
	}
	public Squadra getSquadra2() {
		return squadra2;
	}
	public void setSquadra2(Squadra squadra2) {
		this.squadra2 = squadra2;
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
	
	
	
	
	
	
	
	
	
	
}
