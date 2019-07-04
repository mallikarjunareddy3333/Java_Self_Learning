package com.arjun.java.thread;

class MyTheread11 extends Thread {
	@Override
	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("i am lazy Thread :" + i);
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			System.out.println("i got interrupted");
		}
	}
}

public class ThreadInterruptDemo {

	public static void main(String[] args) {
		MyTheread11 t = new MyTheread11();
		t.start();
		t.interrupt();
		
		System.out.println("end of main thread");		
	}

}
