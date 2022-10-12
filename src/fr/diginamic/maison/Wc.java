package fr.diginamic.maison;

public class Wc extends Piece{
	public Wc(double superficie,int nbEtage,String nomPiece) {
		super(superficie,nbEtage, nomPiece);
	}
	
	public String getType() {
		return "Wc";
	}
}