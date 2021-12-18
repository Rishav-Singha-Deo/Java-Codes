import java.util.*;
import java.math.*;
class Bin_Dec
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int ch=1;
        while(ch!=0)
        {
            System.out.println("Press\n1.Binary to Decimal\n2.Decimal to Binary");
            ch=sc.nextInt();
            if(ch==1)
            {
                System.out.print("Enter a binary number : ");
                long n=sc.nextLong();
                System.out.println("Decimal : "+b_d(n));
            }
            else
            {
                System.out.print("Enter a decimal number : ");
                int n=sc.nextInt();
                System.out.println("The Binary : "+d_b(n));
            }
        }
    }

    int b_d(long n)
    {
        int d=0,i=0;
        long c;
        while(n!=0)
        {
            c=n%10;
            n/=10;
            d+=c*pow(2,i);
            i++;
        }
        return d;
    }

    int pow(int a,int b)
    {
        for(int i=1;i<b;i++)
            a=a*a;
        return a;
    }

    long d_b(int n)
    {
        long b=0;
        int c=0,i=1,s=1;
        while(n!=0)
        {
            c=n%2;
            s++;
            n/=2;
            b+=n*i;
            i*=10;
        }
        return b;
    }
}