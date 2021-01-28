package com.test.jpa1;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	private int addressId;
	private String city;
	private String street;
	private String state;
	private int pincode;
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public Address(int addressId, String city, String street, String state, int pincode) {
		super();
		this.addressId = addressId;
		this.city = city;
		this.street = street;
		this.state = state;
		this.pincode = pincode;
	}
	public Address() {
		super();
	}
	
	
	

}
