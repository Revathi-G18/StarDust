package com.springform.demo.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ShippingAddress {
	@Id
	private int ShippingId;
	private String apartmentnumber;
	private String streetname;
	private String city;
	private String State;
	private String zipcode;
	int getShippingId() {
		return ShippingId;
	}
	void setShippingId(int shippingId) {
		ShippingId = shippingId;
	}
	String getApartmentnumber() {
		return apartmentnumber;
	}
	void setApartmentnumber(String apartmentnumber) {
		this.apartmentnumber = apartmentnumber;
	}
	String getStreetname() {
		return streetname;
	}
	void setStreetname(String streetname) {
		this.streetname = streetname;
	}
	String getCity() {
		return city;
	}
	void setCity(String city) {
		this.city = city;
	}
	String getState() {
		return State;
	}
	void setState(String state) {
		State = state;
	}
	String getZipcode() {
		return zipcode;
	}
	void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
}
