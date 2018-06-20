class Test{
	public void print(){
		System.out.println("no arguments passed");
	}
	public void print(int a){
		System.out.println("passed with an int argument: " + a);
	}
	public void print(float b){
		System.out.println("passed with a float argument: " + b);
	}
}
public class Overload{
	public static void main(String[] args) {
		Test obj = new Test();
		float a = 10.24f;
		obj.print();
		obj.print(5);
		obj.print(a);
	}
}