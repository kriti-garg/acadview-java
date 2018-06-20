import java.util.Scanner;
public class CountWords{
	int count=0,i=0;
	Scanner sc = new Scanner(System.in);
    void count(){
    	System.out.println("enter the string");
    	String str = sc.nextLine();
    	while(i<str.length()){
    		if(str.charAt(i)==' '){
    			count++;
    		}
    			i++;
    	}
    	System.out.println("Total words are " + (count+1));
    }
	public static void main(String[] args) {
		CountWords obj = new CountWords();
		obj.count();
	}
}