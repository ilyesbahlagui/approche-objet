package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Personne oPers1=new Personne("toto","tata");
		oPers1.setAdresse(new AdressePostale("Nimes", "rue Moscou", 12, 50555));
		
		Personne oPers2=new Personne("MAMAN","test");
		oPers2.setAdresse(new AdressePostale("Paris", " rue Jean jaures", 14, 22550));
		oPers2.getAdresse().getNomRue();
		
		System.out.println(oPers1.adressePostale.numeroRue+" "+oPers1.adressePostale.nomRue+" "+oPers1.adressePostale.codePostal+" "+oPers1.adressePostale.ville);
		System.out.println(oPers2.adressePostale.numeroRue+" "+oPers2.adressePostale.nomRue+" "+oPers2.adressePostale.codePostal+" "+oPers2.adressePostale.ville);

		System.out.println("J'affiche le nom de la rue de l'objet 2 "+oPers2.getAdresse().getNomRue());
		


	}

}
