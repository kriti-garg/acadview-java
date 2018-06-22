import java.util.*;
class CompareName implements Comparator<Employee>{
     
     public int compare(Employee o1, Employee o2) {
	 return o1.name.compareTo(o2.name);
    }
}
class CompareAge implements Comparator<Employee>{

	
	public int compare(Employee o1, Employee o2) {
		    if(o1.age > o2.age)
	            return 1;
            else if(o1.age == o2.age)
	            return 0;
	        else
	          return -1;
	}
}
 
public class Employee{
 
    public String name;
    public int age;
     
     public Employee(String name,int age ){
         this.name=name;
        
         this.age=age;
     }
      
    /* public String getName(){
            return name;
          }
    
          public int getAge(){
            return age;
          }  */

public static void main(String arg[]){
 
    List<Employee> myList = new ArrayList<Employee>();
        myList.add(new Employee("Kamal",45));
        myList.add(new Employee("Arnav",16));
        myList.add(new Employee("Kriti",19));
        myList.add(new Employee("Poonam",32));
 
 System.out.println("Sorting by name: \n");
 CompareName cn = new CompareName();
 Collections.sort(myList,cn);
 for (Employee obj1 : myList) {
     System.out.println(obj1.name+" "+obj1.age);
 }
 
 System.out.println("\nSorting By Age : \n");
 CompareAge ca = new CompareAge();
 Collections.sort(myList,ca);
 for (Employee obj2 : myList) {
 System.out.println(obj2.name+" "+obj2.age);

}
}
}