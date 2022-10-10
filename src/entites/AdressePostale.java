package entites;

public class AdressePostale {
	int numeroRue;
	String nomRue;
	int codePostal;
	String ville;

	// constructeur
	AdressePostale(String nomRue, String ville, int codePostal, int numeroRue) {
		this.nomRue = nomRue;
		this.ville = ville;
		this.codePostal = codePostal;
		this.numeroRue = numeroRue;
	}

	// SETEUR
	public void setNomRue(String nomRue) {
		this.nomRue = nomRue;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public void setville(String ville) {
		this.ville = ville;
	}

	public void setNumeroRue(int numeroRue) {
		this.numeroRue = numeroRue;
	}

	// GETEUR
	public String getNomRue() {
		return this.nomRue;
	}

	public String getVille() {
		return this.ville;
	}

	public int getCodePostal() {
		return this.codePostal;
	}

	public int getNumeroRue() {
		return this.numeroRue;
	}

}
