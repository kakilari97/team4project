package com.capgemini.bean;

public class ThirdPartyMerchants {



    private int id;

	private String name;
	
	
	private String type;
	
	private String organisation;
	
	

	public ThirdPartyMerchants(int id, String name, String type, String organisation) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.organisation = organisation;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getOrganisation() {
		return organisation;
	}

	public void setOrganisation(String organisation) {
		this.organisation = organisation;
	}
	public  ThirdPartyMerchants()
	{
		
	}
	
}
