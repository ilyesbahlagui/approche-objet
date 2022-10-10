package fr.diginamic.banque.entites;

public abstract class Operation {
	 int montantOperation;
	 String date;
	 public Operation(int montantOperation,String date) {
		// TODO Auto-generated constructor stub
		 this.montantOperation=montantOperation;
		 this.date=date;
	}
	 public int get() {
		 return 15;
	 }
	 @Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Le montant => "+this.montantOperation+" && la date => "+this.date;
	}
}
