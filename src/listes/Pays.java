package listes;

public class Pays {
	private String nom;
	private int nbHabitant;
	private int pib;
	
	
	public Pays(String nom, int nbHabitant, int pib) {
		this.nom = nom;
		this.nbHabitant = nbHabitant;
		this.pib = pib;
	}
	
	public int getPibTotal() {
		return this.nbHabitant*this.pib;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getNbHabitant() {
		return nbHabitant;
	}
	public void setNbHabitant(int nbHabitant) {
		this.nbHabitant = nbHabitant;
	}
	public int getPib() {
		return pib;
	}
	public void setPib(int pib) {
		this.pib = pib;
	}
	
	
}
