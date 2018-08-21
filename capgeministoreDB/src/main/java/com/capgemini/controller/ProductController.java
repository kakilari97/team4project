package com.capgemini.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.bean.Merchants;
import com.capgemini.bean.Product;
import com.capgemini.bean.Products;
import com.capgemini.bean.ThirdPartyMerchants;
import com.capgemini.bean.ThirdPartyProducts;
import com.capgemini.service.IProductService;
import com.capgemini.service.MerchantService;
import com.capgemini.service.ProductsService;
import com.capgemini.service.ThirdPartyMerchantService;
import com.capgemini.service.ThirdPartyProductService;

@RestController
public class ProductController {

	@Autowired
	IProductService service;

	public Optional<Product> getProductById(@RequestParam int p_id) {
		return service.getProduct(p_id);
	}

	@RequestMapping(value = "/products")
	public List<Product> getProduct() {

		Iterable<Product> products = service.getAllProducts();
		return (List<Product>) products;

	}
	/*
	 * @RequestMapping(value="/products", method=RequestMethod.GET) public
	 * ModelAndView getAllProducts() {
	 * 
	 * List<Product> list = service.getAllProducts(); System.out.println(list);
	 * 
	 * return new ModelAndView("Products","prods",list);
	 * 
	 * }
	 */

	@RequestMapping("/productsbyid")
	public Optional<Product> getProduct(@RequestParam int p_id) {
		return service.getProduct(p_id);
	}

	@RequestMapping("/addproducts{p_id}{p_name}{p_companyname}{p_price}{p_dom}{p_type}{p_merchantid}{p_couponid}{p_quantity}")
	public void addProduct(@RequestParam int p_id, @RequestParam String p_name, @RequestParam String p_companyname,
			@RequestParam double p_price, @RequestParam String p_dom, @RequestParam String p_type,
			@RequestParam String p_merchantid, @RequestParam String p_couponid, @RequestParam String p_quantity) {

		service.addProduct(p_id, p_name, p_companyname, p_price, p_dom, p_type, p_merchantid, p_couponid, p_quantity);
	}

	@RequestMapping("/deleteproduct")
	public void deleteProduct(@RequestParam int p_id) {
		service.deleteProduct(p_id);
	}

	@Autowired
	MerchantService service4;
	@Autowired
	ProductsService service1;
	@Autowired
	ThirdPartyMerchantService service2;
	@Autowired
	ThirdPartyProductService service3;

	///////////////////////////////////////////////////////////////////////////////////
	@RequestMapping("/getMerchants")
	public Optional<Merchants> getMerchantById(@RequestParam String id) {
		return service4.getMerchantById(Integer.parseInt(id));
	}

	@RequestMapping(value = "/Merchants")
	public List<Merchants> getMerchants() {

		Iterable<Merchants> merchants = service4.findAll();
		return (List<Merchants>) merchants;

	}

	@RequestMapping(value = "/addMerchants{id}{name}{type}{organisation}")
	void addMerchant(@RequestParam String id, @RequestParam String name, @RequestParam String type,
			@RequestParam String organisation) {

		service4.addMerchant(Integer.parseInt(id), name, type, organisation);
		System.out.println("Added Successfully");
	}

	@RequestMapping("/deleteMerchant")
	public void deleteMerchantById(@RequestParam String id) {
		service4.deleteMerchantById(Integer.parseInt(id));
	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////

	@RequestMapping(value = "/addProducts{id}{name}{model}{price}")
	void addProduct(@RequestParam String id, @RequestParam String name, @RequestParam String model,
			@RequestParam String price) {

		service1.addProduct(Integer.parseInt(id), name, model, price);
		System.out.println("Added Successfully");
	}

	@RequestMapping("/deleteProduct")
	public void deleteProductById(@RequestParam String id) {
		service1.deleteProductById(Integer.parseInt(id));
	}

	@RequestMapping("/getProducts")
	public Optional<Products> getProductById(@RequestParam String id) {
		return service1.getProductsById(Integer.parseInt(id));
	}

	@RequestMapping(value = "/Products")
	public List<Products> getProducts() {

		Iterable<Products> products = service1.findAll();
		return (List<Products>) products;

	}
	//////////////////////////////////////////////////////////////////////////////////

	@RequestMapping("/getThirdPartyMerchants")
	public Optional<ThirdPartyMerchants> getThirdPartyMerchantById(@RequestParam String id) {
		return service2.getThirdPartyMerchantById(Integer.parseInt(id));
	}

	@RequestMapping(value = "/ThirdPartyMerchants")
	public List<ThirdPartyMerchants> getThirdPartyMerchants() {

		Iterable<ThirdPartyMerchants> thirdmerchants = service2.findAll();
		return (List<ThirdPartyMerchants>) thirdmerchants;

	}

	@RequestMapping(value = "/addThirdPartyMerchants{id}{name}{type}{organisation}")
	void addThirdPartyMerchant(@RequestParam String id, @RequestParam String name, @RequestParam String type,
			@RequestParam String organisation) {

		service2.addThirdPartyMerchant(Integer.parseInt(id), name, type, organisation);
		System.out.println("Added Successfully");
	}

	@RequestMapping("/deleteThirdPartyMerchant")
	public void deleteThirdPartyMerchantById(@RequestParam String id) {
		service2.deleteThirdPartyMerchantById(Integer.parseInt(id));
	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////

	@RequestMapping(value = "/addThirdPartyProducts{id}{name}{model}{price}")
	void addThirdPartyProduct(@RequestParam String id, @RequestParam String name, @RequestParam String model,
			@RequestParam String price) {

		service3.addThirdPartyProduct(Integer.parseInt(id), name, model, price);
		System.out.println("Added Successfully");
	}

	@RequestMapping("/deleteThirdPartyProduct")
	public void deleteThirdPartyProductById(@RequestParam String id) {
		service3.deleteThirdPartyProductById(Integer.parseInt(id));
	}

	@RequestMapping("/getThirdPartyProducts")
	public Optional<ThirdPartyProducts> getThirdPartyProductById(@RequestParam String id) {
		return service3.getThirdPartyProductsById(Integer.parseInt(id));
	}

	@RequestMapping(value = "/ThirdPartyProducts")
	public List<ThirdPartyProducts> getThirdPartyProducts() {

		Iterable<ThirdPartyProducts> thirdproducts = service3.findAll();
		return (List<ThirdPartyProducts>) thirdproducts;

	}

}
