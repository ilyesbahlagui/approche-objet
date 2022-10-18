package fr.diginamic.recensement;

import java.io.IOException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// Charge le fichier recensement
		Recensement recensement = new Recensement();
		// SCANNER
		Scanner scanner = new Scanner(System.in);

		// BOOLEAN
		boolean console = true;

		// Choix de l'utilisateur

		while (console) {

			System.out.println("Faites un choix\n");
			System.out.println("1. Population d’une ville donnée\n");
			System.out.println("2. Population d’un département donné\n");
			System.out.println("3. Population d’une région donnée\n");
			System.out.println("4. Afficher les 10 régions les plus peuplées\n");
			System.out.println("5. Afficher les 10 départements les plus peuplés\n");
			System.out.println("6. Afficher les 10 villes les plus peuplées d’un département\n");
			System.out.println("7. Afficher les 10 villes les plus peuplées d’une région\n");
			System.out.println("8. Afficher les 10 villes les plus peuplées de France\n");
			System.out.println("9. Sortir");
			String choix = scanner.nextLine();

			switch (choix) {
			case "1": {
				System.out.println("Donner une ville pour afficher sa population");
				choix = scanner.nextLine();
				Ville_service nbPopulationVille = new Ville_service();
				nbPopulationVille.getPopulation(recensement, choix);
				break;
			}
			case "2": {
				System.out.println("Donner un departement(format xx) pour afficher sa population");
				choix = scanner.nextLine();
				Departement_service nbPopulationDep = new Departement_service();
				nbPopulationDep.getPopulation(recensement, choix);
				break;
			}
			case "3": {
				System.out.println("Donner une Région (format en xx ou le nom) pour afficher sa population");
				choix = scanner.nextLine();
				Region_service nbPopulationReg = new Region_service();
				nbPopulationReg.getPopulation(recensement, choix);
				break;
			}
			case "4": {
				System.out.println("Go afficher les 10 régions les plus peuplées");
				Region_service dixRegPopMax = new Region_service();
				dixRegPopMax.traiter(recensement);
				break;
			}
			case "5": {
				System.out.println("Go afficher les 10 régions les plus peuplées");
				Departement_service dixDepPopMax = new Departement_service();
				dixDepPopMax.traiter(recensement);
				break;
			}
			case "6": {
				System.out.println("Donner le departement pour afficher ses 10 villes les plus peuplées ");
				choix = scanner.nextLine();
				Departement_service dixVilleDep = new Departement_service();
				dixVilleDep.getTop10Ville(recensement, choix);
				break;
			}
			case "7": {
				System.out.println("Donner la region (format xx ou en nom) pour afficher ses 10 villes les plus peuplées ");
				choix = scanner.nextLine();
				Region_service dixVilleReg = new Region_service();
				dixVilleReg.getTop10Ville(recensement, choix);
				break;
			}
			case "8": {
				System.out.println("Afficher les 10 villes les plus peuplées de France ");
				Ville_service dixVilleFrance = new Ville_service();
				dixVilleFrance.getTop10Ville(recensement, choix);
				break;
			}
			case "9": {
				console = false;
			}

			}
		}
	}

}
