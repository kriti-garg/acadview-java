import java.util.Scanner;
 class Greatest{
 	void maximum(){
	Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first String");
		String s1 = sc.next();
		System.out.println("Enter the second String");
		String s2 = sc.next();
		int i1 = Integer.parseInt(s1);
		int i2 = Integer.parseInt(s2);
			if(i1>i2)
			System.out.println("Greatest is : " + i1);
		else
			System.out.println("Gratest is : " + i2);
	}
}
public class MaximumStrings{
	public static void main(String[] args) {
		Greatest max = new Greatest();
		max.maximum();
	}
} 
