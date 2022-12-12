package com.test.repository;

import com.test.entity.StockPrice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository extends JpaRepository<StockPrice,Integer>
{
	@Query("select comapnyStockPrice from StockPrice where companyName=:comapnyName")
	public Double findStockPriceByCompanyName(String comapnyName);	
}
