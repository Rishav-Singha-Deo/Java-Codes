import java.util.*;
class Fibonacci
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int f1=0,f2=1,f3=1;
        System.out.print("Enter the no.of terms : ");
        int n=sc.nextInt();
        for(int i=0;i<=n;i++)
        {
            System.out.println(f3);
            f3=f1+f2;
            f1=f2;
            f2=f3;
        }
    }
}