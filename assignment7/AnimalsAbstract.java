abstract class Animals{
	    String colour,breed,name;
		abstract void eat();
		void speak() {
			System.out.println("Speaking");
		}
		}
class Dog extends Animals{
	public void eat() {
		System.out.println("love eating bones");
	}
	public void speak() {
		System.out.println("bhao bhao");
	}
	public void print(String colour , String breed ,String name){
		
		this.colour=colour;
		this.breed = breed;
		this.name = name;
		System.out.println("Colour is :" + colour);
		System.out.println("Breed is :" + breed);
		System.out.println("Name is :" + name);
	}
}
public class AnimalsAbstract{
	public static void main(String[] args){
		Animals a = new Dog();
		Dog d = new Dog();
		a.eat();
		a.speak();
		d.eat();
		d.speak();
		d.print("Black","BullDog","Tommy");
	}
}