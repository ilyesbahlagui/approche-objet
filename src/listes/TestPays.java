package listes;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class TestPays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Pays> pays = new HashSet<Pays>(Arrays.asList(new Pays("USA", 3000000, 15000),
				new Pays("France", 100, 150), new Pays("Allemagne", 70000, 3000), new Pays("UK", 78788, 2000),
				new Pays("Italie", 8214, 400), new Pays("Japon", 8000, 100), new Pays("Chine", 7000000, 15000),
				new Pays("Russie", 10000, 15000), new Pays("Inde", 5000000, 15000)));

		int pibTotal = 0;
		int pibHabMax = 0;
		int pibTotalMin = 100000;
		String nomPaysPibHab;
		String nomPaysPibMaxTotal;

		for (Pays element : pays) {
			if (element.getPib() > pibHabMax) {
				pibHabMax = element.getPib();
				nomPaysPibHab = element.getNom();
			}
			if (element.getPibTotal() > pibTotal) {
				pibTotal = element.getPibTotal();
				nomPaysPibMaxTotal = element.getNom();
			}
			// Trouver le pib le plus petit pour l'utiliser ensuite
			if (element.getPibTotal() < pibTotalMin) {
				System.out.println("je suis dans le if ");
				pibTotalMin = element.getPibTotal();
			}

		}
		System.out.println(pibTotalMin);
		// Transforme en Majusucle le nom du Pays avec le PIB le plus petit// l'affiche
		// et le supprime

		Iterator<Pays> iterator = pays.iterator();
		while (iterator.hasNext()) {

			Pays value = iterator.next();

			if (pibTotalMin == value.getPibTotal()) {
				value.setNom(value.getNom().toUpperCase());
			System.out.println("Pays : "+value.getNom()+" avec le plus petit PIB total : "+value.getPibTotal()+" est supprimer ");
				iterator.remove();

			}
//			System.out.println("Pays : " + value.getNom() + " PIB total : " + value.getPibTotal() + " population : "+ value.getNbHabitant());
		}
		
		
		//Affiche le tableau pour voir si l'element est supprimer
		for (Pays element : pays) {
			System.out.println("Pays : " + element.getNom() + " PIB total : " + element.getPibTotal() + " population : "
					+ element.getNbHabitant());
		}

	}

}
