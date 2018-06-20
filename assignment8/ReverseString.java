import java.util.Scanner;
class function{
	Scanner sc = new Scanner(System.in);
	String str2 = "";
String reverse(){
	System.out.println("enter the string whose reverse you want to print");
	String str = sc.nextLine();
    for(int i = str.length()-1;i>=0;i--){
    	str2 = str2 + str.charAt(i);
    }
    return (str2);
}
}
public class ReverseString{
	public static void main(String[] args) {
		function r = new function();
		String str = r.reverse();
		System.out.println(str);
	}
}