package it.prova.switchforstrings;

public class SwitchForStrings {

	public void showUseJava6(String language) {
		// JAVA 6: lo switch si poteva usare solo per tipi primitivi.
		// Nel caso di String:

		if (language.equalsIgnoreCase("java")) {
			// .....
		} else if (language.equalsIgnoreCase("python")) {
			// .....
		} else if (language.equalsIgnoreCase("php")) {
			// .....
		} else if (language.equalsIgnoreCase("C#")) {
			// .....
		} else {
			// .....
		}

	}

	public void showUseJava7(String language) {

		switch (language) {
		case "java":
			// ..
			break;
		case "python":
			// ..
			break;
		case "php":
			// ..
			break;
		case "C#":
			// ..
			break;

		default:
			// ..
			break;
		}

	}

}
