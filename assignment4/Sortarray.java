import java.util.Scanner;
class Sortarray{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = {1,1,1,1,0,0,1,0};
		for(int i=0;i<8;i++)
		{
			for(int j=i+1;j<8;j++)
			{
				if(arr[j]<arr[i])
				{
					int temp;
					temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
				}
			}

		}
		System.out.println("Sorted array is : ");
		for(int i=0;i<8;i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
	
}
