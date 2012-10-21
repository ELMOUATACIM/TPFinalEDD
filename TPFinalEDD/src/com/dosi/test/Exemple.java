package com.dosi.test;

import java.io.File;

import com.dosi.parser.FileParser;
import com.dosi.parser.Implementation;

public class Exemple {

	
	public Exemple() {
	
		
	FileParser.parse(new File("/home/kaouthar/kikou"), new Implementation());
	}
	
	
	public static void main(String[] args) {
		new Exemple();
	}

}
