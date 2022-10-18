package fr.diginamic.recensement;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Recensement {

	private Path pathFile;
	private List<Ville> ville = new ArrayList<Ville>();
	
	
	public Recensement() throws IOException {
		this.getListVille();
	}

	public void getListVille() throws IOException {

		this.pathFile = Paths.get("C:\\work-space-java\\approche-objet\\src\\files\\recensement.csv");
		List<String> lines = Files.readAllLines(pathFile, StandardCharsets.UTF_8);

		for (int i = 1; i < lines.size(); i++) {
			String[] lineVille = lines.get(i).split(";");

			String codePostale = lineVille[2];
			int population = Integer.valueOf(lineVille[9].trim().replaceAll(" ", ""));
			int codeRegion = Integer.valueOf(lineVille[0]);
			int codeCommune = Integer.valueOf(lineVille[5]);
			String nomRegion = lineVille[1];
			String nomCommune = lineVille[6];
			Ville v = new Ville(nomCommune, nomRegion, codeCommune, codePostale, codeRegion, population);
			this.ville.add(v);

		}

	}

	public Path getPathFile() {
		return pathFile;
	}

	public void setPathFile(Path pathFile) {
		this.pathFile = pathFile;
	}

	public List<Ville> getVille() {
		return ville;
	}

	public void setVille(List<Ville> ville) {
		this.ville = ville;
	}

}
