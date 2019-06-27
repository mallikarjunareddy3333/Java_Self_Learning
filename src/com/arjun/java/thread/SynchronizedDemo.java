package com.arjun.java.thread;

class Display {
	public static synchronized void wish(String name) {
		for (int i = 0; i < 5; i++) {
			System.out.println("good morning:" + name);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			}
		}
	}
}

class MyCustomThread extends Thread {
	//Display d;
	String name;

	public MyCustomThread(Display d, String name) {
		//this.d = d;
		this.name = name;
	}

	public void run() {
		//d.wish(name);
		Display.wish(name);
	}
}

public class SynchronizedDemo {
	public static void main(String[] args) {
		//Display d = new Display();
		
		Display d1 = new Display();
		Display d2 = new Display();

		MyCustomThread t1 = new MyCustomThread(d1, "Arjun");
		MyCustomThread t2 = new MyCustomThread(d2, "God");

		t1.start();
		t2.start();
	}
}
