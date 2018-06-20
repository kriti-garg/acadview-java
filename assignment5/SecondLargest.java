import java.util.Scanner;
class SecondLargest{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=0;
		//int a[]={0,0,0,0,0,0,0,0,0,0};
		int a[] = new int[10];
		System.out.println("Enter the numbers in the array:");
		for(i=0;i<10;i++){
          a[i] = sc.nextInt();
		}
		for(int index=0;index<10;index++){
			for(int j=index+1;j<10;j++){
				if(a[j]<a[index]){
					int temp;
					temp = a[j];
					a[j]=a[index];
					a[index]= temp;
				}
			}
		}
		System.out.println("Second Largest number in the array is : " + a[8]);
	}
}