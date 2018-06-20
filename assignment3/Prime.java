import java.util.Scanner;
class Prime{
	public static void main(String[] args) {
		int num,result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number you want to check");
        num=sc.nextInt();
        result = isPrime(num);
        if(result == 1)
        	System.out.println("Yes "+num+" is Prime");
        else
        	System.out.println(num+" is not Prime");
	}
	public static int isPrime(int num){
		int result=1;
        for(int i=2;i<=num/2;i++)
        {
        	if(num%i==0)
        		{
        			result=0;
                    break;
        		}
        }
        return result;
	}
}