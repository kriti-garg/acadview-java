import java.util.*;
public class sidpat1{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n;
		n=s.nextInt();
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++)
				System.out.print("*");
			System.out.println();
		}
	}
}
