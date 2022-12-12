package com.demo.pogo;

public class CustomerApiDetails 
{
	private String name;
	private String email;
	private Address address;
	
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public CustomerApiDetails(String name, String email, Address address) {
		super();
		this.name = name;
		this.email = email;
		this.address = address;
	}
	public CustomerApiDetails() {
		super();
		//TODO Auto-generated constructor stub
	}
	
	
	
}
