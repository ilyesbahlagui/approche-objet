package fr.diginamic.essais;

import fr.diginamic.banque.entites.Cercle;
import fr.diginamic.utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cercle cercle1=new Cercle(10);
		Cercle cercle2=new Cercle(5);
		
		System.out.println("Le rayon =>"+cercle1.getRayon()+" Le perimetre => "+cercle1.getPerimetre()+" La surface =>"+cercle1.getSurface());
		System.out.println("Le rayon =>"+cercle2.getRayon()+ " Le perimetre => "+cercle2.getPerimetre()+" La surface =>"+cercle2.getSurface());
		
		Cercle nvxCercleFact= CercleFactory.getCercle(45);
		System.out.println("Le rayon =>"+nvxCercleFact.getRayon()+ " Le perimetre => "+nvxCercleFact.getPerimetre()+" La surface =>"+nvxCercleFact.getSurface());
	}

}
