package tn.crm.pfe.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bezkoder.spring.login.models.Produit;
import com.bezkoder.spring.login.repository.ProduitRepository;

@Service
public class ProduitService {

	@Autowired
	ProduitRepository cR;
	// getting all articles record by using the method findaAll() of CrudRepository

	// getting all articles record by using the method findaAll() of CrudRepository
	public List<Produit> getAllProduits() {
		List<Produit> produits = new ArrayList<Produit>();
		cR.findAll().forEach(c -> produits.add(c));
		return produits;
	}

	// getting a specific record by using the method findById() of CrudRepository
	public Produit getProduitsById(int id) {
		return cR.findById(id).get();
	}

	// saving a specific record by using the method save() of CrudRepository
	public void saveOrUpdate(Produit c) {
		cR.save(c);
	}

	// deleting a specific record by using the method deleteById() of CrudRepository
	public void delete(int id) {
		cR.deleteById(id);
	}

}
