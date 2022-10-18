package fr.diginamic.recensement;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class test {

	public static void main(String[] args) throws IOException {
		
		Recensement recensement = new Recensement();
		List<Ville> oVille=recensement.getVille();
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		
		String nomRegion="";
		int population=0;
		
		
		for (Ville element : oVille) {
			nomRegion=element.getNomRegion().replaceAll(" ","-");
			System.out.println(nomRegion);
			if (map.get(nomRegion)==null) {
				map.put(nomRegion, 0);
			}

				population=element.getPopulation();

				population=population+map.get(nomRegion);

				map.put(nomRegion,population);
				population=0;
			}
			

//		}
		System.out.println(map.get("Bretagne"));
		System.out.println(map.entrySet());

		
		
	}

}
