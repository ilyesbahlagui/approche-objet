package files;



public class Ville {
	private String nom;
	private int nbHabitant;
	private String region;
	private int dp;


	public Ville(String nom, int nbHabitant, String region, int dp) {
		super();
		this.nom = nom;
		this.nbHabitant = nbHabitant;
		this.region = region;
		this.dp = dp;
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
		return "Ville [nom=" + nom + ", nbHabitant=" + nbHabitant + ", region=" + region + ", dp=" + dp + "]";
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public int getDp() {
		return dp;
	}

	public void setDp(int dp) {
		this.dp = dp;
	}

}
