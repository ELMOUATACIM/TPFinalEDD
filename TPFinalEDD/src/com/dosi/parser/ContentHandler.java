package com.dosi.parser;

public interface ContentHandler {
	
	void defaultLine(String content);
	int getcompt();
	public void commentligne(String comment,String format);
	int getcomptC();

}
