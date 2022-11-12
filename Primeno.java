import java.util.*;
public class Primeno 
{
    public static void main(String args[])
    {
        int n,i,t=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no");
        n=sc.nextInt();
        for(i=2;i<=n;i++)
        {
            if(n%2==0)
            {
            t=1;
            break;
            }


        
}
    

if(t==1)
{
    System.out.println("No is not prime");
}
else
{
    System.out.println("No is prime");
}
    }
}
