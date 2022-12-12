package com.demo.entity;

public class AddressData 
{
	private String state;
	private String city;
	private String pinCode;
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public AddressData(String state, String city, String pinCode) {
		super();
		this.state = state;
		this.city = city;
		this.pinCode = pinCode;
	}
	public AddressData() {
		super();
		//TODO Auto-generated constructor stub
	}
	
	
	
}
