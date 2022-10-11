package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Theatre oTheatre=new Theatre("Comedi", 500, 400, 99999);
		oTheatre.inscription(15, 500);
		System.out.println(oTheatre.getCapaciterMax());
		System.out.println(oTheatre.getTotalInscrit());
		System.out.println(oTheatre.getRecetteTtalTheatre());
	}

}
