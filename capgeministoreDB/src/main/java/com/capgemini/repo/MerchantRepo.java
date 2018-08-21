package com.capgemini.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.bean.Merchants;

@Repository
public interface MerchantRepo extends CrudRepository<Merchants, Integer> {

}
