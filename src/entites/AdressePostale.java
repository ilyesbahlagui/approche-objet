package entites;

public class AdressePostale {
	 int numeroRue;
	 String nomRue;
	 int codePostal;
	 String ville;
	//constructeur
	AdressePostale(String nomRue,String ville, int codePostal,int numeroRue){
		this.nomRue=nomRue;
		this.ville=ville;
		this.codePostal=codePostal;
		this.numeroRue=numeroRue;
	}
	
	
}
