package tri;

import java.util.Comparator;

import listes.Ville;

public class ComparatorHabitant implements Comparator<Ville> {
	

	public int compare(Ville o1, Ville o2) {

		// pour les int on le fait manuellement avec des return et des if
		if (o1.getNbHabitant() > o2.getNbHabitant()) {
			return 1;
		}
		if (o1.getNbHabitant() < o2.getNbHabitant()) {
			return -1;
		}

		return 0;

		
	}
}
