import java.util.*;
//import java.Scanner.*;
class Fact
{
    public static void main(String args[])
    {
        int n,fact=0,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);


    }
}