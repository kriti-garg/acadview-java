import java.util.Scanner;
public class CheckOccurence{
	Scanner sc = new Scanner(System.in);
	void check(){
		int count =0;
	System.out.println("enter first string");
	String str1 = sc.nextLine();
	System.out.println("enter second string");
	String str2 = sc.nextLine();
	if(str1.contains(str2)){
		count++;
		System.out.println("yes"+count);
	}
	else
		System.out.println("no");
}

	public static void main(String[] args) {
		CheckOccurence obj = new CheckOccurence();
		obj.check();
	}
}