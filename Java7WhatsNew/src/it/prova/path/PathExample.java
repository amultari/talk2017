package it.prova.path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//il package java.nio.file contiene classi e interfacce come ad esempio
//Path, Paths, FileSystem, FileSystems
//Un Path in pratica è un riferimento ad un percorso, l'equivalente di java.io.File 
//ma con più funzionalità
public class PathExample {

	public static void main(String[] args) {
		Path path = Paths.get("d:\\temp\\prova.txt");
		System.out.println("Number of Nodes:" + path.getNameCount());
		System.out.println("File Name:" + path.getFileName());
		System.out.println("File Root:" + path.getRoot());
		System.out.println("File Parent:" + path.getParent());

		// per le operazioni classiche sui file si usa la classe Files
		Path path2 = Paths.get("d:\\temp\\prova2.txt");
		try {
			if (!Files.exists(path2)) {
				Files.createFile(path2);
			}
			// Files.deleteIfExists(path2);
			// esistono anche Files.copy(..) and Files.move(..)
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
