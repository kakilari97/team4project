package com.capgemini.bean;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {

	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	int p_id;
	
	@Column(name="p_name")
	String p_name;
	
	@Column(name="p_companyname")
	String p_companyname;
	
	@Column(name="p_price")
	double p_price;
	
	@Column(name="p_dom")
	String p_dom;
	
	@Column(name="p_type")
	String p_type;
	
	@Column(name="p_merchantid")
	String p_merchantid;
	
	@Column(name="p_couponid")
	String p_couponid;
	
	@Column(name="p_quantity")
	String p_quantity;

	public Product() {

	}
	@Override
	public String toString() {
		return "Product Details:\n"+"***\n"
				+ " Product id=" + p_id + "\nProduct name=" + p_name + "\n Company name=" + p_companyname + "\n price="
				+ p_price + "\n Date of manufacturing=" + p_dom + "\n Category=" + p_type + "\n Merchant id=" + p_merchantid
				+ "\n Coupon id=" + p_couponid + "\n Quantity=" + p_quantity + "***";
	}
	

	public Product(int p_id, String p_name, String p_companyname, double p_price, String p_dom,
			String p_type, String p_merchantid, String p_couponid, String p_quantity) {
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
	public String getP_companyname() {
		return p_companyname;
	}
	public void setP_companyname(String p_companyname) {
		this.p_companyname = p_companyname;
	}
	public double getP_price() {
		return p_price;
	}
	public void setP_price(double p_price) {
		this.p_price = p_price;
	}
	public String getP_dom() {
		return p_dom;
	}
	public void setP_dom(String p_dom) {
		this.p_dom = p_dom;
	}
	public String getP_type() {
		return p_type;
	}
	public void setP_type(String p_type) {
		this.p_type = p_type;
	}
	public String getP_merchantid() {
		return p_merchantid;
	}
	public void setP_merchantid(String p_merchantid) {
		this.p_merchantid = p_merchantid;
	}
	public String getP_couponid() {
		return p_couponid;
	}
	public void setP_couponid(String p_couponid) {
		this.p_couponid = p_couponid;
	}
	public String getP_quantity() {
		return p_quantity;
	}
	public void setP_quantity(String p_quantity) {
		this.p_quantity = p_quantity;
	}

	
}
