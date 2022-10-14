package maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;



public class ComptagePaysContinent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Pays> pays = new ArrayList<Pays>(Arrays.asList(new Pays("France", 65000000, "Europe"),
				new Pays("Allemagne", 80000000, "Europe"), new Pays("Belgique", 10000000, "Europe"),
				new Pays("Russie", 150000000, "Asie"), new Pays("Chine", 1400000000, "Asie"),
				new Pays("Indonesie", 220000000, "Oceanie"), new Pays("Australie", 20000000, "Europe")));
		
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		
		String nomContient="";
		int nbContinent=0;
		
		
		for (Pays element : pays) {
			nomContient=element.getContinent();
			for (Pays element2 : pays) {
				if(nomContient==element2.getContinent()) {
					nbContinent++;
				}
			}
			map.put(nomContient,nbContinent);
			nbContinent=0;
		}
		System.out.println(map.entrySet());
	}
}
