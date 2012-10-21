package com.dosi.parser;

public class Implementation implements ContentHandler {

	private int compteur;
	//compteur  des comm 
	private int compt=0;
	
	public Implementation() {
		compteur = 0;
	}
	
	
	@Override
	public void defaultLine(String content) {
		compteur ++;
		
	}

	@Override
	public int getcompt() {
		// TODO Auto-generated method stub
		return compteur;
	}
	
	
	@Override
	public void commentligne(String comment, String format) {
		// TODO Auto-generated method stub
		if (comment.startsWith(format))
			compt++;
	}
		
//methode pour retourner le nombre des lignes commentées
	@Override
	public int getcomptC() {
		// TODO Auto-generated method stub
		return compt;
	}
	
	

}
