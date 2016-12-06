package burracoEquo;

import java.util.ArrayList;

public class Tavolo {

	// ------------------ oggetto che indica al giocatore dove mettere le sue canaste -------
	
	private ArrayList<Canasta> canaste;
	
	// ------- metodo che ritorna la canasta in posizione index ---------------------------
	// ++++++ non so se mi serve +++++++++++++++++
	public Canasta getCanasta(int index){
		return canaste.get(index);
	}
	
	//------- metodo che ritorna il valore della canasta in posizione index ---------------
	// ++++++ non so se mi serve +++++++++++++++++
	public int getValore(int index){
		return getCanasta(index).getValoreCanasta();
	}
	
	//------- metodo che da il valore di tutte le canaste presenti nel tavolo -------------
	public int getValoreTavolo(){
		int tot=0;
		for(Canasta i:canaste){
			tot+=i.getValoreCanasta(); 		//getValoreCanasta() è un metodo della classe canasta che rirorna il valore complessivo della stessa
		}
		return tot;
	}

	// ----------- costruttore ----------------
	public Tavolo(ArrayList<Canasta> canaste) {
		super();
		this.canaste = canaste;
	}

	// ---- gett e set
	public ArrayList<Canasta> getCanaste() {
		return canaste;
	}

	public void setCanaste(ArrayList<Canasta> canaste) {
		this.canaste = canaste;
	}
}
