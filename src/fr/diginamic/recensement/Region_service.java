package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import fr.diginamic.recensement.comparator.ComparatorDixRegionMax;
import fr.diginamic.recensement.comparator.ComparatorDixVille;

public class Region_service extends MenuService {

	public void traiter(Recensement recensement) {

		List<Ville> oVille = recensement.getVille();
		List<Region> oRegion=new ArrayList<Region>();

		HashMap<String, Region> map = new HashMap<String, Region>();

		String nomRegion = "";
		int population = 0;

		for (Ville element : oVille) {
			
			nomRegion = element.getNomRegion().replaceAll(" ", "-");
//			System.out.println(nomRegion);
			if (map.get(nomRegion) == null) {
				map.put(nomRegion, new Region(nomRegion));
			}
			population=element.getPopulation();
			
			population=population+map.get(nomRegion).getPopulation();
			Region region=map.get(nomRegion);
			region.setPopulation(population);
			
			

		}
		
		oRegion.addAll(map.values());

//		System.out.println(map.entrySet());
		Collections.sort(oRegion, new ComparatorDixRegionMax());
		for(int i=0;i<10;i++) {
			System.out.println(i+1+"."+oRegion.get(i).getNom());
		}



	}
	
	public void getPopulation(Recensement recensement, String choix) {
		List<Ville> oVille=recensement.getVille();
		choix=choix.substring(0, 1).toUpperCase() + choix.substring(1);
		boolean trouver=false;
		double total=0;
		
		//si c'est un code region
		if(choix.length()==2) {
			int choixInt=Integer.valueOf(choix);
			
			for (int i = 0; i < recensement.getVille().size(); i++) {
				int codeReg=Integer.valueOf(oVille.get(i).getCodeRegion());
				
				if(codeReg==choixInt) {
					total=total+oVille.get(i).getPopulation();
					trouver=true;
				}
				
				
			}
		}
		//c'est un nom
		else if (choix.length()>2) {
			
			choix=choix.substring(0, 1).toUpperCase() + choix.substring(1);
			for (int i = 0; i < recensement.getVille().size(); i++) {
				String nomReg=oVille.get(i).getNomRegion();
				
				if(nomReg.equals(choix)) {
					total=total+oVille.get(i).getPopulation();
					trouver=true;
				}
				
				
			}
		}
		
		if(!trouver) {
			System.out.println("La Région "+choix+" n'est pas recensée");
		}else {
			System.out.println("La population de la Région "+choix+"  est : "+total);
		}
	}
	
	public void getTop10Ville(Recensement recensement, String choix) {
		
		List<Ville> oVille = recensement.getVille();
		List<Ville> oVilleReg = new ArrayList<>();
		String nomCommune = "";
		
		
		//si c'est un code region
		if(choix.length()==2) {
			int choixInt=Integer.valueOf(choix);
			
			for (int i = 0; i < oVille.size(); i++) {
				nomCommune = oVille.get(i).getNomCommune();
				if (choixInt==oVille.get(i).getCodeRegion()) {
					oVilleReg.add(new Ville(nomCommune, oVille.get(i).getPopulation()));
				}

			}
//			System.out.println(oVilleReg);

			Collections.sort(oVilleReg, new ComparatorDixVille());
			for (int i = 0; i < 10; i++) {
				System.out.println(i + 1 + "." + oVilleReg.get(i).getNomCommune());
			}

		}//c'est un nom
		else if (choix.length()>2) {
			choix=choix.substring(0, 1).toUpperCase() + choix.substring(1);
			
			for (int i = 0; i < oVille.size(); i++) {
				nomCommune = oVille.get(i).getNomCommune();
				if (choix.equals(oVille.get(i).getNomRegion())) {
					oVilleReg.add(new Ville(nomCommune, oVille.get(i).getPopulation()));
				}

			}
//			System.out.println(oVilleReg);

			Collections.sort(oVilleReg, new ComparatorDixVille());
			for (int i = 0; i < 10; i++) {
				System.out.println(i + 1 + "." + oVilleReg.get(i).getNomCommune());
			}
		}
		
		
		
		
		
	

	}
	
}
