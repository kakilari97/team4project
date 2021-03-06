package com.capgemini.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.bean.Products;

@Repository
public interface ProductsRepo extends CrudRepository<Products, Integer> {

}