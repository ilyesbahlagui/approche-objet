package listes;

public class TestEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ville ville1 = new Ville("Paris", 12);
		Ville ville2 = new Ville("Paris", 1);
//		boolean b=ville1.getNom().equals(ville2.getNom());
//		System.out.println(b);
		boolean b = true;
		if (ville1.getNom() == ville2.getNom()) {
			b = true;
		} else {
			b = false;
		}
	
		System.out.println(b);
	}

}
