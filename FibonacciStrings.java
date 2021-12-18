import java.util.*;
class FibonacciStrings
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no.of terms : ");
        int n=sc.nextInt();
        String f[]=new String[n];
        f[0]="a";
        f[1]="b";
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