package files;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CreerFichier {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path pathFile=Paths.get("C:\\work-space-java\\approche-objet\\src\\files\\recensement.csv");
		List<String> lines= Files.readAllLines(pathFile, StandardCharsets.UTF_8);
		
		List<String> newFile= new ArrayList<String>();
		
		for (int i = 0; i < 100; i++) {
			newFile.add(lines.get(i)+"\n");
		}
		
		System.out.println(newFile.size());
//		System.out.println(newFile);
		
		Path pathCible= Paths.get("C:\\work-space-java\\approche-objet\\src\\files\\monFichier.txt");
		Files.write(pathCible, newFile);
		
		
		
		List<String> lines2= Files.readAllLines(pathCible, StandardCharsets.UTF_8);
		System.out.println(lines2);

}

}
