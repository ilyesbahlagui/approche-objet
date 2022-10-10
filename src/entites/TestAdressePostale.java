package entites;

public class TestAdressePostale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdressePostale oAdr1=new AdressePostale("toto","Nimes",30900,3);
		AdressePostale oAdr2=new AdressePostale("tata","Paris",75000,15);
		
		
		System.out.println(oAdr1.numeroRue+" "+oAdr1.nomRue+" "+oAdr1.codePostal+" "+oAdr1.ville);
		System.out.println(oAdr2.numeroRue+" "+oAdr2.nomRue+" "+oAdr2.codePostal+" "+oAdr2.ville);
//		INSTANCE 1
		//oAdr1.numeroRue=2;
		//oAdr1.nomRue="Toto";
		//oAdr1.codePostal=30900;
		//oAdr1.ville="nimes";
//		INSTANCE 2
		//oAdr2.numeroRue=5;
		//oAdr2.nomRue="TATA";
		//oAdr2.codePostal=30900;
		//oAdr2.ville="MTP";
	}

}
