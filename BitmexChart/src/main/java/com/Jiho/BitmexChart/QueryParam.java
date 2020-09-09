package com.Jiho.BitmexChart;

public class QueryParam {
	//Let users able to change the binsize and symbol.
	private boolean partial;
	private String binSize;		//1d
	private String symbol;		//XBT:perpetual
	private String starttime;	//2015-10-14
	private String endtime;
	
	public String toquery() {
		String query = "binSize" + "partial" ;
		return null;
	}

	public String getBinSize() {
		return binSize;
	}

	public void setBinSize(String binSize) {
		this.binSize = binSize;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
}
