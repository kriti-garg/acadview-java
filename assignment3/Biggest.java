import java.util.Scanner;
class Biggest{
	public static void main(String[] args) {
		float num1,num2,num3,result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		num1 = sc.nextFloat();
		System.out.println("Enter second number");
		num2 = sc.nextFloat();
		System.out.println("Enter third number");
		num3 = sc.nextFloat();
        result = largest(num1,num2,num3);
        System.out.println("Biggest is "+result);

}
	public static float largest(float num1,float num2,float num3)
	{
		float result;
		result = (num1>num2?(num1>num3?num1:num3):(num2>num3?num2:num3));
		return result;

	}
}