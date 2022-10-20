package listes;

import fr.diginamic.testenumeration.Continent;

public class Ville implements Comparable<Ville> {
	private String nom;
	private int nbHabitant;
	private Continent continent;

	public Ville(String nom, int nbHabitant, Continent continent) {
		super();
		this.nom = nom;
		this.nbHabitant = nbHabitant;
		this.continent = continent;
	}

	public Ville(String nom, int nbHabitant) {
		super();
		this.nom = nom;
		this.nbHabitant = nbHabitant;
	}

	public int compareTo(Ville ville) {

		// pour les int on le fait manuellement avec des return et des if
		if (this.nbHabitant > ville.getNbHabitant()) {
			return 1;
		}
		if (this.nbHabitant < ville.getNbHabitant()) {
			return -1;
		}

		return 0;

		// pOUR COMPARER LES STRING ON APPEL LA METHODE COMPARETO de la class String qui
		// retourne 1 ,0,-1
//		int result= this.nom.compareTo(ville.getNom());

//		return result;
	}

	public Boolean equals(Ville ville) {
		if (!(ville instanceof Ville)) {
			return false;
		}
		Ville other = (Ville) ville;
		return nom.equals(other.getNom()) && nbHabitant == other.getNbHabitant();

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

	@Override
	public String toString() {
		return " nom=" + nom + " nbHabitant=" + nbHabitant + " continent= " + continent.getNom();
	}

	public Continent getContinent() {
		return continent;
	}

	public void setContinent(Continent continent) {
		this.continent = continent;
	}

}
