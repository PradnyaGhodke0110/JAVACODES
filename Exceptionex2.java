
import java.util.*;
import java.lang.*;

public class Exceptionex2
{
    public static void main(String args[])
    {
        try
        {
            int a,b,res;
            System.out.println("enter two integers");
            Scanner sc=new Scanner(System.in);
            a=sc.nextInt();
            b=sc.nextInt();
            res=a/b;
                
                
            throw new ArithmeticException("divide by zero");
                

            }
        catch(ArithmeticException ae)
        {
            System.out.println("Division by zero error");
            //System.out.println(ae.getMessage());
        }
    }
    
}
