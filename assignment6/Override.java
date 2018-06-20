class Animal{
	public String breed,colour;
	void speak(){
		System.out.println("Animal");
	}
}
class Dog extends Animal{
	void speak(){
		System.out.println("bhao bhao");
	}
}
class Cat extends Animal{
	void speak(){
		System.out.println("meow meow");
	}
}
public class Override{
	public static void main(String[] args) {
		Animal obj = new Animal();
		Dog obj1 = new Dog();
		Cat obj2 = new Cat();
		obj.speak();
		obj1.speak();
        obj2.speak();
    }
}