package com.capgemini.bean;

import java.time.LocalDate;

public class Product {
	
	@Override
	public String toString() {
		return "Product Details:\n"+"***\n"
				+ " Product id=" + p_id + "\nProduct name=" + p_name + "\n Company name=" + p_companyname + "\n price="
				+ p_price + "\n Date of manufacturing=" + p_dom + "\n Category=" + p_type + "\n Merchant id=" + p_merchantid
				+ "\n Coupon id=" + p_couponid + "\n Quantity=" + p_quantity + "***";
	}
	int p_id;
	String p_name;
	String p_companyname;
	double p_price;
	String p_dom;
	String p_type;
	String p_merchantid;
	String p_couponid;
	String p_quantity;
	
	public Product()
	{
		
	}
	public Product(int p_id, String p_name, String p_companyname, double p_price, String p_dom,
			String p_type,  String p_merchantid, String p_couponid, String p_quantity) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
		this.p_companyname = p_companyname;
		this.p_price = p_price;
		this.p_dom = p_dom;
		this.p_type = p_type;
		this.p_merchantid = p_merchantid;
		this.p_couponid = p_couponid;
		this.p_quantity = p_quantity;
	}
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public String getCompany_name() {
		return p_companyname;
	}
	public void setCompany_name(String p_companyname) {
		this.p_companyname = p_companyname;
	}
	public double getPrice() {
		return p_price;
	}
	public void setPrice(double p_price) {
		this.p_price = p_price;
	}
	public String getP_dateofmanufacturing() {
		return p_dom;
	}
	public void setP_dateofmanufacturing(String p_dom) {
		this.p_dom = p_dom;
	}
	public String getP_type() {
		return p_type;
	}
	public void setP_type(String p_type) {
		this.p_type = p_type;
	}
	
	public String getP_merchant_id() {
		return p_merchantid;
	}
	public void setP_merchant_id(String p_merchantid) {
		this.p_merchantid = p_merchantid;
	}
	public String getCoupon_id() {
		return p_couponid;
	}
	public void setCoupon_id(String p_couponid) {
		this.p_couponid = p_couponid;
	}
	public String getQuantity() {
		return p_quantity;
	}
	public void setQuantity(String p_quantity) {
		this.p_quantity = p_quantity;
	}
	
}
