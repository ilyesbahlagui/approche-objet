package tri;

import java.util.Comparator;

import listes.Ville;

public class ComparatorNom implements Comparator<Ville> {
	

	public int compare(Ville o1, Ville o2) {

		// pour les int on le fait manuellement avec des return et des if
		int result= o1.getNom().compareTo(o2.getNom());

		return result;
	}
}
