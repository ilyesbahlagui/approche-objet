package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personne oPers1=new Personne();
		Personne oPers2=new Personne();
		
		//Instance 1
		oPers1.nom="personne 1";
		oPers1.prenom="prenom 1";
		oPers1.adressePostale.numeroRue=12;
		oPers1.adressePostale.nomRue="Jupiter";
		oPers1.adressePostale.codePostal=30000;
		oPers1.adressePostale.ville="paris";
		//Instance 2
		oPers2.nom="personne 2";
		oPers2.prenom="prenom 2";
		oPers2.adressePostale.numeroRue=8;
		oPers2.adressePostale.nomRue="Mars";
		oPers2.adressePostale.codePostal=40000;
		oPers2.adressePostale.ville="Lille";

	}

}
