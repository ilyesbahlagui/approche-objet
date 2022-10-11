package fr.diginamic.formes;

public class Carre extends Rectangle {
	private double longeur;

	public Carre(double longeur,double longeurR, double largeurR) {
		super(longeurR,largeurR);
		this.longeur = longeur;
	}

	
	public double calculerPerimetre() {
		return 4*this.longeur;
	}

	public double calculerSurface() {
		return this.longeur * this.longeur;
	}
	
	
	public double getLongeur() {
		return longeur;
	}

	public void setLongeur(double longeur) {
		this.longeur = longeur;
	}

}
