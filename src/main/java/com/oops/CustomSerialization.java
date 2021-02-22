package com.oops;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class CustomSerialization implements Serializable{
	
	
	public static void main(String args[]) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ois.readObject();
	}

}
