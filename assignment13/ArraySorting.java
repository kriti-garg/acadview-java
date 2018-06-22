import java.util.*;
public class ArraySorting {

	public <E> void sort (E arr[]) {
		Arrays.sort(arr);
		for(int i =0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements in integer array");
		int sizeInt = sc.nextInt();
		Integer [] integerArr = new Integer[sizeInt];
		System.out.println("Enter elements in integer array");
		for(int i =0 ; i < sizeInt ; i++) {
			integerArr[i] = sc.nextInt();
		}
		ArraySorting obj = new ArraySorting();
		obj.sort(integerArr);
		System.out.println();
		System.out.println("Enter number of elements in the double array");
		int sizeDouble = sc.nextInt();
		Double doubleArr[] = new Double[sizeDouble];
		System.out.println("Enter elements in double array");
		for(int i = 0 ; i < sizeDouble ; i++) {
			doubleArr[i] = sc.nextDouble();
		}
		obj.sort(doubleArr);
	}

}