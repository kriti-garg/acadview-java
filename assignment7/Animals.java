public interface Animals{
	void speak();
	void eat();
	public static void main(String[] args) {
		Dog d = new Dog();
		Cat c = new Cat();
		d.speak();
		d.eat();
		c.speak();
		c.eat();
	}
}
class Dog implements Animals{
	public void speak(){
		System.out.println("bhao bhao");
	}
	public void eat(){
		System.out.println("bones");
	}

}
class Cat implements Animals{
    public void speak(){
		System.out.println("meow meow");
	}
	public void eat(){
		System.out.println("raw or spoiled meat");
	}
}