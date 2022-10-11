package fr.diginamic.entites;

public class Theatre {
	private String nom;
	private int capaciterMax;
	private int totalInscrit;
	private double recetteTtalTheatre;
	
	
	public Theatre(String nom,int capaciterMax,int totalInscrit,double recetteTtalTheatre) {
		// TODO Auto-generated constructor stub
		this.capaciterMax=capaciterMax;
		this.nom=nom;
		this.recetteTtalTheatre=recetteTtalTheatre;
		this.totalInscrit=totalInscrit;
	}
	
	public void inscription(float prix,int totalInscrit) {
		if(totalInscrit>=this.capaciterMax) {
			System.out.println("Alerte on atteint la capacitée max !");
		}else {
			this.totalInscrit=totalInscrit;
			this.recetteTtalTheatre=totalInscrit*prix;
		}
	}
	
	
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the capaciterMax
	 */
	public int getCapaciterMax() {
		return capaciterMax;
	}
	/**
	 * @param capaciterMax the capaciterMax to set
	 */
	public void setCapaciterMax(int capaciterMax) {
		this.capaciterMax = capaciterMax;
	}
	/**
	 * @return the totalInscrit
	 */
	public int getTotalInscrit() {
		return totalInscrit;
	}
	/**
	 * @param totalInscrit the totalInscrit to set
	 */
	public void setTotalInscrit(int totalInscrit) {
		this.totalInscrit = totalInscrit;
	}
	/**
	 * @return the recetteTtalTheatre
	 */
	public double getRecetteTtalTheatre() {
		return recetteTtalTheatre;
	}
	/**
	 * @param recetteTtalTheatre the recetteTtalTheatre to set
	 */
	public void setRecetteTtalTheatre(double recetteTtalTheatre) {
		this.recetteTtalTheatre = recetteTtalTheatre;
	}
}
