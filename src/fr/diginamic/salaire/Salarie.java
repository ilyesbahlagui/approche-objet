package fr.diginamic.salaire;

public class Salarie extends Intervenant {
		
	private double salaireMensuel;
	

	public Salarie(String nom, String prenom, double salaireMensuel) {
		super(nom, prenom);
		this.salaireMensuel = salaireMensuel;
	}

	public double getSalaire() {
		return this.salaireMensuel;
	}
	
	public void afficheDonnees() {
		System.out.println("Salarie "+this.getNom()+" "+this.getPrenom()+" salaire : "+this.getSalaire()+" type CDD/CDI");
	}
	
	public double getSalaireMensuel() {
		return salaireMensuel;
	}

	public void setSalaireMensuel(double salaireMensuel) {
		this.salaireMensuel = salaireMensuel;
	}
	
	
	
}
