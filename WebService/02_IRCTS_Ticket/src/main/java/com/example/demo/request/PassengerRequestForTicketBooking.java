package com.example.demo.request;


public class PassengerRequestForTicketBooking 
{
	private String name;
	private String dob;
	private String from;
	private String to;
	private String date;
	
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
	public PassengerRequestForTicketBooking(String name, String dob, String from, String to, String date) {
		super();
		this.name = name;
		this.dob = dob;
		this.from = from;
		this.to = to;
		this.date = date;
	}
	public PassengerRequestForTicketBooking() {
		super();
		//TODO Auto-generated constructor stub
	}
	
	
	
}
