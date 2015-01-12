package com.myorg.javacourse;

import java.util.Date;

public class Stock {
	
	private String symbol;
	private float ask, bid;
	private Date date;

	public Stock(String inSymbol, float ask, float bid, Date date){
		this.symbol = inSymbol;
		this.ask = ask;
		this.bid = bid;
		this.date = java.sql.Date.valueOf("2014-11-15");
	}	
	 
	
	public String getSymbol() {
		return symbol;
	}


	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}


	public float getAsk() {
		return ask;
	}


	public void setAsk(float ask) {
		this.ask = ask;
	}


	public float getBid() {
		return bid;
	}


	public void setBid(float bid) {
		this.bid = bid;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}
	
	public String getHtmlDescription(){
		String stockHtmlDetailsString = "<b>Stock symbol</b>: "+getSymbol()+", "+"<b>Bid</b>: "+getBid()+", "+"<b>Ask</b>: "+getAsk()+", "+"<b>Date</b>: "+getDate();
		return stockHtmlDetailsString;
	}
	

		
			
}



