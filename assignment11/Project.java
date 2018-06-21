import java.util.*;
import java.io.*;
public class Project {
	public static void listf(String directoryName, List<File> files,List<String> fileName){
	    File directory = new File(directoryName);
	    File[] fList = directory.listFiles();
	    for (File file : fList) {
	        if (file.isFile()) {
	            files.add(file);
	             String s =  file.getName().toString();
	             fileName.add(s);
	        } else if (file.isDirectory()) {
	            listf(file.getAbsolutePath(), files,fileName);
	        }
	    }
	}
   public static void main(String[] args) throws IOException{
	  /* Scanner sc = new Scanner(System.in);
	   String str1,str2;
	   System.out.println("enter the path where you want to search the files");
	   str1 = sc.nextLine();
	   System.out.println("enter the path where you want to store the content");
	   str2 = sc.nextLine();*/
       File f1 = new File("//home//kriti//Desktop//java_assignments//assignment11//abc.txt");
   	   FileReader fin = new FileReader(f1);
       BufferedReader bin = new BufferedReader(fin);
       String str1,str2;
       str1 = bin.readLine();
       str2= bin.readLine();
       System.out.println(str1);
       System.out.println(str2);
       List<File> list = new ArrayList<File>();
	    List<String> listFile = new ArrayList<String>();
	    listf(str1,list,listFile);
	    int i = list.size();
	    File outputFile = new File(str2+"/Project.csv");
		outputFile.createNewFile();
	   FileWriter inputFile = new FileWriter(outputFile);
	    inputFile.write("FILENAME , FILEPATH\n");
	    for(int j=0;j<i;j++) {
	    	 inputFile.write(listFile.get(j));
	    	 inputFile.write(",");
	    	inputFile.write(list.get(j).toString() + "\n");
	    }
	    inputFile.close();
	}
}
