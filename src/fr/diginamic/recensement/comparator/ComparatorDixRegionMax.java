package fr.diginamic.recensement.comparator;

import java.util.Comparator;

import fr.diginamic.recensement.Region;


public class ComparatorDixRegionMax implements Comparator<Region> {
	
	public int compare(Region o1, Region o2) {


		if (o1.getPopulation() > o2.getPopulation()) {
			return -1;
		}
		if (o1.getPopulation() < o2.getPopulation()) {
			return 1;
		}

		return 0;

		
	}
}
