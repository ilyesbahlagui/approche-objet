package fr.diginamic.banque.entites;

public abstract class Operation {
	 int montantOperation;
	 String date;
	 public Operation(int montantOperation,String date) {
		// TODO Auto-generated constructor stub
		 this.montantOperation=montantOperation;
		 this.date=date;
	}
	 
	 public abstract String getType();
	 public abstract int getMontantOperation();
	 
	 @Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Le montant => "+this.montantOperation+" && la date => "+this.date;
	}
}
