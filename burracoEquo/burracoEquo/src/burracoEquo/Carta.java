package burracoEquo;

public class Carta {

	private String nome;
	private String seme;
	private String colore;
	private int valore;
	private boolean isJolly;
	private boolean isPin;
	private int numero;
	private boolean attaccabile;
	private boolean coperta;
	private boolean selezionata;
	private int numero2;
	
	public Carta(String nome, String seme, String colore, int valore, boolean isJolly, boolean isPin, int numero,
			boolean attaccabile, boolean coperta, boolean selezionata,int numero2) {
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
		this.selezionata=selezionata;
		this.numero2 = numero2;
	}
	



	public Carta(String nome, String seme, String colore, int valore, boolean isJolly, boolean isPin, int numero,
			int numero2) {
		super();
		this.nome = nome;
		this.seme = seme;
		this.colore = colore;
		this.valore = valore;
		this.isJolly = isJolly;
		this.isPin = isPin;
		this.numero = numero;
		this.numero2 = numero2;
	}




	public Carta(String nome, String seme, String colore, int valore, boolean isJolly, boolean isPin, int numero,
			boolean attaccabile, int numero2) {
		super();
		this.nome = nome;
		this.seme = seme;
		this.colore = colore;
		this.valore = valore;
		this.isJolly = isJolly;
		this.isPin = isPin;
		this.numero = numero;
		this.attaccabile = attaccabile;
		this.numero2 = numero2;
	}



	public Carta(String nome, String seme, String colore, int valore, boolean isJolly, boolean isPin, int numero) {
		super();
		this.nome = nome;
		this.seme = seme;
		this.colore = colore;
		this.valore = valore;
		this.isJolly = isJolly;
		this.isPin = isPin;
		this.numero = numero;
	}
	
	

	public Carta(String nome, String colore, int valore, boolean isJolly,int numero,int numero2) {
		super();
		this.nome = nome;
		this.colore = colore;
		this.valore = valore;
		this.isJolly = isJolly;
		this.numero=numero;
		this.numero2=numero2;
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
	
	
	
	
}
