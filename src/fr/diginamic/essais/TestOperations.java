package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operations oCalcule = new Operations(0, 0, '+');

		// multiplication
		System.out.println(oCalcule.getCalcule(4, 10, '*'));
		// addition
		System.out.println(oCalcule.getCalcule(10, 10, '+'));
		// soustraction
		System.out.println(oCalcule.getCalcule(80, 20, '-'));
		// division
		System.out.println(oCalcule.getCalcule(8, 2, '/'));

	}

}
