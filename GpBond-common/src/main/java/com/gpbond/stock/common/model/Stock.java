package com.gpbond.stock.common.model;

import java.math.BigDecimal;


public class Stock {
	
	
	public int code;  //����
	
	public String name; //����
	
	
	public BigDecimal priceNow;   //��ǰ��
	
	public BigDecimal priceLow;   //��ͼ�
	
	public BigDecimal priceHigh;  //��߼�
	
	public BigDecimal priceOpen;  //���̼�
	
	public BigDecimal priceClose; //���ռ�
	
	public BigDecimal priceDiff;  //��ۣ�= priceNow - priceOpen��
	
	public BigDecimal priceAvg;  //����
	
	 
	public Long dealCount; //�ɽ���
	
	public BigDecimal dealPriceTotal;  //�ɽ���
	
	
	public int turnoverRate; //������
	
	public int amplitude; //���
	
	
	private String time; 
	

}
