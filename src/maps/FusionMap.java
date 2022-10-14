package maps;

import java.util.HashMap;

public class FusionMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Création map1
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "Rouge");
		map1.put(2, "Vert");
		map1.put(3, "Orange");
		// Création map2
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(4, "Blanc");
		map2.put(5, "Bleu");
		map2.put(6, "Orange");

		HashMap<Integer, String> map3=new HashMap<Integer, String>();
		
		
			//Transfert le premier tableau 
			for(int cle : map1.keySet()){
				System.out.println("La clé : "+cle+" => value : "+map1.get(cle));
				map3.put(cle, map1.get(cle));
				
		}
			//Transfert le premier tableau 
			for(int cle : map2.keySet()){
				System.out.println("La clé : "+cle+" => value : "+map2.get(cle));
				map3.put(cle, map2.get(cle));
				
		}
			//affiche la Map sans boucle
			System.out.println(map3.entrySet());
			//System.out.println(map3.values());
			
		//****************Autre methode**********************//
			map3.putAll(map1);	
			map3.putAll(map2);
	
		//**************************************************//
	
	
		
	}

}
