package fr.diginamic.formes;

public class Cercle extends Forme {
	private double rayon;
	static final double PI = Math.PI;

	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}

	public double calculerPerimetre() {
		return 2 * PI * this.rayon;
	}

	public double calculerSurface() {
		return this.rayon * this.rayon * PI;
	}
//getteur et setteur 
	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

}
