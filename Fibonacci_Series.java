import java.util.*;
class Fibonacci_Series
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,f1=0,f2=1,f3=1;
        System.out.print("Enter the number of terms : ");
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.println(f3);
            f3=f2+f1;
            f1=f2;
            f2=f3;
        }
    }
}