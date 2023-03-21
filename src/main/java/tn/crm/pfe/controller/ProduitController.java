package tn.crm.pfe.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bezkoder.spring.login.models.Produit;

import tn.crm.pfe.service.ProduitService;



@RestController
@CrossOrigin(origins = "*")

public class ProduitController {

	//Attire the ArticlesService class  
	@Autowired  
	ProduitService cs;  

	//creating a get mapping that retrieves all the books detail from the database   
	@GetMapping("/Product")

	private List<Produit> getAllProduits()   
	{  
		return cs.getAllProduits();
	}  

	//creating a get mapping that retrieves the detail of a specific book  
	@GetMapping("/Product/{id}")  
	private Produit getProducts(@PathVariable("id") int id)   
	{  
		return cs.getProduitsById(id)  ;
	}  


	//creating a delete mapping that deletes a specified book  
	@DeleteMapping("/Product/{id}")  
	private void deleteProduct(@PathVariable("id") int id)   
	{  
		cs.delete(id);  
	} 

	@PostMapping("/Product")  
	private int saveProduct(@RequestBody Produit c)   
	{  
		cs.saveOrUpdate(c);  
		return c.getId();  
	} 

	//creating put mapping that updates the book detail
	//@CrossOrigin(origins = "*")
	@PutMapping("/Product")  
	private Produit update(@RequestBody  Produit c)   
	{  
		cs.saveOrUpdate(c);  
		return c;  
	}  
}