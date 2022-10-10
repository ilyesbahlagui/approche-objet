package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compte compt1=new Compte(5889966, 14000);
		System.out.println(compt1);
		Compte [] tabComptes=new Compte[2];
		tabComptes[0]=new Compte(5889966, 14000);
		tabComptes[1]=new CompteTaux(88888, 999,7);
		for(int i=0;i<tabComptes.length;i++) {
			
//			System.out.println(tabComptes[i].toString());
		}
		System.out.println(tabComptes[1].toString());
	}

}
