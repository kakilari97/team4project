package com.capgemini.service;

import java.util.Optional;

import com.capgemini.bean.ThirdPartyMerchants;

public interface ThirdPartyMerchantService {

	public Optional<ThirdPartyMerchants> getThirdPartyMerchantById(int id);

	public Iterable<ThirdPartyMerchants> findAll();

	public void addThirdPartyMerchant(int id, String name, String type,String organization);

	public void deleteThirdPartyMerchantById(int id);


	

}