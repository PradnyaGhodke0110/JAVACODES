
import java.util.*;
public class Factorial
{
    public static void main(String args[])
    {
        int n,i,f=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            f=f*i;
            
        }
        System.out.println(f);
    }
}