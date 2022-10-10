package fr.diginamic.banque;

import java.util.Iterator;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

public class TestOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Credit oCredit = new Credit(15, "2018");
		System.out.println(oCredit.toString());
		Operation [] tab=new Operation[4];
		tab[0]=new Credit(15, "2018");
		tab[1]=new Credit(12, "2019");
		tab[2]=new Debit(17, "2022");
		tab[3]=new Debit(9, "2021");
		for(int i=0;i<tab.length;i++) {
			System.out.println(tab[i].toString());
		}
	}

}
