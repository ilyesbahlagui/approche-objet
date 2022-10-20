package fr.diginamic.recensement.comparator;

import java.util.Comparator;

import fr.diginamic.recensement.Ville;

public class ComparatorDixVille implements Comparator<Ville>{
	public int compare(Ville o1, Ville o2) {


		if (o1.getPopulation() > o2.getPopulation()) {
			return -1;
		}
		if (o1.getPopulation() < o2.getPopulation()) {
			return 1;
		}

		return 0;

		
	}
}
