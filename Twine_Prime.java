import java.util.*;
class Twine_Prime
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the lower and the upper limits");
        int low=sc.nextInt();
        int upp=sc.nextInt();
        for(int i=low;i<=upp;i++)
        {
            if((i+2)<=upp)
            {
                if(prime(i)==true && prime(i+2)==true)
                    System.out.println("The twine primes are "+i+" and "+(i+2)+".");
            }
        }
    }

 

    boolean prime(int a)
    {
        int j,c=0;
        for(j=1;j<=a;j++)
        {
            if(a%j==0)
                c++;
        }
        if(c==2)
            return true;
        else
            return false;
    }

}