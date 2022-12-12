package com.test.binding;

public class StockCalculationResponse 
{
	private String comapnyName;
	private Integer portNumber;
	private Integer quantity;
	private Double totalCost;
	
	
	public String getComapnyName() {
		return comapnyName;
	}
	public void setComapnyName(String comapnyName) {
		this.comapnyName = comapnyName;
	}
	public Integer getPortNumber() {
		return portNumber;
	}
	public void setPortNumber(Integer portNumber) {
		this.portNumber = portNumber;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Double getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(Double totalCost) {
		this.totalCost = totalCost;
	}
	@Override
	public String toString() {
		return "StockCalculationResponse [comapnyName=" + comapnyName + ", portNumber=" + portNumber + ", quantity="
				+ quantity + ", totalCost=" + totalCost + "]";
	}
	
	
}
