import java.util.*;
public class HashMaps {
	public void getFunction() {
		HashMap<Integer,String> obj = new HashMap<Integer,String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the five String Elements");
		String str;
		for(int i=0;i<5;i++)
		{
		    str = sc.nextLine();
			obj.put(i,str);
		}
		for(Map.Entry entry : obj.entrySet()) {
			System.out.println(entry.getKey() + "---->" + entry.getValue());
		}
	}
	public static void main(String[] args) {
		HashMaps hm = new HashMaps();
		hm.getFunction();
		
	}

}
