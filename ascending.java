import java.util.*;
public class ascending
 {

 public static void main(String args[])
    {
        int i,t,j,n;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the no.of elements");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the array elements");
        for(i=0;i<n;i++)
        {
        a[i]=sc.nextInt();
        }

        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
    
            
            }
        }
        System.out.println("Array Elements are:");
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}