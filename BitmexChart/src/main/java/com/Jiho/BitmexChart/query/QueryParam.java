package com.Jiho.BitmexChart.query;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

enum BinSize {
	ONEMINUTE,
	FIVEMINUTE,
	FIFTEENMINUTE,
	ONEHOUR,
	FOURHOUR,
	ONEDAY,	
};

enum Symbol {
	XBT_PERPETUAL,
	ETH_PERPETUAL,
};

public class QueryParam {
	
	boolean partial;	
	LocalDateTime starttime;	
	LocalDateTime endtime;
	BinSize size;
	Symbol symbol;
	
	public QueryParam(BinSize bin, Symbol symbol, LocalDateTime startTime, LocalDateTime endTime) {
		
	}
	
	
}
