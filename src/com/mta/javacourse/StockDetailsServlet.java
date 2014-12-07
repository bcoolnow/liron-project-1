package com.mta.javacourse;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mta.javacourse.model.Stock;

public class StockDetailsServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		resp.setContentType("text/html");	
		Stock STock = new Stock();
		
		STock.setSymbol("PIH");
		STock.setAsk((float) 12.4);
		STock.setBid((float) 13.1);
		
		Calendar c = Calendar.getInstance();
		c.set(2014, 10, 15, 0, 0, 0);
		Date date = c.getTime();
		STock.setDate(date);

    	resp.getWriter().println(STock.getHtmlDescription());
    	


    	
    	
    	
    	
    	
    	
		Stock STock2 = new Stock();
		
		STock2.setSymbol("AAL");
		STock2.setAsk((float) 5.5);
		STock2.setBid((float) 5.78);
		
		Calendar c2 = Calendar.getInstance();
		c2.set(2014, 10, 15, 0, 0, 0);
		Date date2 = c2.getTime();
		STock2.setDate(date2);

    	resp.getWriter().println(STock2.getHtmlDescription());
    	
    	
    	
    	
    	
    	
    	
		Stock STock3 = new Stock();
		
		STock3.setSymbol("CAAS");
		STock3.setAsk((float) 31.5);
		STock3.setBid((float) 31.2);
		
		Calendar c3 = Calendar.getInstance();
		c.set(2014, 10, 15, 0, 0, 0);
		Date date3 = c.getTime();
		STock3.setDate(date3);

    	resp.getWriter().println(STock3.getHtmlDescription());
    	



	}

}
