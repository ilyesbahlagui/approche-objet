package fr.diginamic.maison;

public class SalleDeBain extends Piece{
	public SalleDeBain(double superficie,int nbEtage,String nomPiece) {
		super(superficie,nbEtage, nomPiece);
	}
	public String getType() {
		return "SalleDeBain";
	}
}
