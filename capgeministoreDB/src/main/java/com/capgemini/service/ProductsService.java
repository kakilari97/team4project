package com.capgemini.service;

import java.util.Optional;

import com.capgemini.bean.Products;

public interface ProductsService {
public void addProduct(int id,String name,String model,String price);
	
	public void deleteProductById(int id);
	
	public Optional<Products> getProductsById(int id);

	public Iterable<Products> findAll();
}
