package com.capgemini.service;

import java.util.Optional;

import com.capgemini.bean.Merchants;

public interface MerchantService
{
	
	public Optional<Merchants> getMerchantById(int id);

	public Iterable<Merchants> findAll();

	public void addMerchant(int id, String name,String type, String organization);

	public void deleteMerchantById(int id);

	

}