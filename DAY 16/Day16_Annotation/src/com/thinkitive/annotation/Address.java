package com.thinkitive.annotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class Address {
	private int pincode;
	private String city;
	
	private List addr;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(int pincode, String city) {
		super();
		this.pincode = pincode;
		this.city = city;
	}

	public Address(int pincode, String city, List addr) {
		super();
		this.pincode = pincode;
		this.city = city;
		this.addr = addr;
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

	
	
	public List getAddr() {
		return addr;
	}

	
	public void setAddr(List addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", city=" + city + ", addr=" + addr + "]";
	}

	
	

}
