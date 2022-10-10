package entites2;

import entites.AdressePostale;

public class Personne {
	public String nom;
	public String prenom;
	public AdressePostale adressePostale;

	// Constructeur
	public Personne(String nom, String prenom) {
		this.setNom(nom);
		this.setPrenom(prenom);

	}

	// Constructeur2
	public Personne(String nom, String prenom, AdressePostale adressePostale) {
		this.setNom(nom);
		this.setPrenom(prenom);
		this.setAdresse(adressePostale);

	}
	//retourne le nom en majuscule et le prenom
	public String getNomPrenom() {
		return this.nom.toUpperCase() + " " + this.prenom;
	}

	// SETEUR
	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public void setAdresse(AdressePostale adressePostale) {
		this.adressePostale = adressePostale;
	}
	
	// GETEUR
	public String getNom() {
		return this.nom;
	}

	public String getPrenom() {
		return this.prenom;
	}
	public AdressePostale getAdresse() {
		
		return this.adressePostale ;
	}

}
