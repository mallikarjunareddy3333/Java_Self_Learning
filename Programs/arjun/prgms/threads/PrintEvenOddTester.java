package arjun.prgms.threads;

class TaskEvenOdd implements Runnable {

	private int MAX;
	private boolean isEvenNumber;
	private Printer print;

	public TaskEvenOdd(Printer print, int MAX, boolean isEvenNumber) {
		this.print = print;
		this.MAX = MAX;
		this.isEvenNumber = isEvenNumber;
	}

	@Override
	public void run() {

		int number = isEvenNumber == true ? 2 : 1;

		while (number <= MAX) {
			if (isEvenNumber) {
				print.printEven(number);
			} else {
				print.printOdd(number);
			}

			number += 2;
		}

	}
}

class Printer {

	private boolean isOdd = false;

	synchronized void printEven(int number) {

		while (isOdd == false) {
			try {
				wait();
			} catch (InterruptedException e) {

			}
		}

		System.out.println("Even:" + number);
		isOdd = false;
		notifyAll();
	}

	synchronized void printOdd(int number) {
		while (isOdd == true) {
			try {
				wait();
			} catch (InterruptedException e) {
				
			}
		}
		
		System.out.println("Odd:" + number);
		isOdd = true;
		notifyAll();
	}

}

public class PrintEvenOddTester {

	public static void main(String[] args) {
		Printer print = new Printer();
		Thread t1 = new Thread(new TaskEvenOdd(print, 10, false));
		Thread t2 = new Thread(new TaskEvenOdd(print, 10, true));
		t2.start();
		t1.start();		
	}

}
