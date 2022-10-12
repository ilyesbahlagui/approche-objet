package fr.diginamic.maison;

public class Salon extends Piece{
	public Salon(double superficie,int nbEtage,String nomPiece) {
		super(superficie,nbEtage, nomPiece);
	}
	public String getType() {
		return "Salon";
	}
}
