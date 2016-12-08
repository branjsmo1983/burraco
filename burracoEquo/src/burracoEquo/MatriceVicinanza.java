package burracoEquo;

public class MatriceVicinanza {
	
	/*
	 * -------------------- classe in cui tengo conto di tutte le carte e le istanzio nella matrice e array --------
	 * -------------------- matrice con carte dall'asso al K, array con i jolly ------------------------------------
	 */
	
	
	private static Carta[][] matriceCarte = new Carta[8][13];
	private static Carta[] arrayJolly = new Carta[4];

	public static Carta[][] getMatriceCarte() {
		return matriceCarte;
	}

	public static void setMatriceCarte(Carta[][] matriceCarte) {
		MatriceVicinanza.matriceCarte = matriceCarte;
	}
	public static Carta[] getArrayJolly() {
		return arrayJolly;
	}

	public static void setArrayJolly(Carta[] arrayJolly) {
		MatriceVicinanza.arrayJolly = arrayJolly;
	}
	
	public static void inizializza(){
		
		
		//istanzio ogni oggetto della matrice
		//String nome, String seme, String colore, int valore, boolean isJolly, boolean isPin, int numero,
		//int numero2
		//istanzio ogni riga della matrice
		// gli attributi booleani attaccata, coperta,selezionata li setto durante il gioco
		
		
		
		// ----------------        CUORI ROSSO       
		matriceCarte[0][0]= new Carta("asso","cuori","rosso",15,false,false,1,14);
		matriceCarte[0][1]= new Carta("due","cuori","rosso",20,false,true,2,0);
		matriceCarte[0][2]= new Carta("tre","cuori","rosso",5,false,false,3,3);
		matriceCarte[0][3]= new Carta("quattro","cuori","rosso",5,false,false,4,4);
		matriceCarte[0][4]= new Carta("cinque","cuori","rosso",5,false,false,5,5);
		matriceCarte[0][5]= new Carta("sei","cuori","rosso",5,false,false,6,6);
		matriceCarte[0][6]= new Carta("sette","cuori","rosso",5,false,false,7,7);
		matriceCarte[0][7]= new Carta("otto","cuori","rosso",10,false,false,8,8);
		matriceCarte[0][8]= new Carta("nove","cuori","rosso",10,false,false,9,9);
		matriceCarte[0][9]= new Carta("10","cuori","rosso",10,false,false,10,10);
		matriceCarte[0][10]= new Carta("j","cuori","rosso",10,false,false,11,11);
		matriceCarte[0][11]= new Carta("q","cuori","rosso",10,false,false,12,12);
		matriceCarte[0][12]= new Carta("k","cuori","rosso",10,false,false,13,13);
		
		// ---------------			CUORI BLU
		matriceCarte[1][0]= new Carta("asso","cuori","blu",15,false,false,1,14);
		matriceCarte[1][1]= new Carta("due","cuori","blu",20,false,true,2,0);
		matriceCarte[1][2]= new Carta("tre","cuori","blu",5,false,false,3,3);
		matriceCarte[1][3]= new Carta("quattro","cuori","blu",5,false,false,4,4);
		matriceCarte[1][4]= new Carta("cinque","cuori","blu",5,false,false,5,5);
		matriceCarte[1][5]= new Carta("sei","cuori","blu",5,false,false,6,6);
		matriceCarte[1][6]= new Carta("sette","cuori","blu",5,false,false,7,7);
		matriceCarte[1][7]= new Carta("otto","cuori","blu",10,false,false,8,8);
		matriceCarte[1][8]= new Carta("nove","cuori","blu",10,false,false,9,9);
		matriceCarte[1][9]= new Carta("10","cuori","blu",10,false,false,10,10);
		matriceCarte[1][10]= new Carta("j","cuori","blu",10,false,false,11,11);
		matriceCarte[1][11]= new Carta("q","cuori","blu",10,false,false,12,12);
		matriceCarte[1][12]= new Carta("k","cuori","blu",10,false,false,13,13);
		
		// ----------------			QUADRI ROSSI
		matriceCarte[2][0]= new Carta("asso","quadri","rosso",15,false,false,1,14);
		matriceCarte[2][1]= new Carta("due","quadri","rosso",20,false,true,2,0);
		matriceCarte[2][2]= new Carta("tre","quadri","rosso",5,false,false,3,3);
		matriceCarte[2][3]= new Carta("quattro","quadri","rosso",5,false,false,4,4);
		matriceCarte[2][4]= new Carta("cinque","quadri","rosso",5,false,false,5,5);
		matriceCarte[2][5]= new Carta("sei","quadri","rosso",5,false,false,6,6);
		matriceCarte[2][6]= new Carta("sette","quadri","rosso",5,false,false,7,7);
		matriceCarte[2][7]= new Carta("otto","quadri","rosso",10,false,false,8,8);
		matriceCarte[2][8]= new Carta("nove","quadri","rosso",10,false,false,9,9);
		matriceCarte[2][9]= new Carta("10","quadri","rosso",10,false,false,10,10);
		matriceCarte[2][10]= new Carta("j","quadri","rosso",10,false,false,11,11);
		matriceCarte[2][11]= new Carta("q","quadri","rosso",10,false,false,12,12);
		matriceCarte[2][12]= new Carta("k","quadri","rosso",10,false,false,13,13);
		
		// ----------------			QUADRI BLU
		
		matriceCarte[3][0]= new Carta("asso","quadri","blu",15,false,false,1,14);
		matriceCarte[3][1]= new Carta("due","quadri","blu",20,false,true,2,0);
		matriceCarte[3][2]= new Carta("tre","quadri","blu",5,false,false,3,3);
		matriceCarte[3][3]= new Carta("quattro","quadri","blu",5,false,false,4,4);
		matriceCarte[3][4]= new Carta("cinque","quadri","blu",5,false,false,5,5);
		matriceCarte[3][5]= new Carta("sei","quadri","blu",5,false,false,6,6);
		matriceCarte[3][6]= new Carta("sette","quadri","blu",5,false,false,7,7);
		matriceCarte[3][7]= new Carta("otto","quadri","blu",10,false,false,8,8);
		matriceCarte[3][8]= new Carta("nove","quadri","blu",10,false,false,9,9);
		matriceCarte[3][9]= new Carta("10","quadri","blu",10,false,false,10,10);
		matriceCarte[3][10]= new Carta("j","quadri","blu",10,false,false,11,11);
		matriceCarte[3][11]= new Carta("q","quadri","blu",10,false,false,12,12);
		matriceCarte[3][12]= new Carta("k","quadri","blu",10,false,false,13,13);
		
		// ----------------        FIORI ROSSO       
				matriceCarte[4][0]= new Carta("asso","fiori","rosso",15,false,false,1,14);
				matriceCarte[4][1]= new Carta("due","fiori","rosso",20,false,true,2,0);
				matriceCarte[4][2]= new Carta("tre","fiori","rosso",5,false,false,3,3);
				matriceCarte[4][3]= new Carta("quattro","fiori","rosso",5,false,false,4,4);
				matriceCarte[4][4]= new Carta("cinque","fiori","rosso",5,false,false,5,5);
				matriceCarte[4][5]= new Carta("sei","fiori","rosso",5,false,false,6,6);
				matriceCarte[4][6]= new Carta("sette","fiori","rosso",5,false,false,7,7);
				matriceCarte[4][7]= new Carta("otto","fiori","rosso",10,false,false,8,8);
				matriceCarte[4][8]= new Carta("nove","fiori","rosso",10,false,false,9,9);
				matriceCarte[4][9]= new Carta("10","fiori","rosso",10,false,false,10,10);
				matriceCarte[4][10]= new Carta("j","fiori","rosso",10,false,false,11,11);
				matriceCarte[4][11]= new Carta("q","fiori","rosso",10,false,false,12,12);
				matriceCarte[4][12]= new Carta("k","fiori","rosso",10,false,false,13,13);
				
				// ---------------			FIORI BLU
				matriceCarte[5][0]= new Carta("asso","fiori","blu",15,false,false,1,14);
				matriceCarte[5][1]= new Carta("due","fiori","blu",20,false,true,2,0);
				matriceCarte[5][2]= new Carta("tre","fiori","blu",5,false,false,3,3);
				matriceCarte[5][3]= new Carta("quattro","fiori","blu",5,false,false,4,4);
				matriceCarte[5][4]= new Carta("cinque","fiori","blu",5,false,false,5,5);
				matriceCarte[5][5]= new Carta("sei","fiori","blu",5,false,false,6,6);
				matriceCarte[5][6]= new Carta("sette","fiori","blu",5,false,false,7,7);
				matriceCarte[5][7]= new Carta("otto","fiori","blu",10,false,false,8,8);
				matriceCarte[5][8]= new Carta("nove","fiori","blu",10,false,false,9,9);
				matriceCarte[5][9]= new Carta("10","fiori","blu",10,false,false,10,10);
				matriceCarte[5][10]= new Carta("j","fiori","blu",10,false,false,11,11);
				matriceCarte[5][11]= new Carta("q","fiori","blu",10,false,false,12,12);
				matriceCarte[5][12]= new Carta("k","fiori","blu",10,false,false,13,13);
				
				// ----------------			PICCHE ROSSI
				matriceCarte[6][0]= new Carta("asso","picche","rosso",15,false,false,1,14);
				matriceCarte[6][1]= new Carta("due","picche","rosso",20,false,true,2,0);
				matriceCarte[6][2]= new Carta("tre","picche","rosso",5,false,false,3,3);
				matriceCarte[6][3]= new Carta("quattro","picche","rosso",5,false,false,4,4);
				matriceCarte[6][4]= new Carta("cinque","picche","rosso",5,false,false,5,5);
				matriceCarte[6][5]= new Carta("sei","picche","rosso",5,false,false,6,6);
				matriceCarte[6][6]= new Carta("sette","picche","rosso",5,false,false,7,7);
				matriceCarte[6][7]= new Carta("otto","picche","rosso",10,false,false,8,8);
				matriceCarte[6][8]= new Carta("nove","picche","rosso",10,false,false,9,9);
				matriceCarte[6][9]= new Carta("10","picche","rosso",10,false,false,10,10);
				matriceCarte[6][10]= new Carta("j","picche","rosso",10,false,false,11,11);
				matriceCarte[6][11]= new Carta("q","picche","rosso",10,false,false,12,12);
				matriceCarte[6][12]= new Carta("k","picche","rosso",10,false,false,13,13);
				
				// ----------------			PICCHE BLU
				
				matriceCarte[7][0]= new Carta("asso","picche","blu",15,false,false,1,14);
				matriceCarte[7][1]= new Carta("due","picche","blu",20,false,true,2,0);
				matriceCarte[7][2]= new Carta("tre","picche","blu",5,false,false,3,3);
				matriceCarte[7][3]= new Carta("quattro","picche","blu",5,false,false,4,4);
				matriceCarte[7][4]= new Carta("cinque","picche","blu",5,false,false,5,5);
				matriceCarte[7][5]= new Carta("sei","picche","blu",5,false,false,6,6);
				matriceCarte[7][6]= new Carta("sette","picche","blu",5,false,false,7,7);
				matriceCarte[7][7]= new Carta("otto","picche","blu",10,false,false,8,8);
				matriceCarte[7][8]= new Carta("nove","picche","blu",10,false,false,9,9);
				matriceCarte[7][9]= new Carta("10","picche","blu",10,false,false,10,10);
				matriceCarte[7][10]= new Carta("j","picche","blu",10,false,false,11,11);
				matriceCarte[7][11]= new Carta("q","picche","blu",10,false,false,12,12);
				matriceCarte[7][12]= new Carta("k","picche","blu",10,false,false,13,13);
				
				// -------------- inizializzo array jolly
				//String nome, String colore, int valore, boolean isJolly
				
				arrayJolly[0]=new Carta("jolly1","rosso",30,true,0,0);
				arrayJolly[1]=new Carta("jolly2","rosso",30,true,0,0);
				arrayJolly[2]=new Carta("jolly1","blu",30,true,0,0);
				arrayJolly[3]=new Carta("jolly2","blu",30,true,0,0);
				
				
		
	}


}
