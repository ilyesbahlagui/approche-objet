package fr.diginamic.recensement;

import java.util.Scanner;

public abstract class MenuService {
	public abstract void traiter(Recensement recensement);
	public abstract void getPopulation(Recensement recensement, String choix);
}
