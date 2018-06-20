import java.io.*;
import java.util.Scanner;

public class DynamicArray {
     int arr[];
     private  int nextIndex;
     public DynamicArray(){
                   arr = new int[5];
                   System.out.println("Stack Implementation");
           }
           public void set(int index, int element) {
                  if (index > nextIndex) {
                    throw new ArrayIndexOutOfBoundsException("Index out of bound");
                   } else if (index == nextIndex) {
                           add(element);
                   } else {
                           arr[index] = element;
                       }
                   }
           
           public boolean isEmpty() {
                   if (size()==0) {
                           return true;
                   } else {
                           return false;
                   }
           }

           public int pop() {
                   if (nextIndex < 1) {
                           return -1;

                   }
                   int value = arr[nextIndex - 1];
                   arr[nextIndex - 1] = 0;
                   nextIndex--;
                   return value;
           }

           public void restructure() {
                   int temp[] = arr;
                   double n1 = 1.5;
                   arr = new int[(int)(arr.length * n1)];
                   for (int i = 0; i < temp.length; i++) {
                           arr[i] = temp[i];
                   }
           }

           public void add(int element) {
                   if (nextIndex == arr.length) {
                           restructure();
                   }
                   arr[nextIndex] = element;
                   nextIndex++;
           }

           public int size() {
                   return nextIndex;
           }

           public int get(int index) {
                   if (index < 0 || index >= nextIndex) {
                           return -1;
                   }
                   return arr[index];
           }

	public static void main(String[] args) throws IOException {
        Scanner sc =  new Scanner(System.in);
		DynamicArray obj=new DynamicArray();
                System.out.println(obj.isEmpty());
                int ans,addElement;
		for(int i=0;i<10;i++)
		{
			addElement = sc.nextInt();
               obj.set(i,addElement);
        }
		System.out.println(obj.size());
		obj.pop();
		System.out.println(obj.size());
                try{
                    int n=obj.get(7);//accessing a[7];
                    if(n==-1)
                        throw new IOException();
                }
                catch(IOException e){
                        System.out.println("Exception Ocurred,Not in Array");
                }		
		System.out.println(obj.isEmpty());
    }
}

