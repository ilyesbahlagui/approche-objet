package maps;

import java.util.HashMap;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class mapVille {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		mapVilles.put(8, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(32, "Bordeaux");
		
		
		for(int cle : mapVilles.keySet()){
			System.out.println("La clé : "+cle+" => value : "+mapVilles.get(cle));
			
		}
		for (String ville : mapVilles.values()) {
			System.out.println("La valeur "+ville);
		}
		
		System.out.println("Taille de la map "+ mapVilles.size());
	}
	
	

}
