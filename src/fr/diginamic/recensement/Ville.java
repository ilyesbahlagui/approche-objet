package fr.diginamic.recensement;

public class Ville {

	private String nomCommune;
	private String nomRegion;
	private int codeCommune;
	private String codeDep;
	private int codeRegion;
	private int population;

	public Ville(String nomCommune, String nomRegion, int codeCommune, String codeDep, int codeRegion, int population) {
		super();
		this.nomCommune = nomCommune;
		this.nomRegion = nomRegion;
		this.codeCommune = codeCommune;
		this.codeDep = codeDep;
		this.codeRegion = codeRegion;
		this.population = population;
	}

	public Ville(String nomCommune,int population) {
		this.nomCommune = nomCommune;
		this.population = population;
	}

	public String getNomCommune() {
		return nomCommune;
	}

	public void setNomCommune(String nomCommune) {
		this.nomCommune = nomCommune;
	}

	public String getNomRegion() {
		return nomRegion;
	}

	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}

	public int getCodeCommune() {
		return codeCommune;
	}

	public void setCodeCommune(int codeCommune) {
		this.codeCommune = codeCommune;
	}

	public String getCodeDep() {
		return codeDep;
	}

	public void setCodeDep(String codeDep) {
		this.codeDep = codeDep;
	}

	public int getCodeRegion() {
		return codeRegion;
	}

	public void setCodeRegion(int codeRegion) {
		this.codeRegion = codeRegion;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	@Override
	public String toString() {
		return ""+ nomCommune ;
	}

}
