/*Liron Baruch code 301422200*/
package com.mta.javacourse.servlet;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mta.javacourse.model.Portfolio;
import com.mta.javacourse.model.Stock;
import com.mta.javacourse.service.PortfolioService;

public class PortfolioServlet extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");

		PortfolioService portfolioService = new PortfolioService();
		Portfolio portfolio = portfolioService.getPortfolio();
		Stock[] stocks = portfolio.getStock();
		
		Portfolio portfolio2 = new Portfolio(portfolio);

		resp.getWriter().println(portfolio.getHtmlString() + "<br>");
		portfolio2.setTitle("<h1>Portfolio #2 :</h1>");
		resp.getWriter().println(portfolio2.getHtmlString() + 
		"<br>-----------------------------------------------------------------------------------------------------<br>");	
              /*remove first stock from portfolio1*/	
		       portfolio.removeStock(0);
		       resp.getWriter().println(portfolio.getHtmlString() + "<br>");
		       resp.getWriter().println(portfolio2.getHtmlString() + 
	           "<br>-----------------------------------------------------------------------------------------------------<br>");
                       /*change last stock's bid value of portfolio2 to 55.55*/		
	                   	portfolio2.getStock()[2].setBid(55.55f);
	                  	resp.getWriter().println(portfolio.getHtmlString() + "<br>");
	                 	resp.getWriter().println(portfolio2.getHtmlString() + 
		                "<br>-----------------------------------------------------------------------------------------------------<br>");

	}
}
