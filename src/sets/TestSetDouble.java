package sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;




public class TestSetDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Double> liste = new HashSet<Double>(Arrays.asList(1.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01));
		double max=0;
		double min=0;
		int iPosition=0;
		int indexSup=0;
		
		
		System.out.println("Set de depart :");
		for(Double element: liste) {
			System.out.println(element);
		}
		
		
		Iterator<Double> iterator = liste.iterator();
		while (iterator.hasNext()) {
		
			double value=iterator.next();
			
			if (max<value) {
				max=value;
			}
			if(min>value) {
				min=value;
		
			}
			
			
		}
		
		//y a pas d'index mais du haschage donc on donne la valeur ou on suprime dans le while
		liste.remove(min);
		System.out.println("Max :"+max+" Min : "+min);
		System.out.println("Set final :");
		for(Double element: liste) {
			System.out.println(element);
		}
		
		
		
	}

}
