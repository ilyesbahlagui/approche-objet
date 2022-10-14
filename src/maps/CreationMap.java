package maps;

import java.util.HashMap;

public class CreationMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> mapSalaire=new HashMap<>() {
			{
				put("Paul",1750);
				put("Hicham",1850);
				put("Yu",2250);
				put("Ingrid",2015);
				put("Chantal",2015);
				
			}
		};
		
		System.out.println("La taille de la map est "+mapSalaire.size());
		
		
	
	}

}
