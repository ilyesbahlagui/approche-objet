package fr.diginamic.maison;

public class Cuisine extends Piece {
	public Cuisine(double superficie,int nbEtage,String nomPiece) {
		super(superficie,nbEtage, nomPiece);
	}
	public String getType() {
		return "Cuisine";
	};
}
