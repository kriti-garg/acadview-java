import java.util.*;
class Task1 implements Runnable{
	public int i=1,name;
	public synchronized void run() {
		for(i=1;i<=500;i++) {
			System.out.println("Thread " + name +" : " + i);
			try {
				Thread.sleep(100);
			}
			catch(Exception e){
				System.out.println("Something went Wrong");
		    }
		}
	}
}
class Task2 implements Runnable{
	public int i=501,name;
	public void run() {
		for(i=501;i<=1000;i++) {
			System.out.println("Thread " + name +" : " + i);
			try {
				Thread.sleep(100);
			}
			catch(Exception e){
				System.out.println("Something went Wrong");
		    }
		}
	}
}
public class MultiThreading {
	public static void main(String[] args) throws InterruptedException {
		Task1 t1 = new Task1();
		Task2 t2 = new Task2();
		Thread thread1 =new Thread(t1);
		Thread thread2 = new Thread(t2);
		t1.name = 1;
		t2.name = 2;
	    thread1.start();
		thread1.join();
		thread2.start();
		thread2.join();
	}

}
