/*Liron Baruch code 301422200*/
package com.mta.javacourse.model;

import java.util.Date;

/*will present stocks protfolio :*/
public class Portfolio {

private String title;
private final static int MAX_PORTFOLIO_SIZE = 5;
private Stock[] stocks = new Stock[MAX_PORTFOLIO_SIZE];
private StockStatus[] stockStatus = new StockStatus[MAX_PORTFOLIO_SIZE];
private int portfolioSize = 0;
private int i;

	/*ex 6  contractor :*/
	public Portfolio()
	{
		stocks = new Stock[MAX_PORTFOLIO_SIZE];
		stockStatus = new StockStatus[MAX_PORTFOLIO_SIZE];
	}
	
	/*ex 6  contractor :*/
	public Portfolio(String title1,Stock[] stocks1,StockStatus[] stockStatus1,int portfolioSize1){
		setTitle(title1);
		setStocks(stocks1);
		setStocksStatus(stockStatus1);
		setPortfolioSize(portfolioSize1);
	}
	
	/*ex 6 copy contractor :*/
	public Portfolio(Portfolio portfolio){
		this();
		this.title = portfolio.getTitle();
		this.portfolioSize = portfolio.portfolioSize;
		
		for(int i = 0; i < portfolio.portfolioSize ; i++){
			stocks[i] = new Stock(portfolio.getStock()[i]);
			stockStatus[i] = new StockStatus(portfolio.getStocksStatus()[i]);
		}
	}

	/*will add stock to array :*/
	public void addStock (Stock stock){

		if (portfolioSize < MAX_PORTFOLIO_SIZE )
		{
			stocks[portfolioSize] = stock;
			portfolioSize++;
		}
	}
	
	/*will remove stock to array :*/
	public void removeStock(int index){
		if(index == portfolioSize)
			this.portfolioSize--;
		else 
		{
			this.portfolioSize--;
			for(int i = index; i <= portfolioSize-1; i++)
			{
				this.stocks[i] = this.stocks[i+1];
			}
		}
	}
	
	/*will return getHtmlString :*/
	public String getHtmlString(){

		String getHtmlString = getTitle();
		for (i = 0; i < portfolioSize; i++)
			getHtmlString += stocks[i].getHtmlDescription()+"<br>";

		return getHtmlString;	
	}	
	
	/*stock status :*/
   public class StockStatus{
			
	private String symbol;
	private float currentBid;
	private float currentAsk;
	private Date date;
	private int recommendation;
	private int stockQuantity;
	private final static int DO_NOTHING = 0;
	private final static int BUY = 1;
	private final static int SELL = 2;
	
	/*ex 6 copy contractor :*/		
	public StockStatus(){}
	
	/*ex 6 contractor :*/	
	public StockStatus(StockStatus stockStatus){
		if(this.symbol != null)
		{
			this.symbol = stockStatus.symbol;
			this.currentAsk = stockStatus.currentAsk;
			this.currentAsk = stockStatus.currentBid;
			this.date = stockStatus.date;
			this.recommendation = stockStatus.recommendation;
			this.stockQuantity = stockStatus.stockQuantity;
				}
			}
	public String getSymbol() {
				return symbol;
			}
			
	public float getCurrentBid() {
				return currentBid;
			}
			
	public float getCurrentAsk() {
				return currentAsk;
			}
			
	public Date getDate() {
				return date;
			}
			
	public int getRecommendation() {
				return recommendation;
			}
			
	public int getStockQuantity() {
				return stockQuantity;
			}
			
	public void setSymbol(String symbol) {
				this.symbol = symbol;
			}
		
	public void setCurrentBid(float currentBid) {
				this.currentBid = currentBid;
			}
			
	public void setCurrentAsk(float currentAsk) {
				this.currentAsk = currentAsk;
			}
			
	public void setDate(Date date) {
				this.date = date;
			}
			
	public void setRecommendation(int recommendation) {
				this.recommendation = recommendation;
			}
			
	public void setStockQuantity(int stockQuantity) {
				this.stockQuantity = stockQuantity;
			}		

		}
   
   
    public String getTitle() {
	return title;
    }

    public int getPortfolioSize(){
	return portfolioSize = 0;
    }

    public void setTitle(String title) {
	this.title = title;
    }

    public void setStocks(Stock[] stocks) {
	this.stocks = stocks;
    }

    public void setPortfolioSize(int portfolioSize) {
	this.portfolioSize = portfolioSize;
    }

    public StockStatus[] getStocksStatus() {
	return stockStatus;
    }

    public void setStocksStatus(StockStatus[] stocksStatus) {
	this.stockStatus = stocksStatus;
    }

    public Stock[] getStock(){
	return stocks;
    }
}
