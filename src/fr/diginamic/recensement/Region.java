package fr.diginamic.recensement;

public class Region {
	private int population;
	private String nom;

	public Region( String nom) {

		this.nom = nom;
	}

	
	
	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}



	@Override
	public String toString() {
		return ""+population;
	}

	
	
}
