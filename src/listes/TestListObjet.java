package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;



public class TestListObjet {
	public static void main(String[] args) {

		
		List<Ville> liste = new ArrayList<Ville>(Arrays.asList(
				new Ville("Nice",343000),
				new Ville("Carcassonne",47800),
				new Ville("Narbonne",53400),
				new Ville("Lyon",484000),
				new Ville("Foix",9700),
				new Ville("Marseille",850700),
				new Ville("Pau",77200),
				new Ville("Tarbes",46600)));
		
		String villeMaxHab="";
		int nbVilleHabMax=0;
		int nbVilleHbPetit=100000;
		String villeMinHab="";
		int indexSup=0;
		int iPosition=0;
		
		
		Iterator<Ville> iterator = liste.iterator();
		while (iterator.hasNext()) {
		
			Ville ville=iterator.next();
			
			if(ville.getNbHabitant()>nbVilleHabMax) {
				nbVilleHabMax=ville.getNbHabitant();
				villeMaxHab=ville.getNom();
			}
			
			if (ville.getNbHabitant()<nbVilleHbPetit) {
				nbVilleHbPetit=ville.getNbHabitant();
				villeMinHab=ville.getNom();
				indexSup=iPosition;
				
			}
			iPosition++;
		}
		
		liste.remove(indexSup);

		for(Ville element: liste) {
			System.out.println("Ville : "+element.getNom()+" population : "+element.getNbHabitant());
		}
		System.out.println("La ville la plus grande est : "+villeMaxHab+" avec "+nbVilleHabMax+" habitants");
		System.out.println("La ville la plus petite est : "+villeMinHab+" avec "+nbVilleHbPetit+" habitants");
		
	}
}
