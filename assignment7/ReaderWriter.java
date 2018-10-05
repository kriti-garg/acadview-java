import java.util.*;
import java.io.*;
class ReaderWriter{
	public static void main(String[] args) throws IOException{
		Writer ob = new FileWriter("nidhi.txt",true);
		String s = "ABCDE";
		ob.write(s);
		ob.close();
		
		
	}
	
	
	
}