package fr.diginamic.utils;

import fr.diginamic.banque.entites.Cercle;

public class CercleFactory {
	
	public static Cercle getCercle(double rayon) {
		return new Cercle(rayon);
	}
}
