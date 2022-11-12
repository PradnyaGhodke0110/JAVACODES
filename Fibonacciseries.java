public class Fibonacciseries 
{
    public static void main(String args[])
    {
        int f1=0,f2=1,i,count=10;
        System.out.println(f1+"\n"+f2);
                for(i=0;i<count;i++){
        int f3=f1+f2;
        System.out.println(f3);
        f1=f2;
        f2=f3;
        
        }

    }
    
}
