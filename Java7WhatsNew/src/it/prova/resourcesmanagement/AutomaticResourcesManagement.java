package it.prova.resourcesmanagement;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class AutomaticResourcesManagement {

	// Le risorse come Connections, Files, Input/OutStreams, etc.
	// richiedono una chiusura manuale dopo il loro utilizzo tramite blocchi
	// try-finally

	public void showUseJava6() {

		// dichiariamo le risorse da usare (qui altrimenti lo scope del try...)
		FileOutputStream fos = null;
		DataOutputStream dos = null;

		try {
			fos = new FileOutputStream("movies.txt");
			dos = new DataOutputStream(fos);
			dos.writeUTF("Ghostbusters...");
		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				fos.close();

				dos.close();

			} catch (IOException e) {

				// log the exception

			}

		}
	}

	public void showUseJava7() {

		try (FileOutputStream fos = new FileOutputStream("movies.txt");

				DataOutputStream dos = new DataOutputStream(fos)) {

			dos.writeUTF("Ghostbusters...");

		} catch (IOException e) {

			// log the exception

		}
	}
	
	//MAGIA???? NO java.lang.AutoCloseable che è il parent di Closeable

}
