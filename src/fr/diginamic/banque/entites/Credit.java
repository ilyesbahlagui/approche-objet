package fr.diginamic.banque.entites;

public class Credit extends Operation {
	public Credit(int montantOperation,String date) {
		super(montantOperation, date);
	}
	public String getType() {
		return "CREDIT";
	}
	
//	getteur
	public int getMontantOperation(){
		return this.montantOperation;
	}
}
