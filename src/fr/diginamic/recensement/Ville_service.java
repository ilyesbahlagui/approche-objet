package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import fr.diginamic.recensement.comparator.ComparatorDixVille;

public class Ville_service extends MenuService {

	public void traiter(Recensement recensement) {
	}

	public void getPopulation(Recensement recensement, String choix) {
		List<Ville> oVille = recensement.getVille();
		choix = choix.substring(0, 1).toUpperCase() + choix.substring(1);
		boolean trouver = false;
		for (int i = 0; i < recensement.getVille().size(); i++) {
			String nom = oVille.get(i).getNomCommune();

			if (nom.equals(choix)) {

				System.out.println("La population de la ville " + nom + " est : " + oVille.get(i).getPopulation());
				trouver = true;
				break;
			}

		}
		if (!trouver) {
			System.out.println("La ville de " + choix + " n'est pas recensée");
		}
	}

	public void getTop10Ville(Recensement recensement, String choix) {
		List<Ville> oVille = recensement.getVille();

		System.out.println(oVille);

		Collections.sort(oVille, new ComparatorDixVille());
		for (int i = 0; i < 10; i++) {
			System.out.println(i + 1 + "." + oVille.get(i).getNomCommune());
		}

	}
}
