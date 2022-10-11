package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculMoyenne oCalculMoy=new CalculMoyenne(10);
//		ajoute un element au tableau
		oCalculMoy.addTab(50);
		oCalculMoy.addTab(4);
		oCalculMoy.addTab(20);
		oCalculMoy.addTab(11);
		oCalculMoy.printTab();
		System.out.println("Moyenne "+oCalculMoy.getMoyenne());		
	}

}
