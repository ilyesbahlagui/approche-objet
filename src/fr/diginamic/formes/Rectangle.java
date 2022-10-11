package fr.diginamic.formes;

public class Rectangle extends Forme{
	private double longeur;
	private double largeur;

	public Rectangle(double longeur, double largeur) {
		super();
		this.longeur = longeur;
		this.largeur = largeur;
	}

	public double calculerPerimetre() {
		return (2 * this.largeur) + (2 * this.longeur);
	}

	public double calculerSurface() {
		return this.largeur * this.longeur;
	}

	public double getLongeur() {
		return longeur;
	}

	public void setLongeur(double longeur) {
		this.longeur = longeur;
	}

	public double getLargeur() {
		return largeur;
	}

	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}

}
