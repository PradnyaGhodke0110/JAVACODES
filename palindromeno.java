import java.util.*;
public class palindromeno 
{
    public static void main(String args[])
    {
        int n,i,t,r,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no");
        n=sc.nextInt();
        t=n;
        while(n!=0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;

        }
        if(t==sum)
        {
            System.out.println("no is palindrome"); 
        }
        else
        {
            System.out.println("no is not  palindrome");
        }
        
    }
}    
