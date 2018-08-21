package com.capgemini.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Products {
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="p_name")
	private String name;
	
	@Column(name="p_model")
	private String model;
	
	@Column(name="p_price")
	private String price;
	
	/*@Column(name="m_id")
	private String m_id;*/

	public Products(int id, String name, String model, String price) {
		super();
		this.id = id;
		this.name = name;
		this.model = model;
		this.price = price;
	}

	public Products() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
}
