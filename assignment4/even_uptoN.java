import java.util.Scanner;
class even_uptoN{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number upto which you want to display the even numbers");
		int num,count=0;
		num= sc.nextInt();
        for(int i=2;i<num;i++)
        {
        	if(i%2==0){
        		count++;
        		System.out.println(i);

        	}
        }
	}
}