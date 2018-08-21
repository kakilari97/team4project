package com.capgemini.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.bean.Merchants;
import com.capgemini.bean.Product;
import com.capgemini.bean.Products;
import com.capgemini.bean.ThirdPartyMerchants;
import com.capgemini.bean.ThirdPartyProducts;

@RestController

public class ProductController {

	//////////////////////////////////// Inventory
	//////////////////////////////////// products///////////////////////////////////////////////

	@RequestMapping(value = "/products", method = RequestMethod.GET)
	public ModelAndView showAllData(@ModelAttribute("aa") Product p) {
		RestTemplate rt1 = new RestTemplate();
		List<Product> p1 = rt1.getForObject("http://localhost:9898/products", ArrayList.class);
		return new ModelAndView("allproducts", "allprods", p1);

	}

	@RequestMapping("/productsbyid")

	public Product getProduct(@RequestParam int p_id) {

		RestTemplate rt2 = new RestTemplate();
		Product p = rt2.getForObject("http://localhost:9898/productsbyid?p_id=" + p_id, Product.class);
		return p;

	}

	@RequestMapping(value = "/addproducts", method = RequestMethod.GET)
	public ModelAndView addProduct(@RequestParam int p_id, @RequestParam String p_name,
			@RequestParam String p_companyname, @RequestParam double p_price, @RequestParam String p_dom,
			@RequestParam String p_type, @RequestParam String p_merchantid, @RequestParam String p_couponid,
			@RequestParam String p_quantity) {
		RestTemplate rt3 = new RestTemplate();
		Product p = rt3.getForObject(
				"http://localhost:9898/addproducts?p_id=" + p_id + "&p_name=" + p_name + "&p_companyname="
						+ p_companyname + "&p_price=" + p_price + "&p_dom=" + p_dom + "&p_type=" + p_type
						+ "&p_merchantid=" + p_merchantid + "&p_couponid=" + p_couponid + "&p_quantity=" + p_quantity,
				Product.class);
		return new ModelAndView("success", "allprods", p);

	}

	@RequestMapping(value = "/deleteproduct", method = RequestMethod.GET)
	public ModelAndView deleteProduct(@RequestParam int p_id) {
		RestTemplate rt2 = new RestTemplate();
		Product p = rt2.getForObject("http://localhost:9898/deleteproduct?p_id=" + p_id, Product.class);
		return new ModelAndView("success", "allprods", p);

	}
	/*
	 * @RequestMapping("/products")
	 * 
	 * public List<Product> getMerchant() {
	 * 
	 * RestTemplate rt1 = new RestTemplate(); List<Product> p1 =
	 * rt1.getForObject("http://localhost:9898/products", ArrayList.class); return
	 * p1; }
	 */

	/*
	 * @RequestMapping("/addproducts") public Product addProduct( @RequestParam int
	 * p_id,@RequestParam String p_name,@RequestParam String
	 * p_companyname,@RequestParam double p_price,@RequestParam String
	 * p_dom,@RequestParam String p_type,@RequestParam String
	 * p_merchantid,@RequestParam String p_couponid,@RequestParam String p_quantity)
	 * {
	 * 
	 * 
	 * RestTemplate rt3=new RestTemplate(); Product
	 * p=rt3.getForObject("http://localhost:9898/addproducts?p_id="+p_id+"&p_name="+
	 * p_name+"&p_companyname="+p_companyname+"&p_price="+p_price+"&p_dom="+p_dom+
	 * "&p_type="+p_type+"&p_merchantid="+p_merchantid+"&p_couponid="+p_couponid+
	 * "&p_quantity="+p_quantity, Product.class); return p;
	 * 
	 * }
	 */
	/*
	 * @RequestMapping("/deleteproduct") public ModelAndView
	 * deleteProduct(@RequestParam int p_id) { RestTemplate rt2= new RestTemplate();
	 * Product p=rt2.getForObject("http://localhost:9898/deleteproduct?p_id="+p_id,
	 * Product.class); return new ModelAndView("productbyid","product",p);
	 * 
	 * }
	 */

	/////////////////////////////////////// Direct
	/////////////////////////////////////// Merchants///////////////////////////////////////////////
	@RequestMapping("/DisplayMerchants")
	public Merchants getMerchants(@RequestParam String id) {
		RestTemplate rt = new RestTemplate();
		Merchants p = rt.getForObject("http://localhost:9898/getMerchants?id=" + id, Merchants.class);
		return p;
	}

	@RequestMapping(value = "/ListofAllMerchants", method = RequestMethod.GET)
	public ModelAndView getMerchants(@ModelAttribute("aa") Merchants m) {
		RestTemplate rt1 = new RestTemplate();
		List<Merchants> p1 = rt1.getForObject("http://localhost:9898/Merchants", ArrayList.class);
		return new ModelAndView("DisplayAll", "alldirmers", p1);

	}

	@RequestMapping(value = "/addmerchantsfront", method = RequestMethod.GET)
	public ModelAndView addMerchant(@RequestParam String id, @RequestParam String name, @RequestParam String type,
			@RequestParam String organisation) {
		RestTemplate rt2 = new RestTemplate();
		Merchants m = rt2.getForObject("http://localhost:9898/addMerchants?id=" + id + "&name=" + name + "&type=" + type
				+ "&organisation=" + organisation, Merchants.class);
		return new ModelAndView("successdirmers", "alldirmers", m);

	}

	@RequestMapping(value = "/DeleteMerchants", method = RequestMethod.GET)
	public ModelAndView deleteMerchant(@RequestParam String id) {
		RestTemplate rt3 = new RestTemplate();
		Merchants p = rt3.getForObject("http://localhost:9898/deleteMerchant?id=" + id, Merchants.class);
		return new ModelAndView("successdirmers", "alldirmers", p);

	}

	/*
	 * @RequestMapping("/ListofAllMerchants") public List<Merchants> getMerchants()
	 * { RestTemplate rt1 = new RestTemplate(); List<Merchants> p1 =
	 * rt1.getForObject("http://localhost:9898/Merchants", ArrayList.class); return
	 * p1; }
	 */
	/*
	 * @RequestMapping("/DeleteMerchants") public Merchants
	 * deleteMerchant(@RequestParam String id) { RestTemplate rt3 = new
	 * RestTemplate(); Merchants p =
	 * rt3.getForObject("http://localhost:9898/deleteMerchant?id=" + id,
	 * Merchants.class); return p; }
	 */

	/*
	 * @RequestMapping("/addmerchantsfront") public Merchants
	 * addMerchant(@RequestParam String id, @RequestParam String name,
	 * 
	 * @RequestParam String type,@RequestParam String organisation) { RestTemplate
	 * rt2 = new RestTemplate(); Merchants p = rt2.getForObject(
	 * "http://localhost:9898/addMerchants?id=" + id + "&name=" + name +"&type=" +
	 * type+ "&organisation=" + organisation, Merchants.class); return p; }
	 */

	/////////////////////////////////////// Direct Merchant
	/////////////////////////////////////// Products///////////////////////////////////////

	@RequestMapping(value = "/addproductsfront", method = RequestMethod.GET)
	public ModelAndView addProduct(@RequestParam String id, @RequestParam String name, @RequestParam String model,
			@RequestParam String price) {
		RestTemplate rt4 = new RestTemplate();
		Products p = rt4.getForObject(
				"http://localhost:9898/addProducts?id=" + id + "&name=" + name + "&model=" + model + "&price=" + price,
				Products.class);
		return new ModelAndView("alldirprods", "dirprods", p);

	}

	@RequestMapping(value = "/DeleteProducts", method = RequestMethod.GET)
	public ModelAndView deleteProduct(@RequestParam String id) {
		RestTemplate rt5 = new RestTemplate();
		Products p = rt5.getForObject("http://localhost:9898/deleteProduct?id=" + id, Products.class);
		return new ModelAndView("alldirprods", "dirprods", p);

	}

	@RequestMapping("/DisplayProducts")
	public Products getProduct(@RequestParam String id) {
		RestTemplate rt6 = new RestTemplate();
		Products p = rt6.getForObject("http://localhost:9898/getProducts?id=" + id, Products.class);
		return p;
	}

	@RequestMapping(value = "/ListofAllProducts", method = RequestMethod.GET)
	public ModelAndView getProduct(@ModelAttribute("aa") Products p) {
		RestTemplate rt7 = new RestTemplate();
		List<Products> p1 = rt7.getForObject("http://localhost:9898/Products", ArrayList.class);
		return new ModelAndView("alldirprods", "dirprods", p1);

	}
	/*
	 * @RequestMapping("/addproductsfront") public Products addProduct(@RequestParam
	 * String id, @RequestParam String name, @RequestParam String model,
	 * 
	 * @RequestParam String price) { RestTemplate rt4 = new RestTemplate(); Products
	 * p = rt4.getForObject( "http://localhost:9898/addProducts?id=" + id + "&name="
	 * + name + "&model=" + model + "&price=" + price, Products.class); return p; }
	 */
	/*
	 * @RequestMapping("/ListofAllProducts") public List<Products> getProduct() {
	 * System.out.println("sd"); RestTemplate rt7 = new RestTemplate();
	 * List<Products> p1 = rt7.getForObject("http://localhost:9898/Products",
	 * ArrayList.class); return p1; }
	 */
	/*
	 * @RequestMapping("/DeleteProducts")
	 * 
	 * public Products deleteProduct(@RequestParam String id) { RestTemplate rt5 =
	 * new RestTemplate(); Products p =
	 * rt5.getForObject("http://localhost:9898/deleteProduct?id=" + id,
	 * Products.class); return p; }
	 */

	///////////////////////////////////// Third Party
	///////////////////////////////////// Merchants///////////////////////////////////
	@RequestMapping("/DisplayThirdPartyMerchants")
	public ThirdPartyMerchants getThirdPartyMerchants(@RequestParam String id) {
		RestTemplate rt8 = new RestTemplate();
		ThirdPartyMerchants m = rt8.getForObject("http://localhost:9898/getThirdPartyMerchants?id=" + id,
				ThirdPartyMerchants.class);
		return m;
	}


	@RequestMapping(value = "/ListofAllThirdPartyMerchants", method = RequestMethod.GET)
	public ModelAndView getThirdPartyMerchants() {
		RestTemplate rt9 = new RestTemplate();
		List<ThirdPartyMerchants> m1 = rt9.getForObject("http://localhost:9898/ThirdPartyMerchants", ArrayList.class);
		return new ModelAndView("allthirdmers", "thirdmers", m1);

	}

	
	@RequestMapping(value = "/addThirdPartyMerchants", method = RequestMethod.GET)
	public ModelAndView addThirdPartyMerchant(@RequestParam String id, @RequestParam String name,
			@RequestParam String type, @RequestParam String organisation) {
		RestTemplate rt10 = new RestTemplate();
		ThirdPartyMerchants m = rt10.getForObject("http://localhost:9898/addThirdPartyMerchants?id=" + id + "&name="
				+ name + "&type=" + type + "&organisation=" + organisation, ThirdPartyMerchants.class);
		return new ModelAndView("successthirdmers", "thirdmers", m);

	}

	
	@RequestMapping(value = "/DeleteThirdPartyMerchants", method = RequestMethod.GET)
	public ModelAndView deleteThirdPartyMerchant(@RequestParam String id) {
		RestTemplate rt11 = new RestTemplate();
		ThirdPartyMerchants m = rt11.getForObject("http://localhost:9898/deleteThirdPartyMerchant?id=" + id,
				ThirdPartyMerchants.class);
		return new ModelAndView("successthirdmers", "thirdmers", m);

	}
	
	/*
	 * @RequestMapping("/addThirdPartyMerchants") public ThirdPartyMerchants
	 * addThirdPartyMerchant(@RequestParam String id, @RequestParam String name,
	 * 
	 * @RequestParam String type, @RequestParam String organisation) { RestTemplate
	 * rt10 = new RestTemplate(); ThirdPartyMerchants m =
	 * rt10.getForObject("http://localhost:9898/addThirdPartyMerchants?id=" + id +
	 * "&name=" + name + "&type=" + type + "&organisation=" + organisation,
	 * ThirdPartyMerchants.class); return m; }
	 */
	
	/*
	 * @RequestMapping("/DeleteThirdPartyMerchants") public ThirdPartyMerchants
	 * deleteThirdPartyMerchant(@RequestParam String id) { RestTemplate rt11 = new
	 * RestTemplate(); ThirdPartyMerchants m =
	 * rt11.getForObject("http://localhost:9898/deleteThirdPartyMerchant?id=" + id,
	 * ThirdPartyMerchants.class); return m; }
	 */
	/*
	 * @RequestMapping("/ListofAllThirdPartyMerchants") public
	 * List<ThirdPartyMerchants> getThirdPartyMerchants() { RestTemplate rt9 = new
	 * RestTemplate(); List<ThirdPartyMerchants> m1 =
	 * rt9.getForObject("http://localhost:9898/ThirdPartyMerchants",
	 * ArrayList.class); return m1; }
	 */

	/////////////////////////////////////// Third Party
	/////////////////////////////////////// Products/////////////////////////////////////////////

	@RequestMapping(value = "/addThirdPartyProductsfront", method = RequestMethod.GET)
	public ModelAndView addThirdPartyProduct(@RequestParam String id, @RequestParam String name,
			@RequestParam String model, @RequestParam String price) {
		RestTemplate rt12 = new RestTemplate();
		ThirdPartyProducts p = rt12.getForObject("http://localhost:9898/addThirdPartyProducts?id=" + id + "&name="
				+ name + "&model=" + model + "&price=" + price, ThirdPartyProducts.class);
		return new ModelAndView("successthirdprods", "thirdprods", p);

	}

	@RequestMapping(value = "/DeleteThirdPartyProducts", method = RequestMethod.GET)
	public ModelAndView deleteThirdPartyProducts(@RequestParam String id) {
		RestTemplate rt13 = new RestTemplate();
		ThirdPartyProducts p = rt13.getForObject("http://localhost:9898/deleteThirdPartyProduct?id=" + id,
				ThirdPartyProducts.class);
		return new ModelAndView("successthirdprods", "thirdprods", p);

	}

	@RequestMapping("/DisplayThirdPartyProducts")
	public ThirdPartyProducts getThirdPartyProduct(@RequestParam String id) {
		RestTemplate rt14 = new RestTemplate();
		ThirdPartyProducts p = rt14.getForObject("http://localhost:9898/getThirdPartyProducts?id=" + id,
				ThirdPartyProducts.class);
		return p;
	}

	@RequestMapping(value = "/ListofAllThirdPartyProducts", method = RequestMethod.GET)
	public ModelAndView getThirdPartyProduct() {
		RestTemplate rt7 = new RestTemplate();
		List<ThirdPartyProducts> p1 = rt7.getForObject("http://localhost:9898/ThirdPartyProducts", ArrayList.class);
		return new ModelAndView("allthirdprods", "thirdprods", p1);

	}
	/*
	 * @RequestMapping("/addThirdPartyProductsfront") public ThirdPartyProducts
	 * addThirdPartyProduct(@RequestParam String id, @RequestParam String name,
	 * 
	 * @RequestParam String model, @RequestParam String price) { RestTemplate rt12 =
	 * new RestTemplate(); ThirdPartyProducts p =
	 * rt12.getForObject("http://localhost:9898/addThirdPartyProducts?id=" + id +
	 * "&name=" + name + "&model=" + model + "&price=" + price,
	 * ThirdPartyProducts.class); return p; }
	 */

	/*
	 * @RequestMapping("/DeleteThirdPartyProducts")
	 * 
	 * public ThirdPartyProducts deleteThirdPartyProducts(@RequestParam String id) {
	 * RestTemplate rt13 = new RestTemplate(); ThirdPartyProducts p =
	 * rt13.getForObject("http://localhost:9898/deleteThirdPartyProduct?id=" + id,
	 * ThirdPartyProducts.class); return p; }
	 */

	/*
	 * @RequestMapping("/ListofAllThirdPartyProducts") public
	 * List<ThirdPartyProducts> getThirdPartyProduct() { System.out.println("sd");
	 * RestTemplate rt7 = new RestTemplate(); List<ThirdPartyProducts> p1 =
	 * rt7.getForObject("http://localhost:9898/ThirdPartyProducts",
	 * ArrayList.class); return p1; }
	 */
}
