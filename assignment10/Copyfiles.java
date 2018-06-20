import java.io.*;
import java.util.InputMismatchException;
public class Copyfiles {
public static void main(String[] args) throws IOException, InputMismatchException {
	File f1 = new File("//home//kriti//Desktop//javaprogram//abc.txt");
	FileReader fr1 = new FileReader(f1);
	BufferedReader br1 = new BufferedReader(fr1);
	File f2 = new File("//home//kriti//Desktop//javaprogram//xyz.txt");
    FileWriter fr2 = new FileWriter(f2);
    BufferedWriter br2 = new BufferedWriter(fr2);
    try {
    	int ch;
    	do {
    	ch = br1.read();
    	if(ch!=-1) {
                br2.write((char)ch);
    		System.out.print((char)ch);
    		}
    	
    }while(ch!=-1);
    }
    catch(Exception e){
    	System.out.println("Error Occured");
    }
    finally {
    	br1.close();
    	br2.close();
    }
}
}
