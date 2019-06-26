package com.arjun.java.thread;

public class MyThread extends Thread {

	public void run() {
		System.out.println("run method");
	}

	public void run(int i) {
		System.out.println("int arg method");
	}
	
	@Override
	public synchronized void start() {
		super.start();
		System.out.println("start method");
	}

	public static void main(String[] args) {
		MyThread t = new MyThread(); // Instantiation of a Thread
		t.start(); // starting of a Thread

		System.out.println("main method");
		//t.start(); Exception in thread "main" java.lang.IllegalThreadStateException
	}

}
