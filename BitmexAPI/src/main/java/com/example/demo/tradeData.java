package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class tradeData {
	
	  
		private String timestamp;
	    private String symbol;
	    private String side;
	    private int size;
	    private int price;
	    private String tickDirection;
	    private int grossValue;
	    private int homeNotional;
	    private int foreignNotional;
	    
	    
	    public void setSide(String side){
	    	this.side = side;
	    }
	    
	    public String getSide(){
	    	return this.side;
	    }
	    
	    public void setTimestamp(String timestamp) {
	    	this.timestamp = timestamp;
	    }
	    
	    public String getTimestamp() {
	    	return this.timestamp;
	    }
	    
	    public void setSymbol(String symbol) {
			this.symbol = symbol;
		}
	    
		public String getSymbol() {
			return this.symbol;
		}

		
}
