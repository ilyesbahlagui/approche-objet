package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestListeInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> iTab = new ArrayList<Integer>(Arrays.asList(-1, 5, 7, 3, -2, 4, 8, 5));
		int max=0;
		int min=0;
		
		for (int element : iTab) {
			System.out.println(element);	
			if(element>max) {
				max=element;
			}
			if (element<min) {
				min=element;
			}
		}
		
		//-2 est considierer comme un index du coup on lui dit que c'est une valeur
		iTab.remove(Integer.valueOf(min));
		System.out.println("La taille de la liste est : "+iTab.size());
		System.out.println("Le plus grand est : "+max);
		System.out.println("Le plus petit est : "+min );
		System.out.println("Element supprimer  : "+min );
	
		//Affiche la liste pour verifier que MIN est supprimer et que les nombres - devient  +
		
		int compteur=0;
		System.out.println("Tableau final : ");
		for (int element : iTab) {
			if (element<0) {
				
				element=Math.abs(element);
				iTab.set(compteur, element);
//				System.out.println("element - :"+element);
				
			}
			compteur++;
			System.out.println(element);	
		
		}
		
		
		
	}

	
}
