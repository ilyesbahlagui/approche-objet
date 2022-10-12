package fr.diginamic.essais;

import javax.swing.text.AbstractDocument.LeafElement;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salarie oSalarie = new Salarie("tata", "toto", 1500);
		oSalarie.afficheDonnees();

		Pigiste oPigiste = new Pigiste("pablo", "escobar", 15, 30);

		oPigiste.afficheDonnees();

	}

}
