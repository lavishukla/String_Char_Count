package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.binding.StockPrice;

public interface IStockRepository extends JpaRepository<StockPrice, Integer>{

	public StockPrice findByCompanyName(String companyName);
}
