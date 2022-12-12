package com.demo.request;

public class TicketBookingRequest
{
		
	private String name;
	private String from;
	private String to;
	private String dob;
	private String date;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public TicketBookingRequest(String name, String from, String to, String dob, String date) {
		super();
		this.name = name;
		this.from = from;
		this.to = to;
		this.dob = dob;
		this.date = date;
	}
	public TicketBookingRequest() {
		super();
		//TODO Auto-generated constructor stub
	}
	
	
	
	
}
