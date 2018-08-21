package com.capgemini.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.bean.Products;
import com.capgemini.repo.ProductsRepo;

@Service
public class ProductsServiceImpl implements ProductsService {

	@Autowired
	private ProductsRepo repo1;

	@Override
	public void addProduct(int id, String name, String model, String price) {
		Products p = new Products();
		p.setId(id);
		p.setName(name);
		p.setModel(model);
		p.setPrice(price);
		repo1.save(p);

	}

	@Override
	public void deleteProductById(int id) {
		repo1.deleteById(id);

	}

	@Override
	public Optional<Products> getProductsById(int id) {
		return repo1.findById(id);
	}

	@Override
	public Iterable<Products> findAll() {

		return repo1.findAll();
	}

}
