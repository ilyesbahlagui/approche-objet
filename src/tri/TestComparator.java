package tri;

import java.util.ArrayList;
import java.util.Collections;

import listes.Ville;

public class TestComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Ville> liste = new ArrayList<Ville>();
		liste.add(new Ville("Nimes", 145200));
		liste.add(new Ville("Paris", 2005200));
		liste.add(new Ville("Montpellier", 250000));
		liste.add(new Ville("Lyon", 400005));
		liste.add(new Ville("Marseille", 850000));
		liste.add(new Ville("Avignon", 14520));
		
		
		Collections.sort(liste,new ComparatorHabitant());
		System.out.println("Liste Trier par nb habitants \n" +liste);
		
		Collections.sort(liste,new ComparatorNom());
		System.out.println("Liste Trier par ordre alphabetique \n" +liste);
	}

}
