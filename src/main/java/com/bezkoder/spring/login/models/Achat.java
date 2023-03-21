package com.bezkoder.spring.login.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity  
@Table 
public class Achat {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column 
	private int id;  
	@Column   
	private float quantity; 
	
	@Column  
	private float price;

	@Column  
	private int tax;

	@Column  
	private float discount;
	

	@ManyToOne(optional=false)
	@JoinColumn(name="idfacture")
	private Facture facture ; 

	@OneToOne(optional=false)
	@JoinColumn(name="idproduit")
	private Produit produit;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getQuantity() {
		return quantity;
	}
	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}
	
	public Facture getfacture() {
		return facture;
	}
	public void setfacture(Facture facture) {
		this.facture = facture;
	}
	
	
	
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	public float getDiscount() {
		return discount;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
	}
	public Produit getProduct() {
		return produit;
	}
	public void setProduct(Produit product) {
		this.produit = product;
	}
	@Override
	public String toString() {
		return "Sale [id=" + id + ", quantity=" + quantity + ", price=" + price + ", tax=" + tax + ", discount="
				+ discount + ", facture=" + facture + ", product=" + produit + "]";
	}

	
	


}
