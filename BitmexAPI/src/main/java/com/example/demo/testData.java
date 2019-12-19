package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class testData {
	private String name;
	private String version;
	private long timeStamp;
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setVersion(String version){
		this.version = version;
	}
	
	public String getVersion() {
		return this.version;
	}
	
	public void setTimeStamp(long timeStamp){
		this.timeStamp = timeStamp;
	}
	
	public long getTimeStamp() {
		return this.timeStamp;
	}
}
