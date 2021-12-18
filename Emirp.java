import java.util.*;
class Emirp
{
    int n, rev, f;
    Emirp(int nn)
    {
        int n=nn;
        rev=0;
        f=2;
    }

    int isprime(int num)
    {
        if(num==f)
            return 1;
        else if(num%f==0||num==1)
            return 0;
        else
        {
            f++;
            return(isprime(num));
        }
    }

    void isEmirp()
    {
        int temp=n;
        while(temp>0)
        {
            rev=rev*10+temp%10;
            temp=temp/10;
        }
        int result1=isprime(n);
        f=2;
        int result2=isprime(rev);
        if(result1==1 && result2==1)
            System.out.println(n+" is Emirp");
        else
            System.out.println(n+" is not Emirp");
    }

    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to check for emirp");
        int y=sc.nextInt();
        Emirp obj=new Emirp(y);
        obj.isEmirp();
    }
}