package fr.diginamic.testenumeration;


public class TestEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Saison [] saison=Saison.values();
		 Saison nom =Saison.ETE;
		for (Saison element : saison) {
//			System.out.println("Nom saison : "+element.getNom());
//			System.out.println(element);
			if(nom.equals(element)) {
				System.out.println("L'instance est : "+element+" Odre : "+element.getOrdre());
			}
		}
		
		Saison newSaison=Saison.getInstance("Ete");
		System.out.println("Le nom de la saison est "+newSaison.getNom());
		
	}

}
