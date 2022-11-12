
//    package javaProgram;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
public static void main(String [] args) throws IOException 
{		
try 
{
// Create a FileReader object with file path.	
    FileReader fr = new FileReader("D:\\myfile.txt");
  
    int i;
// Read characters at a time.
    while((i = fr.read()) != -1) // Return type of read() method is int.
   {
       System.out.print((char) i); // Converting int into char.  
    }
 System.out.println(""); 
 fr.close(); // Closing file reader.

} catch (FileNotFoundException e) {
   System.out.println("Error: " +e.getMessage());
  }	 
 }
}
    

