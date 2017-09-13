package it.prova.filechangenotification;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchEvent.Kind;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

public class FileChangeModification {

	public static void main(String[] args) throws Exception {
		System.out.println("Inizio monitoring....");
		
		Path path = Paths.get("d:\\temp");

		// si crea un oggetto WatchService
		WatchService watchService = FileSystems.getDefault().newWatchService();

		// si indica al Service di rimanere in ascolto su un path sulle
		// operazioni volute (modifica, cancellaz.,ecc.)
		path.register(watchService, StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_DELETE,
				StandardWatchEventKinds.ENTRY_MODIFY);

		// si avvia usando l'oggetto WhatchKey come accumulatore di eventi
		WatchKey key = null;
		while (true) {

			// ecco il run vero e proprio
			key = watchService.take();

			for (WatchEvent<?> event : key.pollEvents()) {
				Kind<?> kind = event.kind();
				System.out.println("Event on " + event.context().toString() + " is " + kind);
			}

			boolean reset = key.reset();
			if (!reset)
				break;

		}
	}
}
