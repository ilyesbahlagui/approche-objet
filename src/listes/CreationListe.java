package listes;

import java.util.ArrayList;

import java.util.List;

public class CreationListe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> iTab = new ArrayList<Integer>();
		List<Integer> iTab2 = new ArrayList<Integer>();
		List<Integer> iTab3 = new ArrayList<Integer>();
		for (int i = 1; i <= 100; i++) {
			iTab.add(i);
		}
		for (int i = 100; i <= 200; i++) {
			iTab2.add(i);
		}
//		iTab3.addAll(iTab);
//		
//		iTab3.addAll(iTab2);
//		Ajout avec une boucle tous les elements de tab dans tab 3
		for(int i:iTab) {
			iTab3.add(i);
		}
		//Ajout avec une boucle tous les elements de tab2 dans tab 3
		for(int i:iTab2) {
			iTab3.add(i);
		}
//		
		for(int i:iTab3) {
			System.out.println(i);
		}
		System.out.println("La taille de la liste est : " + iTab3.size());
	}

}
