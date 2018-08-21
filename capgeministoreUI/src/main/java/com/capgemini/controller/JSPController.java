package com.capgemini.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JSPController {
	
	@RequestMapping("/ProductOptions")
	public String productoptions() {
		return "ProductOptions";
	}
	

	@RequestMapping("/addproduct")
	public String addProduct() {
		return "addproduct";
	}
	
	@RequestMapping("/changeprofile")
	public String changeprofile() {
		return "changeprofile";
	}
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/Inventory")
	public String inventory(){
		return "Inventory";
	}
	
	@RequestMapping("/MerchantOptions")
	public String merchantoptions(){
		return "MerchantOptions";
	}
	@RequestMapping("/Product")
	public String products(){
		return "Product";
	}
	@RequestMapping("/productbyid")
	public String productbyid(){
		return "productbyid";
	}
	@RequestMapping("/remove")
	public String remove(){
		return "remove";
	}
	

	
	
	@RequestMapping("/ManageMerchants")
	public String showMerchant() {
		return "ManageMerchants";
	}
	@RequestMapping("/DirectMerchants")
	public String showDirectMerchant() {
		return "DirectMerchants";
	}
	@RequestMapping("/ThirdPartyMerchants2")
	public String showThirdParty() {
		return "ThirdPartyMerchants2";
	}
	////////////////////////////////////
	@RequestMapping("/mindex")
	public String addMerchants(){
		return "mindex";
	}
	@RequestMapping("/DisplayAllMerchants")
	public String displayAllMerchants (){
		return "DisplayAllMerchants";
	}

	@RequestMapping("/Delete")
	public String deleteMerchant (){
		return "Delete";
	}

	@RequestMapping("/Display")
	public String displayMerchant (){
		return "Display";
	}

	@RequestMapping("/ManageProducts")
	public String showProduct() {
		return "ManageProducts";
	}
///////////////////////////////////////////////////
	@RequestMapping("/thirdpartyindex")
	public String addthirdpartyMerchants(){
		return "thirdpartyindex";
	}
	

	@RequestMapping("/Deletethirdpartymerchant")
	public String deletethirdpartyMerchant (){
		return "Deletethirdpartymerchant";
	}

	@RequestMapping("/Displaythirdpartymerchants")
	public String displaythirdpartyMerchant (){
		return "Displaythirdpartymerchants";
	}

	@RequestMapping("/managethirdpartyproducts")
	public String showthirdpartyProduct() {
		return "managethirdpartyproducts";
	}
	////////////////////////////////////////////////
	
	@RequestMapping("/index2")
	public String addProducts(){
		return "index2";
	}
	@RequestMapping("/DisplayProduct")
	public String displayProduct(){
		return "DisplayProduct";
	}
	@RequestMapping("/DeleteProduct")
	public String deleteProduct(){
		return "DeleteProduct";
	}

	@RequestMapping("/Products")
	public String Product(){
		return "Products";
	}
	//////////////////////////////////////////////////
	@RequestMapping("/addthirdpartyproducts")
	public String addthirdpartyProducts(){
		return "addthirdpartyproducts";
	}
	@RequestMapping("/displaythirdpartyproduct")
	public String displaythirdpartyProduct(){
		return "displaythirdpartyproduct";
	}
	@RequestMapping("/deletethirdpartyproduct")
	public String deletethirdpartyProduct(){
		return "deletethirdpartyproduct";
	}

	@RequestMapping("/Thirdpartyproducts")
	public String ThirdPartyProduct(){
		return "/Thirdpartyproducts";
	}
	
	
	}

