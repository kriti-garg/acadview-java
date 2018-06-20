import java.util.Scanner;

public class sum{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float num1,num2,result;
		System.out.println("Enter First number");
		num1=sc.nextInt();
		System.out.println("Enter second number");
		num2=sc.nextInt();
        result = add(num1,num2);
        System.out.println(result);
    }
    public static float add(float n1,float n2){
	float res;
	res = n1+n2;
	return res;
}
}
