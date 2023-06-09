package com.bezkoder.spring.login.models;


import javax.persistence.CascadeType;
import javax.persistence.Column;  
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;
  

//mark class as an Entity   
@Entity  
//defining class name as Table name  
@Table 
//Defining book id as primary key 

public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column  
	private int id;
	@Column  
	private String nameClient;  

	@Column  
	private String email;



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameClient() {
		return nameClient;
	}

	public void setNameClient(String nameClient) {
		this.nameClient = nameClient;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", nameClient=" + nameClient + ", email=" + email + "]";
	}

	
	
	
	
}
