package fr.diginamic.testenumeration;

public enum Saison {

	PRINTEMPS("Printemps", 3), // public static final Saison PRINTEMPS= new Saison("Printemps",3)
	ETE("Ete", 4), 
	HIVER("Hiver", 2), 
	AUTONME("Autonme", 1);

	private String nom;
	private int ordre;

	private Saison(String nom, int ordre) {
		this.nom = nom;
		this.ordre = ordre;
	}

	public static Saison getInstance(String nom) {
		Saison getSaison = null;
		for (Saison element : Saison.values()) {

			if(nom.equals(element.getNom())) {
				System.out.println("L'instance trouver est  : "+element);
				 getSaison=element;
			}
		}
		return getSaison;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getOrdre() {
		return ordre;
	}

	public void setOrdre(int ordre) {
		this.ordre = ordre;
	}

}
