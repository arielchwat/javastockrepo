package com.myorg.javacourse;

import java.io.IOException;
import java.util.Date;

import com.myorg.javacourse.Stock;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StockDetailsServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");
		 
		Stock stockPIH = new Stock("PIH",13.1f,12.5f,new Date());
//		stockPIH.symbol("PIH");
//		stockPIH.ask(13.1);
//		stockPIH.bid(12.5);
//		stockPIH.date();
		
		Stock stockAAL = new Stock("AAL",5.78f,5.5f,new Date());
//		stockAAL.symbol("AAL");
//		stockAAL.ask(5.78);
//		stockAAL.bid(5.5);
//		stockAAL.date();
//		
		Stock stockCAAS = new Stock("CAAS",32.2f,31.5f,new Date());
//		stockCAAS.symbol("CAAS");
//		stockCAAS.ask(32.2);
//		stockCAAS.bid(31.5);
//		stockCAAS.date();
//		
		String stocksPrinting = stockPIH.getHtmlDescription()+"<br>"
				+stockAAL.getHtmlDescription()+"<br>"
				+stockCAAS.getHtmlDescription();
				
		resp.getWriter().println(stocksPrinting);

}
	
	
}