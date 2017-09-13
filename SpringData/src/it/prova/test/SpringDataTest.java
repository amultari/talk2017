package it.prova.test;

import it.prova.model.Product;
import it.prova.service.MyServiceFactory;
import it.prova.service.ProductService;

public class SpringDataTest {

	public static void main(String[] args) {

		ProductService productService = MyServiceFactory
				.getProductServiceInstance();

		// facciamo pulizia
		productService.removeAll();

		// facciamo qualche inserimento
		productService.add(new Product("Prodotto A", 150));
		productService.add(new Product("Prodotto B", 200));

		System.out.println("listAll: " + productService.list());

		// cerchiamo per nome
		System.out.println("Per nome...");
		System.out.println(productService.findByName("Prodotto A"));

		// cerchiamo per nome che inizia per Prod
		System.out.println("Per nome che inizia con...");
		System.out.println(productService.findByNameCheIniziaCon("Prod"));

		// cerchiamo per prezzo maggiore di 160
		System.out.println("Per prezzo maggiore di...");
		System.out.println(productService.findByPrezzoMaggioreDi(160));

		// cerchiamo per nome e prezzo
		System.out.println("Per nome e prezzo...");
		System.out.println(productService.findByNomeEPrezzo("Prodotto B", 200));
		
		//per ordine inverso
		System.out.println("Per ordine inverso...");
		System.out.println(productService.elencaPerOrdineInverso());

	}

}
