package com.arjun.java.exceptions;

public class CustomExceptionTest {

	public static void main(String[] args) throws PenNotWorkingException {
		if (true) {
			throw new PenNotWorkingException("Bro pen is not working..");
		}		
	}

}
