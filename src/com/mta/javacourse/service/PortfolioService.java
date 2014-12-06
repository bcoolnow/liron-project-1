package com.mta.javacourse.service;

import com.mta.javacourse.model.Portfolio;
import com.mta.javacourse.model.Stock;

public class PortfolioService {
	public Portfolio getPortfolio(){
		Portfolio myPortfolio = new Portfolio();

		java.util.Date date = new java.util.Date();
		date.setDate(15);
		date.setMonth(11);
		date.setYear(2014);
		
		Stock stock = new Stock();		
		stock.setSymbol("PIH");
		stock.setAsk(12.4f);
		stock.setBid(13.1f);
		stock.setDate(date);
		myPortfolio.addStock(stock);
	
		Stock stock2 = new Stock();		
		stock2.setSymbol("AAL");
		stock2.setAsk(5.5f);
		stock2.setBid(5.78f);
		stock2.setDate(date);
		myPortfolio.addStock(stock2);
		
		Stock stock3 = new Stock();
        stock3.setSymbol("CAAS");
        stock3.setAsk(31.5f);
        stock3.setBid(31.2f);
        stock3.setDate(date);
        myPortfolio.addStock(stock3);

         return myPortfolio; }

}