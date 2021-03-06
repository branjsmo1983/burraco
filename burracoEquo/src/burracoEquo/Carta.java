package burracoEquo;

public class Carta {
	
	/*
	 *  ----------------------- oggetto carta -------------------------------------
	 */
	
	

	private String nome;						// non so se serve
	private String seme;						// cuori quadri fiori picche
	private String colore;						// rosso o blu
	private int valore;							// per veder quanto vale la canasta che metti al tavolo e le carte che hai in mano quando perdi
	private boolean isJolly;					//controllo se � Jolly (il Jolly o il 2)
	private boolean isPin;						//il 2, isPin � sempre true, se lo uso come 2 gli setto il isJolly a false, senn� a true
	private int numero;							//uso due variabili numero perch� l'asso pu� essere attaccato vicino al 2 o al K
	private boolean attaccabile;				//non so se questo attributo � giusto in questa classe, serve a far un controllo per vedere se pu� essere attaccato ad una canasta
	private boolean coperta;					//abilita o disabilit� la sua visione, ovvero se vedo il fronte della carta o il retro
	private boolean selezionata;				//per vedere le carte che sto scegliendo di calare o attaccare
	private boolean assegnata;						//dice se � stata assegnata o meno
	private int numero2;						//serve per gestire l'asso (eventualmente anche il 2 se imposto il fatto che il jolly abbia valore 0)
	
	
	// ------------------------  overloading dei costruttori ------------------------------------------
	
	public Carta(String nome, String seme, String colore, int valore, boolean isJolly, boolean isPin, int numero,
			boolean attaccabile, boolean coperta, boolean selezionata, boolean assegnata, int numero2) {
		super();
		this.nome = nome;
		this.seme = seme;
		this.colore = colore;
		this.valore = valore;
		this.isJolly = isJolly;
		this.isPin = isPin;
		this.numero = numero;
		this.attaccabile = attaccabile;
		this.coperta = coperta;
		this.selezionata = selezionata;
		this.assegnata = assegnata;
		this.numero2 = numero2;
	}


	// ---------------------------------    get e set degli attributi ------------------------------
	

	public Carta(String nome, String seme, String colore, int valore, boolean assegnata, boolean isPin, int numero, int numero2) {
		super();
		this.nome = nome;
		this.seme = seme;
		this.colore = colore;
		this.valore = valore;
		this.isPin = isPin;
		this.numero = numero;
		this.assegnata = assegnata;
		this.numero2 = numero2;
	}


	public Carta(String nome, String colore, int valore, boolean isJolly, int numero, int numero2) {
		// new Carta("jolly1","rosso",30,true,0,0)
		this.nome = nome;
		this.colore = colore;
		this.valore = valore;
		this.isJolly = isJolly;
		this.numero = numero;
		this.numero2 = numero2;

	}


	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSeme() {
		return seme;
	}

	public void setSeme(String seme) {
		this.seme = seme;
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public int getValore() {
		return valore;
	}

	public void setValore(int valore) {
		this.valore = valore;
	}

	public boolean isJolly() {
		return isJolly;
	}

	public void setJolly(boolean isJolly) {
		this.isJolly = isJolly;
	}

	public boolean isPin() {
		return isPin;
	}

	public void setPin(boolean isPin) {
		this.isPin = isPin;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}



	public boolean getAttaccabile() {
		return attaccabile;
	}



	public void setAttaccabile(boolean attaccabile) {
		this.attaccabile = attaccabile;
	}



	public boolean getCoperta() {
		return coperta;
	}



	public void setCoperta(boolean coperta) {
		this.coperta = coperta;
	}



	public boolean getSelezionata() {
		return selezionata;
	}



	public void setSelezionata(boolean selezionata) {
		this.selezionata = selezionata;
	}



	public int getNumero2() {
		return numero2;
	}



	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}




	public boolean getAssegnata() {
		return assegnata;
	}




	public void setAssegnata(boolean assegnata) {
		this.assegnata = assegnata;
	}
	
	
	
	
}
