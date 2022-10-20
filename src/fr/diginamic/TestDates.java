package fr.diginamic;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TestDates {
	public static void main(String[] args) {
		
		
		
		Date date= new Date();
		System.out.println(date);
		SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy");
		String stringDate=formateur.format(date);
		System.out.println("Date formatée : "+stringDate);
		
		
		Calendar calendar=Calendar.getInstance();
		calendar.set(2016,5,19,23,59,30);
		java.util.Date date2= calendar.getTime();
		SimpleDateFormat formateur2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:s");
		stringDate=formateur2.format(date2);
		System.out.println("Date modifiée : "+stringDate);
		
		stringDate=formateur2.format(date);
		System.out.println("Date formatée : "+stringDate);
		
//		Date date1=new Date(0);
//		Calendar cal= Calendar.getInstance();cal.set(2020, 6, 7, 19, 30, 56);
		
		
	}
}
