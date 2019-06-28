package arjun.prgms.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable {
	
	int a = 10;
	int b = 20;
	
}

public class SerializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileOutputStream fos = new FileOutputStream("dog.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Dog d = new Dog();
		oos.writeObject(d);
		
		FileInputStream fis = new FileInputStream("dog.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d2 = (Dog) ois.readObject();
		
		System.out.println(d.a == d2.a);
		System.out.println(d.b == d2.b);
	}

}
