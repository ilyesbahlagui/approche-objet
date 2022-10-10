package fr.diginamic.banque.entites;

public class Compte {
	private int numeroCompte;
	private int solde;

	public Compte(int numeroCompte, int solde) {
		this.setNumeroCompte(numeroCompte);
		this.setSolde(solde);
	}

	// SETEUR
	public void setNumeroCompte(int numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public void setSolde(int solde) {
		this.solde = solde;
	}

	// GETEUR
	public int getNumeroCompte() {
		return this.numeroCompte;
	}

	public int getSolde() {
		return this.solde;
	}

}
