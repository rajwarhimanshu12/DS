package com.ds.misc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileAndCount {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("C:\\prod\\DS\\TextFile.txt");
		int i;
		String word  = "";
		String[] wordArray = new String[200];
		while((i=fis.read())!=-1) {
            word = word + (char)i;
			if((char)i==' ') {
				wordArray[i] = word;
				i++;
			}
		}
		fis.close();
		
		for(String s: wordArray) {
			System.out.println(s);
		}
			
	
	/*	 File file = new File("C:\\prod\\DS\\TextFile.txt"); 
		  
		  BufferedReader br = new BufferedReader(new FileReader(file));
		  String st = "";
		  while((st = br.readLine())!= null) {
			  System.out.println(st);
		  }
	*/
	
	}
	 
	  

}
