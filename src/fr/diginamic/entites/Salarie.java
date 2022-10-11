package fr.diginamic.entites;

public class Salarie {

	private String nom;
	private String prenomString;
	private double salaire;

	public Salarie(String nom, String prenomString, double salaire) {

		this.nom = nom;
		this.prenomString = prenomString;
		this.salaire = salaire;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the prenomString
	 */
	public String getPrenomString() {
		return prenomString;
	}

	/**
	 * @param prenomString the prenomString to set
	 */
	public void setPrenomString(String prenomString) {
		this.prenomString = prenomString;
	}

	/**
	 * @return the salaire
	 */
	public double getSalaire() {
		return salaire;
	}

	/**
	 * @param salaire the salaire to set
	 */
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	

}
