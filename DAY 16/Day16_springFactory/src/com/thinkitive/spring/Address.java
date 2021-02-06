package com.thinkitive.spring;

import java.util.Map;

public class Address {
	private int pincode;
	private String city;
	private Map district;
	
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(int pincode, String city) {
		super();
		this.pincode = pincode;
		this.city = city;
	}

	public Address(int pincode, String city, Map district) {
		super();
		this.pincode = pincode;
		this.city = city;
		this.district = district;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Map getDistrict() {
		return district;
	}

	public void setDistrict(Map district) {
		this.district = district;
	}

	
	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", city=" + city + ", district=" + district + "]";
	}

	public void dispaddress()
	{
		System.out.println("Hello This is Address class...");
	}
	

}
