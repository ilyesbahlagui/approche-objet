package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder builder = new StringBuilder();

		long debut = System.currentTimeMillis();
		// Code à chronométrer

		for (int i = 0; i < 100000; i++) {
			builder.append(i);
		}
		
		long fin = System.currentTimeMillis();
		System.out.println("Temps écoulé en millisecondes :" + (fin - debut));
		
		 debut = System.currentTimeMillis();
		// Code à chronométrer
		 String string="";
		for (int i = 0; i < 100000; i++) {
			string=string+String.valueOf(i);
		}
		
		 fin = System.currentTimeMillis();
		System.out.println("Temps écoulé en millisecondes :" + (fin - debut));
	}

}
