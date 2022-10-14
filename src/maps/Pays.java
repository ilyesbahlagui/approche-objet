package maps;

public class Pays {
	private String nom;
	private double nbHabitant;
	private String continent;

	public Pays(String nom, double nbHabitant, String continent) {

		this.nom = nom;
		this.nbHabitant = nbHabitant;
		this.continent = continent;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getNbHabitant() {
		return nbHabitant;
	}

	public void setNbHabitant(double nbHabitant) {
		this.nbHabitant = nbHabitant;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

}
