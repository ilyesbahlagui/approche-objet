package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestListeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> liste = new ArrayList<String>(
				Arrays.asList("Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbe"));
		int iPosition=0;
		String maxString = "";
		int longeurString = 0;
		

		for (Iterator<String> iterator = liste.iterator(); iterator.hasNext();) {
			String ville = iterator.next();
			
			if (ville.charAt(0) == 'N') {
				iterator.remove();
				System.out.println("Ville commence par N : " + ville);

			} 
		}

		
		for (String element : liste) {
			if (element.length() > longeurString) {
				maxString = element;
				longeurString = element.length();
				System.out.println("Plus grand " + maxString);
			}
			
			element = element.toUpperCase();
			liste.set(iPosition, element);
			System.out.println(element);
		}
	}

}
