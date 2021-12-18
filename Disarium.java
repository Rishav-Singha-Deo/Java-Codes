import java.util.*;
class Disarium//e.g 135
{
    int num,size,s=0;
    Disarium(int nn)
    {
        num=nn;
        size=0;
    }

    void countDigits()
    {
        int copy=num,c=0;
        while(copy>0)
        {
            c++;
            copy=copy/10;
        }
        size=c;
    }

    int sumOfDigits(int n,int p)
    {
        if(p==0)
            return s;
        else
        {
            int d=n%10;
            s=s+(int)Math.pow(d,p);
            return sumOfDigits(n/10,p-1);
        }
    }

    void check()
    {
        countDigits();
        if(num==sumOfDigits(num,size))
            System.out.println("Disarium number");
        else
            System.out.println("Not Disarium number");
    }

    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int x=sc.nextInt();
        Disarium obj=new Disarium(x);
        obj.check();
    }
}