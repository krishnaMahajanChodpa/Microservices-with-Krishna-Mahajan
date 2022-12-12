package com.demo.entity;

public class CustomerEntity
{
	private String name;
	private String email;
	private AddressData address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public AddressData getAddress() {
		return address;
	}
	public void setAddress(AddressData address) {
		this.address = address;
	}
	
	
	public CustomerEntity(String name, String email, AddressData address) {
		super();
		this.name = name;
		this.email = email;
		this.address = address;
	}
	public CustomerEntity() {
		super();
		//TODO Auto-generated constructor stub
	}
	
	
}
