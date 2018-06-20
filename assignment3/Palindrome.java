import java.util.Scanner;
class Palindrome{
	public static void main(String[] args) {
			int num,result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number whose reverse you want");
		num=sc.nextInt();
		result=isReverse(num);
		if(result==1)
		System.out.println("Yes it is Palindrome");
	else
		System.out.println("No it is not a Palindrome");
	}
	public static int isReverse(int num)
	{
        int result=0,rem,originalnum;
        originalnum=num;
        for(;num>0;num/=10)
        {
        	rem=num%10;
        	result= result*10+rem;
        }
        if(result==originalnum)
        	result=1;
        return result;
	}
	
}