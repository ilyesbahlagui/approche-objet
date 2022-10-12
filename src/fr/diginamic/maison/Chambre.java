package fr.diginamic.maison;

public class Chambre extends Piece {
	public Chambre(double superficie,int nbEtage,String nomPiece) {
		super(superficie,nbEtage,nomPiece);
	}
	
	public String getType() {
		return "Chambre";
	};
}
