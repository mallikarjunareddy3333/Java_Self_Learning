package com.arjun.java.innerclasses;

interface EmailServer {
	
	public void sendEmail(EmailDetails e);

	class EmailDetails {
		String from;
		String to;
		String subject;
	}
}

public class ClassInsideInterface {

	public static void main(String[] args) {
		
	}

}
