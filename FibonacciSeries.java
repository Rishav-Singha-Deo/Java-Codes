import java.util.*;
class FibonacciSeries
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no.of terms : ");
        int n=sc.nextInt();
        int f[]=new int[n];
        f[0]=1;
        f[1]=1;
        for(int i=2;i<n;i++)
        {
            f[i]=f[i-1]+f[i-2];
        }
        System.out.println("The Fibonacci series");
        for(int j=0;j<n;j++)
        {
            System.out.println(f[j]);
        }
    }
}