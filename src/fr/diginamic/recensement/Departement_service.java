package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import fr.diginamic.recensement.comparator.ComparatorDixDepMax;
import fr.diginamic.recensement.comparator.ComparatorDixVille;

public class Departement_service extends MenuService {

	public void traiter(Recensement recensement) {

		List<Ville> oVille = recensement.getVille();
		List<Departement> oDep = new ArrayList<Departement>();

		HashMap<String, Departement> map = new HashMap<String, Departement>();

		String nomDep = "";
		int population = 0;

		for (Ville element : oVille) {

			nomDep = element.getCodeDep().replaceAll(" ", "-");
//		System.out.println(nomRegion);
			if (map.get(nomDep) == null) {
				map.put(nomDep, new Departement(nomDep));
			}
			population = element.getPopulation();

			population = population + map.get(nomDep).getPopulation();
			Departement departement = map.get(nomDep);
			departement.setPopulation(population);

		}

		oDep.addAll(map.values());

//		System.out.println(map.entrySet());
		Collections.sort(oDep, new ComparatorDixDepMax());
		for (int i = 0; i < 10; i++) {
			System.out.println(i + 1 + "." + oDep.get(i).getNom());
		}

	}

	// GET POPULATION
	public void getPopulation(Recensement recensement, String choix) {
		List<Ville> oVille = recensement.getVille();

		boolean trouver = false;
		double total = 0;
		for (int i = 0; i < recensement.getVille().size(); i++) {
			String codeDep = oVille.get(i).getCodeDep();

			if (codeDep.equals(choix)) {
				total = total + oVille.get(i).getPopulation();
				trouver = true;
			}

		}
		if (!trouver) {
			System.out.println("Le Departement " + choix + " n'est pas recensée");
		} else {
			System.out.println("La population du departement " + choix + "  est : " + total);
		}
	}

	public void getTop10Ville(Recensement recensement, String choix) {
		List<Ville> oVille = recensement.getVille();
		List<Ville> oVilleDep = new ArrayList<>();
		String nomCommune = "";

		for (int i = 0; i < oVille.size(); i++) {
			nomCommune = oVille.get(i).getNomCommune();
			if (choix.equals(oVille.get(i).getCodeDep())) {
				oVilleDep.add(new Ville(nomCommune, oVille.get(i).getPopulation()));
			}

		}
//		System.out.println(oVilleDep);

		Collections.sort(oVilleDep, new ComparatorDixVille());
		for (int i = 0; i < 10; i++) {
			System.out.println(i + 1 + "." + oVilleDep.get(i).getNomCommune());
		}

	}
}
