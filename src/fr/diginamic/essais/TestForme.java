package fr.diginamic.essais;

import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Forme;
import fr.diginamic.formes.Rectangle;

public class TestForme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carre oCarre=new Carre(5,50, 10);
		Rectangle oRectangle=new Rectangle(14,20);
		Cercle oCercle=new Cercle(5);
		
		AffichageForme oAfficheForme=new AffichageForme();
		
		oAfficheForme.afficher(oCarre);
		oAfficheForme.afficher(oRectangle);
		oAfficheForme.afficher(oCercle);
}

}
