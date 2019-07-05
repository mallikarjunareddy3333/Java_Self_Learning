package com.arjun.java.thread;

class Box {

	private int contents;
	private boolean available = false;

	public synchronized int get() {
		while (available == false) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		available = false;
		notifyAll();
		return contents;
	}

	public synchronized void put(int value) {
		while (available == true) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		contents = value;
		available = true;
		notifyAll();
	}
}

class Consumer extends Thread {
	private Box b;
	private int number;

	public Consumer(Box b, int number) {
		this.b = b;
		this.number = number;
	}

	@Override
	public void run() {
		int value = 0;
		for (int i = 1; i <= 10; i++) {
			value = b.get();
			System.out.println("Consumer #" + this.number + " get: " + value);
		}
	}

}

class Producer extends Thread {
	private Box b;
	private int number;

	public Producer(Box b, int number) {
		this.b = b;
		this.number = number;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			b.put(i);
			System.out.println("Producer #" + this.number + " put: " + i);
			
			try {
				sleep(1000);
			} catch (InterruptedException e) {
			}
			
		}
	}

}

public class ProducerConsumerTest {

	public static void main(String[] args) {
		Box c = new Box();
		Producer p1 = new Producer(c, 1);
		Consumer c1 = new Consumer(c, 1);
		p1.start();
		c1.start();
	}

}
