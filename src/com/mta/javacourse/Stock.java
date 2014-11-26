package com.mta.javacourse;

public class Stock {
	private String symbol;
	private float Ask;
	private float Bid;
	private java.util.Date date;
	
	public String getSymbol() {
		return symbol;
	}
	
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	
	public float getAsk() {
		return Ask;
	}
	
	public void setAsk(float ask) {
		Ask = ask;
	}
	
	public float getBid() {
		return Bid;
	}
	
	public void setBid(float bid) {
		Bid = bid;
	}
	
	public java.util.Date getDate() {
		return date;
	}
	
	public void setDate(java.util.Date date) {
		this.date = date;
	}
	
	public String getHtmlDescription(){
		String ret = "<br><br>stock symbol:"+symbol+"<br>ask:"+Ask+"<br>bid:"+Bid+"<br>date:"+ getDate();
	return ret;
	}

}
