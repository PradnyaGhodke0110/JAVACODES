import java.util.*;
public class Reverseno 
{
    public static void main(String args[])
    {
        int i,n,r,sum=0;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no");
        n=sc.nextInt();
        while(n!=0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;

        }
        System.out.println("Reversse no="+sum);
    }
    
}

