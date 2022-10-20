package fr.diginamic.recensement;



public abstract class MenuService {
	public abstract void traiter(Recensement recensement);
	public abstract void getPopulation(Recensement recensement, String choix);
	public abstract void getTop10Ville(Recensement recensement, String choix);
}
