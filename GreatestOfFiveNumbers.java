import java.util.*;
class GreatestOfFiveNumbers
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,d,e,s;
        System.out.println("Enter five random numbers one-by-one");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        e=sc.nextInt();
        if(a>b)
            s=a;
        else
            s=b;
        if(s<c)
            s=c;
        if(s<d)
            s=d;
        if(s<e)
            s=e;
        System.out.println("The greatest number is "+s);
    }
}