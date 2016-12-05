package burracoEquo;

import java.util.ArrayList;

public class Canasta {
	
	private ArrayList<Carta> colonna;
	
	

	public Canasta(ArrayList<Carta> colonna) {
		super();
		this.colonna = colonna;
	}

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
	
	public boolean isFull(){
		if(colonna.size()<13){
			return false;
		}else
			return true;
	}
	
	public boolean haveJolly(){
		for(Carta i:colonna){
			if(i.isJolly()){
				return true;
			}else
				continue;
		}return false;

	}
	

}