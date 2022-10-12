package fr.diginamic.essais;

import fr.diginamic.maison.Maison;
import fr.diginamic.maison.SalleDeBain;
import fr.diginamic.maison.Wc;
import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.Salon;


public class TestMaison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Maison oMaison=new Maison(new SalleDeBain(15,0, "SALLE DE BAIN"));
		oMaison.ajouterPiece(new Salon(2, 1, "SALON"));
		oMaison.ajouterPiece(new Wc(9, 1, "WC"));
		oMaison.ajouterPiece(new Cuisine(45, 2, "CUISINE"));
		oMaison.ajouterPiece(new Chambre(4, 0, "CHAMBRE"));
		oMaison.ajouterPiece(new Chambre(4, 0, "CHAMBRE"));
		oMaison.ajouterPiece(new Chambre(4, 0, "CHAMBRE"));
		oMaison.ajouterPiece(new Chambre(0, 0, "test"));
	
		
//		System.out.println("Surface globale de la piece "+oMaison.surfaceGlobalTypePiece("Chambre"));
		System.out.println("\n\n Type piece "+oMaison.surfaceGlobalTypePiece("Cuisine"));
		System.out.println("\n\n Nb Type piece "+oMaison.nombreTypePiece("Salon"));
		
	}

}
