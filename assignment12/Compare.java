import java.util.*;
public class Compare {
	public void fun() {
		HashSet<Integer> obj1 = new HashSet<Integer>();
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		System.out.println("Enter the integer values for first set");
		for(int i=0;i<5;i++) {
			num1 = sc.nextInt();
			obj1.add(num1);
		}
		HashSet<Integer> obj2 = new HashSet<Integer>();
		System.out.println("Enter the integer values for second set");
		for(int i=0;i<5;i++) {
			num2 = sc.nextInt();
			obj2.add(num2);
		}
		System.out.println("First HashSet is : " + obj1);
		System.out.println("Second HashSet is : " + obj2);
		obj1.retainAll(obj2);
		System.out.println("Retained HashSet is : " + obj1);
		
		
		
	}
	public static void main(String[] args) {
		Compare c = new Compare();
		c.fun();
	
	}

}
