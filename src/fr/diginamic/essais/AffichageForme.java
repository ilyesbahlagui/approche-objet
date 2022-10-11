package fr.diginamic.essais;

import fr.diginamic.formes.Forme;

public class AffichageForme {

	
	public void afficher(Forme oForme) {
		System.out.println("La surface : "+oForme.calculerSurface());
		System.out.println("Le Perimetre : "+oForme.calculerPerimetre());
	}
}
