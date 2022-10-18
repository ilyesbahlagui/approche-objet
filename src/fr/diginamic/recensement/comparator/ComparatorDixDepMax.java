package fr.diginamic.recensement.comparator;

import java.util.Comparator;

import fr.diginamic.recensement.Departement;



public class ComparatorDixDepMax implements Comparator<Departement> {
	
	public int compare(Departement o1, Departement o2) {


		if (o1.getPopulation() > o2.getPopulation()) {
			return -1;
		}
		if (o1.getPopulation() < o2.getPopulation()) {
			return 1;
		}

		return 0;

		
	}
}
