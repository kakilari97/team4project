package com.capgemini.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.bean.ThirdPartyProducts;
import com.capgemini.repo.ThirdPartyProductRepo;

@Service
public class ThirdPartyProductServiceImpl implements ThirdPartyProductService {
	@Autowired
	private ThirdPartyProductRepo repo4;

	@Override
	public void addThirdPartyProduct(int id, String name, String model, String price) {
		ThirdPartyProducts p2 = new ThirdPartyProducts();
		p2.setId(id);
		p2.setName(name);
		p2.setModel(model);
		p2.setPrice(price);
		repo4.save(p2);

	}

	@Override
	public void deleteThirdPartyProductById(int id) {
		repo4.deleteById(id);

	}

	@Override
	public Optional<ThirdPartyProducts> getThirdPartyProductsById(int id) {
		return repo4.findById(id);

	}

	@Override
	public Iterable<ThirdPartyProducts> findAll() {
		return repo4.findAll();
	}

}
