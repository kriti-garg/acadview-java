import java.util.Scanner;
class Complex{
	int real;
	int imag;
	public void Display(){
		int r,i;
		r = this.real;
		i = this.imag;
		System.out.println(r+" + " + i +"i");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Complex comp = new Complex();
		System.out.println("Enter the real part");
		comp.real = sc.nextInt();
		System.out.println("Enter the imaginery part");
		comp.imag = sc.nextInt();
		comp.Display();
	}
}