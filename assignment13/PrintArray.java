import java.util.*;
public class PrintArray {
	public static <E> void  print(E[] arrType){
		for(E num : arrType) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Integer[] integerArr = {1,2,3,4,5};
		Double[] doubleArr = {1.2,1.23,3.6,7.8,8.8};
		Character[] charArr = {'K','R','I','T','I',' ','G','A','R','G'};
		System.out.println("integerArr  : ");
		print(integerArr);
		System.out.println("doubleArr  : ");
		print(doubleArr);
		System.out.println("characterArr : ");
		print(charArr);
		
	}

}
