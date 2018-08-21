package com.capgemini.bean;

public class Merchants {

	private int id;
	private String name;
	private String type;
	private String Organisation;
	

	

	public Merchants(int id, String name, String type, String organisation) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		Organisation = organisation;
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

	public String getOrganisation() {
		return Organisation;
	}

	public void setOrganisation(String organisation) {
		Organisation = organisation;
	}


	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Merchants() {

	}
}
