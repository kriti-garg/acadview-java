import java.util.Scanner;
class Armstrong{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num,count=0,rem,orinum,n,sum=0;
		System.out.println("Enter a number");
		num = sc.nextInt();
		orinum = num;
		for(;num>0;num/=10)
		{
			count++;
        }
       // System.out.println(count);
        n = orinum;

        for(;n>0;n/=10)
        {
        	rem = n%10;
            sum = (int) (sum + Math.pow(rem,count));
        }
        if(sum==orinum)
        	System.out.println(orinum + " is armstrong");
        else
        	System.out.println(orinum + " is not armstrong");
	}
}