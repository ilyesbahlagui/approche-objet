package sets;

import java.util.Arrays;
import java.util.HashSet;

public class TestSetString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> liste = new HashSet<String>(Arrays.asList("USA","France", "Allemagne", "UK", "Italie", "Japon", "Chine", "Russie", "Inde"));
		int nbLettrePays=0;
		String nomSup="";
		
		for (String element : liste) {
			if (element.length()>nbLettrePays) {
				nbLettrePays=element.length();
				nomSup=element;			}
		}
		liste.remove(nomSup);
		System.out.println("Ville supprimer : "+nomSup);
		for (String element : liste) {
			System.out.println("Ville : "+element);
		}
	}

}
