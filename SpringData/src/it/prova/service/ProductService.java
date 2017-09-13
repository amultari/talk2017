package it.prova.service;

import it.prova.model.Product;
import it.prova.repository.ProductRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public List<Product> list(){
		return repository.findAll();
	}
	
	public Product findByName(String name){
		return repository.findByName(name);
	}
	
	public void removeAll(){
		repository.deleteAll();
	}
	
	public void add(Product productInstance){
		repository.save(productInstance);
	}
	
	public List<Product> findByNameCheIniziaCon(String token){
		return repository.findByNameStartsWith(token);
	}
	
	public List<Product> findByPrezzoMaggioreDi(int princeInput){
		return repository.findByPriceGreaterThan(princeInput);
	}
	
	public List<Product> findByNomeEPrezzo(String nome,int price){
		return repository.findByNameAndPrice(nome, price);
	}
	
	public List<Product> elencaPerOrdineInverso(){
		return repository.findAllByOrderByNameDesc();
	}

}
