package com.test.binding;

public class StockPriceApi
{
	private String companyName;
	
	private Double comapnyStockPrice;

	private Integer portNumber;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Double getComapnyStockPrice() {
		return comapnyStockPrice;
	}

	public void setComapnyStockPrice(Double comapnyStockPrice) {
		this.comapnyStockPrice = comapnyStockPrice;
	}

	public Integer getPortNumber() {
		return portNumber;
	}

	public void setPortNumber(Integer portNumber) {
		this.portNumber = portNumber;
	}

	@Override
	public String toString() {
		return "StockPriceApi [companyName=" + companyName + ", comapnyStockPrice=" + comapnyStockPrice
				+ ", portNumber=" + portNumber + "]";
	}
	
	
}
