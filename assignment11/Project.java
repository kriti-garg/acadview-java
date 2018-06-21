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
	    //System.out.println("1 2 3");
	}
   public static void main(String[] args) throws IOException{
	    List<File> list = new ArrayList<File>();
	    List<String> listFile = new ArrayList<String>();
	    listf("/home/kriti/Desktop",list,listFile);
	    int i = list.size();
	    for(int j=0;j<i;j++) {
	    	 System.out.print(listFile.get(j));
	    	 System.out.print(" , ");
	    	 System.out.println(list.get(j));
	    }
	   /* for(File str : list) {
	    System.out.println(str);
	    }
	    for(String str : listFile) {
	    	System.out.println(str);
	    }
	    System.out.println(i);*/
	}
}
