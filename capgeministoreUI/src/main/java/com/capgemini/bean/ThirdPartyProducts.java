package com.capgemini.bean;

public class ThirdPartyProducts {

	private int id;
	private String name;
	private String model;
	private String price;
	private String m_id;

	public ThirdPartyProducts(int id, String name, String model, String price) {
		super();
		this.id = id;
		this.name = name;
		this.model = model;
		this.price = price;
	}

	public ThirdPartyProducts() {

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