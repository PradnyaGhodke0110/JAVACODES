import java.util.Scanner;
public class CalculatePercentage 
{
        public static void main(String args[])
            {
   
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter 5 subjects marks out of hundred:");
               
                double a=sc.nextDouble();
                double b=sc.nextDouble();
                double c=sc.nextDouble();
                double d=sc.nextDouble();
                double e=sc.nextDouble();
               //double per=((a+b+c+d+e)/500)*100;
                //float total=percentage*100;
                System.out.println("enter total marks");
                double tm=sc.nextDouble();
                double per=((a+b+c+d+e)/tm)*100;
                System.out.println(per);

 

            }
    
}
