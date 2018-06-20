import java.util.Scanner;
class ArrayWaveform{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int a[]={0,0,0,0,0,0,0,0,0,0};
		int a[] = new int[10];
		System.out.println("Enter the numbers in the array:");
		for(int i=0;i<10;i++){
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
		for(int i=0;i<10;i+=2){
			    int temp;
                temp = a[i];
                a[i] =a[i+1];
                a[i+1] = temp;
			}
			System.out.println("new array: ");
		for(int i=0;i<10;i++){
			System.out.print(a[i] + " ");
		}
	}
}