package com.ds.misc;

class customException extends Exception{
	    customException(String s) {
		super(s);
	}
}



public class CheckCustomException {
	
	public static void ValidatePassword(String s) throws customException {
		if(!s.equals("morganStanley")) {
			throw new customException("Incorrect PassWord");
		}
		else
			System.out.println("Correct Password");
		
	}

	public static void main(String[] args) {
		try {
		ValidatePassword("morganStanley");
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
