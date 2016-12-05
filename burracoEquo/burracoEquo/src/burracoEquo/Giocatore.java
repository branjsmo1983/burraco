package burracoEquo;

public class Giocatore {

	private String nome;
	private int punteggio;
	private boolean seiDmano;
	
	
	

	public Giocatore(String nome, int punteggio, boolean seiDmano) {
		super();
		this.nome = nome;
		this.punteggio = punteggio;
		this.seiDmano = seiDmano;
	}

	public Giocatore(String nome, int punteggio) {
		super();
		this.nome = nome;
		this.punteggio = punteggio;
	}

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
}
