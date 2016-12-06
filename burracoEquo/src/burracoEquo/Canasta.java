package burracoEquo;

import java.util.ArrayList;

public class Canasta {
	
	/*
	 * -------------------------------------------------------------------------------
	 * ------------ ArrayList di carte che verranno messi nella classe tavolo --------
	 * -------------------------------------------------------------------------------
	 */
	
	
	
	private ArrayList<Carta> colonna;
	
	

	public Canasta(ArrayList<Carta> colonna) {
		super();
		this.colonna = colonna;
	}

	
	
	// ------------------------------  get e set degli attributi ---------------------------
	
	
	public ArrayList<Carta> getcolonna() {
		return colonna;
	}
	
	

	

	public void setcolonna(ArrayList<Carta> colonna) {
		this.colonna = colonna;
	}
	
	public Carta getCarta(int index){
		return colonna.get(index);
	}
	public int getValoreCarta(int index){
		return getCarta(index).getValore();
	}
	public int getValoreCanasta(){
		int tot=0;
		for(Carta i:colonna){
			tot+=i.getValore();
		}
		return tot;
	}
	
	
	//------------------------ controlla che la canasta sia piena avendo già tutte le carte possibili
	
	public boolean isFull(){
		if(colonna.size()<=13){ // dall'asso al K più eventuale Jolly o pinella
			return false;
		}else
			return true;
	}
	
	// ---------------------- controllo se nella canasta ho già messo il jolly ( se è cosi non ne posso metter altri)
	
	public boolean haveJolly(){
		for(Carta i:colonna){
			if(i.isJolly()){
				return true;
			}else
				continue;
		}return false;

	}
	
	
	// -------------------- controllo che le carte selezionate formino una canasta valida -----------
	//non so bene se questo metodo devo farlo qui o in altre classi
	
	//da finire
	public boolean isRight(){
		if(colonna.size()<3)
			return false;
		else{
			
			return true;
		}
		
		
	}
	
}