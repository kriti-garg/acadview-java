import java.util.Scanner;
class Reverse{
	public static void main(String[] args) {
		int num,result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number whose reverse you want");
		num=sc.nextInt();
		result=isReverse(num);
		System.out.println("Reverse is "+result);
	}
	public static int isReverse(int num)
	{
        int result=0,rem;
        for(;num>0;num/=10)
        {
        	rem=num%10;
        	result= result*10+rem;
        }
        return result;
	}
}