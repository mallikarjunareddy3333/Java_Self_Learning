package arjun.ds.arrays;

import java.util.Arrays;

public class MyArrayList<T> {

	private Object myStore[];
	private int actSize = 0;

	public MyArrayList() {
		myStore = new Object[10];
	}

	public Object get(int index) {
		if (index < actSize) {
			return myStore[index];
		} else {
			throw new ArrayIndexOutOfBoundsException();
		}
	}

	public void add(T obj) {
		if (myStore.length - actSize <= 5) {
			increaseListSize();
		}
		myStore[actSize++] = obj;
	}

	public Object remove(int index) {
		if (index < actSize) {
			Object obj = myStore[index];
			myStore[index] = null;
			int temp = index;
			while (temp < actSize) {
				myStore[temp] = myStore[temp+1];
				myStore[temp+1] = null;
				temp++;
			}
			actSize--;
			return obj;
		} else {
			throw new ArrayIndexOutOfBoundsException();
		}
	}

	public int size() {
		return actSize;
	}

	private void increaseListSize() {
		myStore = Arrays.copyOf(myStore, myStore.length * 2);
		System.out.println("\nNew length: " + myStore.length);
	}
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("[");
		for (int i = 0; i < actSize-1; i++) {
			str.append(myStore[i] + ", ");
		}
		
		str.append(myStore[actSize-1] + "]");
		
		return str.toString();
	}
	
	public static void main(String[] args) {
		MyArrayList<Integer> list = new MyArrayList<Integer>();
		list.add(1);
		//list.add("name");
		list.add(3);
		System.out.println(list);
		list.remove(1);
		System.out.println(list);
	}

}
