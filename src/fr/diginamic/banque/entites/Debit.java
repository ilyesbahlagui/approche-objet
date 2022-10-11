package fr.diginamic.banque.entites;

public class Debit extends Operation {
	public Debit(int montantOperation,String date) {
		super(montantOperation, date);
	}
	
	public String getType() {
		return "DEBIT";
	}
//	getteur
	public int getMontantOperation(){
		return this.montantOperation;
	}
}

