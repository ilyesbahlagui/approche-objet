package fr.diginamic.operations;

public class CalculMoyenne {
	private double [] tab=new double[1];
	
	public CalculMoyenne(double x) {
		this.tab[0]=x;
	}

	
	public void addTab(double x) {
		double [] newtab=new double [this.tab.length+1];
		for(int i=0;i<this.tab.length;i++) {
			newtab[i]=tab[i];
		}
		newtab[newtab.length-1]=x;
		this.tab=newtab;
	}
	
	public double getMoyenne() {
		double somme=0;
		for(int i=0;i<this.tab.length;i++) {
			somme=somme+this.tab[i];
		}
		return somme=somme/tab.length;
	}
	
	
	public void printTab() {
		for(int i=0;i<this.tab.length;i++) {
			 System.out.println(this.tab[i]);
		}
	}
	/**
	 * @return the tab
	 */
	public double[] getTab() {
		return tab;
	}

	/**
	 * @param tab the tab to set
	 */
	public void setTab(double[] tab) {
		this.tab = tab;
	}
	
	
}
