package it.prova.diamond;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class DiamondOperator {
	
	public void showUseJava6And7(){
		//JAVA 6 
		//I GENERCIS VANNO DICHIARATI SIA IN DICHIARAZIONE CHE ASSEGNAZIONE
		List<Automobile> automobili = new ArrayList<Automobile>();
		Map<String, List<Automobile>> trades = new TreeMap<String, List<Automobile>> ();
		
		//JAVA 7 
		List<Automobile> automobiliJava7 = new ArrayList<>();
		Map<String, List<Automobile>> tradesJava7 = new TreeMap <> ();
	}

}
