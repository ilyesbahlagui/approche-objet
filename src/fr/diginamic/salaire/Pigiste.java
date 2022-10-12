package fr.diginamic.salaire;

public class Pigiste extends Intervenant{
	private int nbJourTaff;
	private double montantJournalier;
	public Pigiste(String nom, String prenom, int nbJourTaff, double montantJournalier) {
		super(nom, prenom);
		this.nbJourTaff = nbJourTaff;
		this.montantJournalier = montantJournalier;
	}
	
	public double getSalaire() {
		return this.nbJourTaff*this.montantJournalier;
	}
	
	public void afficheDonnees() {
		System.out.println("Le Pigiste : "+ this.getNom()+" "+this.getPrenom()+" salaire "+this.getSalaire()+" type Pigiste");
	}
	
	public int getNbJourTaff() {
		return nbJourTaff;
	}
	public void setNbJourTaff(int nbJourTaff) {
		this.nbJourTaff = nbJourTaff;
	}
	public double getMontantJournalier() {
		return montantJournalier;
	}
	public void setMontantJournalier(double montantJournalier) {
		this.montantJournalier = montantJournalier;
	}
	
	
}
