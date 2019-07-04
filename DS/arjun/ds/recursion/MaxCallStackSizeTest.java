package arjun.ds.recursion;

public class MaxCallStackSizeTest {
	
	static void computeMaxCallStackSize(int size) throws InterruptedException {
        System.out.println(size + " ");
        //Thread.sleep(50);
        computeMaxCallStackSize(size + 1);
    }
	
	public static void main(String[] args) throws InterruptedException {
		computeMaxCallStackSize(1);
	}

}
