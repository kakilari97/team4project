package com.capgemini.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.bean.Product;

@Repository
public interface ProductRepo extends CrudRepository<Product,Integer> {

}
