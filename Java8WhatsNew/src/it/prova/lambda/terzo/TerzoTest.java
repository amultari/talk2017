package it.prova.lambda.terzo;

import java.util.List;
import java.util.function.Predicate;

import it.prova.lambda.Persona;

public class TerzoTest {

	public static void main(String[] args) {
		Predicate<Persona> lambdaUomini = personaInputIlCuiNomeLoDecidoIo -> personaInputIlCuiNomeLoDecidoIo
				.getSesso() != null && personaInputIlCuiNomeLoDecidoIo.getSesso().equals("M");
		Predicate<Persona> lambdaDonne = p -> p.getSesso() != null && p.getSesso().equals("F");
		Predicate<Persona> lambdaMaggiorenni = p -> p.getEta() >= 18;
		Predicate<Persona> lambdaConIniziale = p -> p.getNome() != null && p.getNome().startsWith("A");

		System.out.println("UOMINI....");
		List<Persona> uomini = FiltroPerPersone_3.personeFiltratePer(Persona.list(), lambdaUomini);
		stampa(uomini);

		System.out.println("DONNE....");
		List<Persona> donne = FiltroPerPersone_3.personeFiltratePer(Persona.list(), lambdaDonne);
		stampa(donne);

		System.out.println("MAGGIORENNI....");
		List<Persona> maggiorenni = FiltroPerPersone_3.personeFiltratePer(Persona.list(), lambdaMaggiorenni);
		stampa(maggiorenni);

		System.out.println("NOME CHE INIZIA PER A....");
		List<Persona> listaConIniziale = FiltroPerPersone_3.personeFiltratePer(Persona.list(), lambdaConIniziale);
		stampa(listaConIniziale);
		
		//ovviamente si può scrivere addirittura meno codice:
		System.out.println("MINORENNI....");
		List<Persona> minorenni = FiltroPerPersone_3.personeFiltratePer(Persona.list(),p -> p.getEta() < 18);
		stampa(minorenni);
		
		//ALTRO SU JAVA 8???
		//.stream()........
		//Date/Time API è stata spostata nel package java.time e segue le regole di Joda time. 

	}

	private static void stampa(List<Persona> input) {
		for (Persona personaItem : input) {
			System.out.println(personaItem);
		}
	}

}
