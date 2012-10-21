package com.dosi.parser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileParser {

	
	
	
	public FileParser() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static void parse(File file,ContentHandler contentHandler){
			
		
		System.out.println("le nom du fichier est :"+file.getName());
		
		try{
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line = "";
		while ((line = br.readLine()) != null) {
			
			contentHandler.defaultLine(line);
			contentHandler.commentligne(line, "#");
			System.out.println(line);
			
		} 
		
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		System.out.println("le fichier "+file.getName()+" contient "+contentHandler.getcompt()+" ligne(s)");
		System.out.println("dont " + contentHandler.getcomptC()+ " de Commentaire(s)");

			}
	
	
	
}
