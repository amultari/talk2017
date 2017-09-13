package it.prova.repository;

import it.prova.model.Product;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductRepository extends JpaRepository< Product, Long >{
	
	//la query viene costruita in automatico!!!
	Product findByName( String name );
	
	
	//Anche questa!!!
	List<Product> findByPriceGreaterThan(int princeInput);
	
	//Combinazione di campi!!! (Come i dynamic finders)
	List<Product> findByNameAndPrice(String nome,int price);
	//Order by!!!!
	List<Product> findAllByOrderByNameDesc();
	
	//se ho necessità particolari
	@Query("from Product p where p.name like ?1%")
	List<Product> findByNameStartsWith(String token);
	
	
	//E TAAAAAANTO ANCORA!!!

}
