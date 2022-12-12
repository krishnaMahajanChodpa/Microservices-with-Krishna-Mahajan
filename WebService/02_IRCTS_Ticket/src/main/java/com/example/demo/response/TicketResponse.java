package com.example.demo.response;

public class TicketResponse 
{
	private String name;
	private String dob;
	private String from;
	private String to;
	private String date;
	
	private String status;
	private String price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public TicketResponse(String name, String dob, String from, String to, String date, String status, String price) {
		super();
		this.name = name;
		this.dob = dob;
		this.from = from;
		this.to = to;
		this.date = date;
		this.status = status;
		this.price = price;
	}
	public TicketResponse() {
		super();
		//TODO Auto-generated constructor stub
	}
	
	
}
