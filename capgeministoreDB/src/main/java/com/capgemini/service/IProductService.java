package com.capgemini.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import com.capgemini.bean.Product;

public interface IProductService {

	//public Iterable<Product> getAllProducts();

	public List<Product> getAllProducts();
	public Optional<Product> getProduct(int p_id);
	
	public void addProduct(  int p_id,String  p_name,String p_companyname,double p_price,String  p_dom,String  p_type, String   p_merchantid,String  p_couponid,String p_quantity);

	public void deleteProduct( int p_id);

	
}
