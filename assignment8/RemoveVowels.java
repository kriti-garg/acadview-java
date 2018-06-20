import java.util.Scanner;
public class RemoveVowels{
	Scanner sc = new Scanner(System.in);
void noVowels(){
	System.out.println("enter the string");
	String str = sc.nextLine();
	for(int i=0;i<str.length();i++){
		if(str.charAt(i)=='a' || str.charAt(i)=='e'|| str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'||str.charAt(i)=='A' || str.charAt(i)=='E'|| str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U'){

		}
		else
			System.out.print(str.charAt(i));
	}
}
    public static void main(String[] args) {
		RemoveVowels obj = new RemoveVowels();
		obj.noVowels();
	}
}