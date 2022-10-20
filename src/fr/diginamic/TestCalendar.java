package fr.diginamic;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class TestCalendar {
	public static void main(String[] args) {
		
		Calendar calendar=Calendar.getInstance();
		calendar.set(2016,5,19,23,59,30);
		 SimpleDateFormat formateur=new SimpleDateFormat("dd/MM/yyyy");
	
		String strCal=formateur.format(calendar.getTime());
		System.out.println("Date custome : "+strCal);
		
		
		
		
		Calendar cal2=Calendar.getInstance();
		Date date=cal2.getTime();
		SimpleDateFormat formateur2=new SimpleDateFormat("dd/MM/yyyy HH:mm:s ");
		String strDate=formateur2.format(date);
		System.out.println("Date actuelle : "+strDate);
		
		
		
		System.out.println("Affichage des dates a l'etranger");
		//france
		SimpleDateFormat form= new SimpleDateFormat("EEEEE dd MMMMM yyyy  HH:mm:s", Locale.FRANCE);
		System.out.println(form.format(new Date()));
		//usa
		SimpleDateFormat formUsa= new SimpleDateFormat("EEEEE dd MMMMM yyyy  hh:mm:s", Locale.US);
		System.out.println(formUsa.format(new Date()));
		//Chine
		SimpleDateFormat formChine= new SimpleDateFormat("EEEEE dd MMMMM yyyy  HH:mm:s", Locale.CHINA);
		System.out.println(formChine.format(new Date()));
		//Russie
		SimpleDateFormat formRussie= new SimpleDateFormat("EEEEE dd MMMMM yyyy  HH:mm:s", new Locale("ru","RU"));
		System.out.println(formRussie.format(new Date()));
		
	}
}
