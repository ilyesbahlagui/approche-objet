package fr.diginamic.testenumeration;

public enum Continent {
	EUROPE("Europe"),
	ASIE("Asie"),
	AMERIQUE("Amerique"),
	AFRIQUE("Afrique"),
	OCEANIE("Oceanie");


	
	
	private String nom;

	private Continent(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
}
