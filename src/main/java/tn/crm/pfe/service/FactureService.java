package tn.crm.pfe.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bezkoder.spring.login.models.Facture;
import com.bezkoder.spring.login.repository.FactureRepository;



@Service 
public class FactureService {

	@Autowired  
	FactureRepository FactureRepository;  
	//getting all books record by using the method findaAll() of CrudRepository  

	//getting all books record by using the method findaAll() of CrudRepository  
	public List<Facture> getAllFacture()   
	{  
		List<Facture> Facture = new ArrayList<Facture>();  
		FactureRepository.findAll().forEach(Facture1 -> Facture.add(Facture1));  
		return Facture;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Facture getFactureById(int id)   
	{  
		return FactureRepository.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Facture Facture)   
	{  
		FactureRepository.save(Facture);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		FactureRepository.deleteById(id);  
	} 

	//updating a record  
	public void update(	Facture Facture, int id)   
	{  
		FactureRepository.save( Facture);  
	}  


}



