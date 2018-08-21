package com.capgemini.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.bean.ThirdPartyProducts;

@Repository
public interface ThirdPartyProductRepo extends CrudRepository<ThirdPartyProducts, Integer> {

}
