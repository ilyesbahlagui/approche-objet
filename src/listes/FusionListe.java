package listes;

import java.util.ArrayList;
import java.util.List;

public class FusionListe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> liste1= new ArrayList<String>();
		liste1.add("Rouge");
		liste1.add("Vert");
		liste1.add("Orange");
		List<String> liste2= new ArrayList<String>();
		liste2.add("Blanc");
		liste2.add("Bleu");
		liste2.add("Orange");
		
		
		List<String> iTab3= new ArrayList<String>();
		
		//VERSION 1 POUR AJOUTER LES ELEMENTS AVEC addAll()
		
//		iTab3.addAll(liste1);
//		
//		iTab3.addAll(liste2);
//		
//		
		//VERSION 2 avec les boucles

		for(String i:liste1) {
			iTab3.add(i);
		}

		for(String i:liste2) {
			iTab3.add(i);
		}
	
		for(String i:iTab3) {
			System.out.println(i);
		}
		System.out.println("La taille de la liste est : " + iTab3.size());
	}

}
