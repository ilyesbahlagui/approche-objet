package fr.diginamic.maison;

public abstract class Piece {
	private double superficie;
	private int numEtage;
	private String nomPiece;
	
	public Piece(double superficie, int numEtage,String nomPiece) {
		
		this.superficie = superficie;
		this.numEtage = numEtage;
		this.nomPiece=nomPiece;
	}
	
	public abstract String getType();
	
	public double getSuperficie() {
		return superficie;
	}
	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}
	public int getNumEtage() {
		return numEtage;
	}
	public void setNumEtage(int numEtage) {
		this.numEtage = numEtage;
	}


	public String getNomPiece() {
		return nomPiece;
	}


	public void setNomPiece(String nomPiece) {
		this.nomPiece = nomPiece;
	}
	
	
}
