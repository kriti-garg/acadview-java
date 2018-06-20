import java.util.Scanner;
class Leap{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year,result;
		System.out.println("Enter the year");
		year = sc.nextInt();
		result = isLeap(year);
		if(result==1)
			System.out.println("Yes,a Leap Year");
		else
			System.out.println("No,not a Leap Year");
     }
     public static int isLeap(int year)
     {
     	if(year%400==0)
     		return 1;
     	else if(year%100==0)
     		return 0;
     	else if(year%4==0)
     		return 1;
     	else 
     		return 0;
     }
}