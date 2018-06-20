import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class Files {

    public static void main(String[] args) throws IOException{
    File file = new File("//home//kriti//Desktop//javaprogram//xyz.txt");
    FileReader in = null;
    try {
        in=new FileReader(file);
      int ch;
      while((ch=in.read())!=-1) {
           System.out.print((char)ch);
           }
    }
    catch(Exception e) {
        System.out.println("wrong");
    }
      finally {
       if(in!=null)
       in.close();
       }
    }
}