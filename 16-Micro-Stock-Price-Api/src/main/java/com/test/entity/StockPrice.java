package com.test.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StockPrice 
{
	@Id
	private Integer stockPriceId;
	
	private String companyName;
	
	private Double comapnyStockPrice;

	public Integer getStockPriceId() {
		return stockPriceId;
	}

	public void setStockPriceId(Integer stockPriceId) {
		this.stockPriceId = stockPriceId;
	}

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

	@Override
	public String toString() {
		return "StockPrice [stockPriceId=" + stockPriceId + ", companyName=" + companyName + ", comapnyStockPrice="
				+ comapnyStockPrice + "]";
	}

	public StockPrice(Integer stockPriceId, String companyName, Double comapnyStockPrice) {
		super();
		this.stockPriceId = stockPriceId;
		this.companyName = companyName;
		this.comapnyStockPrice = comapnyStockPrice;
	}

	public StockPrice() {
		super();
		//TODO Auto-generated constructor stub
	}
	
	
	
	
}
