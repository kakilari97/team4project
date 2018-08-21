package com.capgemini.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.bean.ThirdPartyMerchants;

@Repository
public interface ThirdPartyMerchantRepo extends CrudRepository<ThirdPartyMerchants, Integer>{

}