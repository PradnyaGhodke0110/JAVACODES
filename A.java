//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.FileWriter;
import java.io.FileReader;
public class A
 {
    public static void main(String args[])
    {
    
            
            FileReader fr=new FileReader("Documents\\css.txt");
            // fos=new FileOutputStream(fis);
            int i;
            while((i=fr.read())!=-1)
            {
            System.out.println((char)i);
            }
    }
    
    
}
