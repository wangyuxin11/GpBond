package com.gpbond.stock.common.model;

import java.math.BigDecimal;


public class Stock {
	
	
	public int code;  //代码
	
	public String name; //名称
	
	
	public BigDecimal priceNow;   //当前价
	
	public BigDecimal priceLow;   //最低价
	
	public BigDecimal priceHigh;  //最高价
	
	public BigDecimal priceOpen;  //开盘价
	
	public BigDecimal priceClose; //昨收价
	
	public BigDecimal priceDiff;  //差价（= priceNow - priceOpen）
	
	public BigDecimal priceAvg;  //均价
	
	 
	public Long dealCount; //成交量
	
	public BigDecimal dealPriceTotal;  //成交额
	
	
	public int turnoverRate; //换手率
	
	public int amplitude; //振幅
	
	
	private String time; 
	

}
