package fr.diginamic.maison;

public class Maison {

	private Piece[] oTabPieces = new Piece[1];

	public Maison(Piece oPieces) {
		this.oTabPieces[0] = oPieces;
		System.out.println("La " + oPieces.getNomPiece() + " a bien été ajouté dans la maison");
	}

	// Methode Ajout Piece avec les objets qui contient les infos de chaque piece

	public void ajouterPiece(Piece oPieces) {
	
		if (oPieces == null) {
			System.out.println("Veuillez renseigner une piece");
		} else {
			if ((oPieces.getNumEtage() >= 0 && oPieces.getSuperficie() > 0)) {
				Piece[] newPiece = new Piece[this.oTabPieces.length + 1];
				for (int i = 0; i < this.oTabPieces.length; i++) {
					newPiece[i] = this.oTabPieces[i];
				}
				newPiece[newPiece.length - 1] = oPieces;

				this.oTabPieces = newPiece;
				System.out.println("La " + oPieces.getNomPiece() + " a bien été ajouté dans la maison");
			} else {
				System.out.println("on peut pas mettre une surface egale a zero ou une piece null ");
				System.out.println(
						"Il y a une erreur lors de l'ajout veuillez verifier les informations suivantes : Etage => "
								+ oPieces.getNumEtage() + " Superficie => " + oPieces.getSuperficie());
			}
		}

	}
	//Retourne la surface globale selon le type de piece 
	
	public double surfaceGlobalTypePiece(String TypePiece) {
		
		double superficieTotal = 0;
		for (int i = 0; i < this.oTabPieces.length; i++) {
//			System.out.println(this.oTabPieces[i]);
			
			if( this.oTabPieces[i].getType() .equals(TypePiece) ) {
				superficieTotal = superficieTotal + this.oTabPieces[i].getSuperficie();
			}
		}
		return superficieTotal;
	}
	
	//Retourne la surface globale selon le type de piece 
	
	public int nombreTypePiece(String TypePiece) {
		int nbPiece = 0;
		for (int i = 0; i < this.oTabPieces.length; i++) {
			if( this.oTabPieces[i].getType() .equals(TypePiece) ) {
				nbPiece++;
			}
		}
		return nbPiece;
	}
	

//Calcule surface maison
	public double superficieMaison() {
		double superficieTotal = 1;
		for (int i = 0; i < this.oTabPieces.length; i++) {
			superficieTotal = superficieTotal * this.oTabPieces[i].getSuperficie();
		}
		return superficieTotal;
	}

//Calcule surface par etage 
	public double superficieEtage(int numEtage) {
		double superficieEtage = 1;
		for (int i = 0; i < this.oTabPieces.length; i++) {
			if (this.oTabPieces[i].getNumEtage() == numEtage) {
				superficieEtage = superficieEtage * this.oTabPieces[i].getSuperficie();
			}

		}
		// si l'etage n'existe pas renvoi 0
		if (superficieEtage == 1) {
			superficieEtage = 0;
		}
		return superficieEtage;
	}

}
