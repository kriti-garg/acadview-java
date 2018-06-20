import java.util.Scanner;
class prime_uptoN{
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	int num,result=1;
	System.out.println("Enter the number upto which you want to display the prime numbers");
	num = sc.nextInt();
	for(int i=2;i<=num;i++)
	{
		result =1;

	for(int j=2;j<=i/2;j++){
		if(i%j==0)
		{
			result = 0;
			break;
		}
	}
    if(result==1)
	{
		System.out.print(i+" ");
	}
}
	}
	
}