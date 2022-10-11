package fr.diginamic.essais;

import fr.diginamic.chaines.ManipulationChaine;
import fr.diginamic.entites.Salarie;

public class TestSalarie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ManipulationChaine oChaine=new ManipulationChaine();
		String chaine=oChaine.getChaine();
		
		//Decoupe d'une chaine 
		String [] splitTab=chaine.split(";");
		System.out.println("Element du tableau :" );
		for(String word : splitTab) {
			System.out.println(word);
		}
		
		String nom=splitTab[0];
		String prenom=splitTab[1];
		Double salaire=Double.parseDouble( splitTab[2].replace(" ",""));
		
		Salarie oSalarie=new Salarie(nom,prenom,salaire);
		System.out.println("Salaire "+oSalarie.getSalaire());

		
	}

}
