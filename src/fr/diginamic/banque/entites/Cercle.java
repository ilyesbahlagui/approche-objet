package fr.diginamic.banque.entites;

public class Cercle {
	private double rayon;
	static final double PI = Math.PI;

	public Cercle(double rayon) {
		this.rayon = rayon;
	}

	public double getPerimetre() {
		return 2 * PI * this.rayon;
	}

	public double getSurface() {
		return this.rayon * this.rayon * PI;
	}

	// setteur

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

	// getteur
	public double getRayon() {
		return this.rayon;
	}
}
