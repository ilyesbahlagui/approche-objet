package fr.diginamic.testenumeration;

import java.util.ArrayList;
import java.util.Arrays;

import listes.Ville;

public class TestContinentAvecEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Ville> villes=new ArrayList<Ville>(Arrays.asList(
				new Ville("New York", 1111,Continent.AMERIQUE),
				new Ville("Paris", 222,Continent.EUROPE),
				new Ville("Pékin", 1111,Continent.ASIE),
				new Ville("Moscou", 1111,Continent.ASIE),
				new Ville("Berlin", 1111,Continent.EUROPE),
				new Ville("Sydney", 1111,Continent.OCEANIE),
				new Ville("Sao Paulo", 1111,Continent.AMERIQUE),
				new Ville("Dakar", 1111,Continent.AFRIQUE)));
		
		for (Ville element : villes) {
			System.out.println(element);
		}
	}

}
