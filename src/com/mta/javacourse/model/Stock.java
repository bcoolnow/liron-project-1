/*Liron Baruch code 301422200*/
package com.mta.javacourse.model;

import java.util.Date;

/*STOCK DITAILS*/
public class Stock {

	private float Bid;
	private float Ask;
	private String Symbol;
	private Date Date;
/*EX 6 - copy contractor : */	
public Stock(String stockSymbol1, float ask1, float bid1, Date date1) {
		if(stockSymbol1 != null)
		{
			setSymbol(stockSymbol1);
			setAsk(ask1);
			setBid(bid1);
			setDate(date1);
		}
	}

/*EX 6 - copy contractor : */

public Stock(Stock stock){
	this (stock.getSymbol(),stock.getAsk(),stock.getBid(),stock.getDate());
}

public float getBid() {
	return Bid;
}

public void setBid(float bid) {
	Bid = bid;
}

public float getAsk() {
	return Ask;
}

public void setAsk(float ask) {
	Ask = ask;
}

public String getSymbol() {
	return Symbol;
}

public void setSymbol(String symbol) {
	Symbol = symbol;
}

public java.util.Date getDate() {
	return Date;
}

public void setDate(java.util.Date date) {
	Date = date;
}

public String getHtmlDescription() {

	String stockHtmlDetailsString = "<b>Stock Symbol</b>: "+getSymbol()+", <b>Ask</b> : "+getAsk()+", <b>Bid</b>: "+getBid()+", <b>Date</b> : "+Date;
	return stockHtmlDetailsString;

}
}
