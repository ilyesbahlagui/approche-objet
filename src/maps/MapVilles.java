package maps;

import java.util.HashMap;

import listes.Ville;

public class MapVilles {
	public static void main(String[] args) {
		HashMap<String, Ville> map=new HashMap<String, Ville>();
		map.put("Nimes",new Ville("Nimes", 145200));
		map.put("Paris",new Ville("Paris", 2005200));
		map.put("Montpellier",new Ville("Montpellier", 250000));
		map.put("Lyon",new Ville("Lyon", 400005));
		map.put("Marseille",new Ville("Marseille", 850000));
		
		int nbMinHab=1000000;
		String indexSup="";
		
		for (String cle : map.keySet()) {
			if (map.get(cle).getNbHabitant()<nbMinHab) {
				nbMinHab=map.get(cle).getNbHabitant();
//				System.out.println(map.get(cle).getNom());
				indexSup=cle;
			}
			System.out.println("La clé : "+cle+" => value : "+map.get(cle));
		}
		System.out.println("Element à supprimer est : "+map.get(indexSup));
		map.remove(indexSup);
		System.out.println(map.entrySet());
	
		
	}
}
