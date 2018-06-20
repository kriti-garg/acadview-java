import java.util.Scanner;
class SortSearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[]={1,4,6,7,8,9,10};
		int first,last,mid,num;
		System.out.println("Enter the number you want to search");
		num = sc.nextInt();
		first = 0;
		last = 6;
		mid=(first+last)/2;
		while(first<=last)
		{
			if(arr[mid]==num){
				System.out.println("Number Found at " + (mid+1));
				break;
			}
			else if(arr[mid]<num){
                first = mid+1;
			}
			else 
				last = mid-1;
			mid = (first + last)/2;
		}
		if(first>last)
			System.out.println("Not found");
	}

}
