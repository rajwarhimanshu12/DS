package com.ds.misc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadWriteFileAndCount {

	public static void wordbyword() throws IOException {
		FileReader fr = new FileReader("C:\\prod\\DS\\TextFile.txt");
		BufferedReader br = new BufferedReader(fr);
		String s;
		String[] words;
		while((s=(br.readLine()))!= null){
			words = s.split(" ");
			for(String word : words) {
				System.out.println(word);
			}
		} 
	}

	public static void charcaterbycharcter() throws IOException {
      FileInputStream fis = new FileInputStream("C:\\prod\\DS\\TextFile.txt");
      int i = 0;
       while((i = fis.read())!=-1) {
      System.out.println((char)i);
      }
      fis.close();  
	}

	public static void linebyline() throws FileNotFoundException {
		File file = new File("C:\\prod\\DS\\TextFile.txt");
		Scanner sc = new Scanner(file);
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		sc.close();
	}
	
	private static void writedata() throws IOException {
		File file = new File("writedatafile.txt");
		String data = "This is test data";
		try {
			FileOutputStream fos = new FileOutputStream(file);
			fos.write(data.getBytes());
			System.out.println("DATA IS WRITTEN");
			fos.close();
		} catch (FileNotFoundException e) {
			System.out.println("DATA IS NOT WRITTEN");
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) throws Exception {
		//wordbyword();
		//linebyline();
		charcaterbycharcter();
		//writedata();

		/*
		 * File file = new File("C:\\prod\\DS\\TextFile.txt");
		 * 
		 * BufferedReader br = new BufferedReader(new FileReader(file)); String st = "";
		 * while((st = br.readLine())!= null) { System.out.println(st); }
		 */

		/*
		 * File file = new File("C:\\prod\\DS\\TextFile.txt"); Scanner sc = new
		 * Scanner(file);
		 * 
		 * 
		 * 
		 * 
		 */

	}

}
