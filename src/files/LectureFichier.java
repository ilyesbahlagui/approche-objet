package files;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LectureFichier {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ArrayList<Ville> ville=new ArrayList<Ville>();
		//element du nouveau fichier
		List<String> newVille=new ArrayList<String>();		
		
		Path pathFile=Paths.get("C:\\work-space-java\\approche-objet\\src\\files\\recensement.csv");
		List<String> lines= Files.readAllLines(pathFile, StandardCharsets.UTF_8);
//		System.out.println(lines);
		

		for (int i = 1; i < lines.size(); i++) {
			String [] lineVille  = lines.get(i).split(";");
				
				int codePostale=Integer.valueOf(lineVille[0]);
				int popullation=Integer.valueOf(lineVille[9].trim().replaceAll(" ", ""));
				Ville v=new Ville(lineVille[6],popullation,lineVille[1],codePostale);
				ville.add(v);
				
				if(v.getNbHabitant()>25000) {
					newVille.add(lines.get(i));
				}
			
		}
		
//		for (Ville element : ville) {
//			System.out.println(element);
//		}
System.out.println(newVille.size());
		Path pathCible= Paths.get("C:\\work-space-java\\approche-objet\\src\\files\\ville.txt");
		Files.write(pathCible, newVille);
	
	
	}

}
