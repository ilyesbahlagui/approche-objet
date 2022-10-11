package fr.diginamic.essais;

import fr.diginamic.chaines.ManipulationChaine;

public class TestChaine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ManipulationChaine chaine = new ManipulationChaine();
//		AFFICHE le premiere caractere
		char premierCaractere = chaine.getChaine().charAt(0);
		System.out.println("Premier caractere : " + premierCaractere);
		
		// LONGUEUR DE LA CHAINE
		System.out.println("Longeur de la chaine : " + chaine.getChaine().length());

		// afficher l’index du premier «;»
		System.out.println("index du premier «;» est " + chaine.getChaine().indexOf(";"));
		
		// Extraire une partie de la chaine entre un index de debut un de fin
		String newString = chaine.getChaine().substring(7, 13);
		System.out.println("Partie de la chaine recuperer : " + newString);
		
		//afficher le nom via substring() et indexof()
		String chaine2=chaine.getChaine();
		String nom = chaine.getChaine().substring(chaine2.indexOf("D"), chaine2.indexOf("d")+1);
		System.out.println("Extraction du nom de famille : " + nom);
		
		//afficher le nom en majuscule
		System.out.println("Majsucule : "+nom.toUpperCase());
		//afficher le nom en majuscule
		System.out.println("Miniscule : "+nom.toLowerCase());
		
		//Decoupe d'une chaine 
		String [] splitTab=chaine.getChaine().split(";");
		System.out.println("Element du tableau :" );
		for(String word : splitTab) {
			
			System.out.println(word);
		}

	}

}
