/*Liron Baruch code 301422200*/
package com.mta.javacourse.service;

import java.util.Date;

import com.mta.javacourse.model.Portfolio;
import com.mta.javacourse.model.Stock;

/*will present service protfolio :*/
public class PortfolioService {
	private Portfolio myPortfolio = new Portfolio();



/*will return myprotfolio anf array of preset stocks*/
public Portfolio getPortfolio(){
	    
	
Date date = new java.util.Date();

date.setDate(15);
date.setMonth(10);
date.setYear(114);
date.setHours(0);
date.setMinutes(0);
date.setSeconds(0);

 Stock Stock1 = new Stock("PIH", 12.4f, 13.1f, date);
	myPortfolio.addStock(Stock1);
 Stock Stock2 = new Stock("AAL",5.5f,5.78f,date);
	myPortfolio.addStock(Stock2);
 Stock Stock3 = new Stock("CAAS",31.5f,31.2f,date);
	myPortfolio.addStock(Stock3);

  myPortfolio.setTitle("<h1>Portfolio #1 :</h1>");

		return myPortfolio;


}}