import java.util.Scanner;
class AreaRectangle{
	int length;
	int breadth;
	public int CalculateArea(){
		int l,b;
		l = this.length;
		b = this.breadth;
		return l*b;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AreaRectangle rect = new AreaRectangle();
		System.out.println("Enter the length");
		rect.length = sc.nextInt();
		System.out.println("Enter the breadth");
		rect.breadth = sc.nextInt();
		int area = rect.CalculateArea();
		System.out.println("Area is : " + area );
	}
}