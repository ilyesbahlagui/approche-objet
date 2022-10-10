package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {
	private int tauxRemuneration;

	public CompteTaux(int numeroCompte, int solde, int tauxRemuneration) {
		super(numeroCompte, solde);
		this.tauxRemuneration = tauxRemuneration;
	}

//	SETTEUR
	public void setTauxRemuneration(int tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

//GETTEUR
	public int getTauxRemuneration() {
		return this.tauxRemuneration;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nClass CompteTaux =>"+"\nTaux remuneration : "+this.tauxRemuneration+""+super.toString();
	}
}
