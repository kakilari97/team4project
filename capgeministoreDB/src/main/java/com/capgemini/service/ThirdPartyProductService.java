package com.capgemini.service;

import java.util.Optional;

import com.capgemini.bean.ThirdPartyProducts;

public interface ThirdPartyProductService {

	public void addThirdPartyProduct(int id,String name,String model,String price);
	
	public void deleteThirdPartyProductById(int id);
	
	public Optional<ThirdPartyProducts> getThirdPartyProductsById(int id);

	public Iterable<ThirdPartyProducts> findAll();
}
