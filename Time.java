import java.util.*;
class Time
{
    int h,m;
    Time()
    {
        h=0;
        m=0;
    }

    void getTime(int hh,int mm)
    {
        h=hh;
        m=mm;
    }

    void sumTime(Time t1,Time t2)
    {
        int h=t1.h+t2.h;
        int m=t1.m+t2.m;
        if(m>59)
        {
            h=h+1;
            m=m-60;
        }
        System.out.println("The sum is "+h+" hours and "+m+" minutes");
    }

    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("For Time 1");
        System.out.print("Enter the hours : ");
        int a=sc.nextInt();
        System.out.print("Enter the minutes : ");
        int b=sc.nextInt();
        System.out.println("For Time 2");
        System.out.print("Enter the hours : ");
        int c=sc.nextInt();
        System.out.print("Enter the minutes : ");
        int d=sc.nextInt();
        Time T1=new Time();
        Time T2=new Time();
        Time T=new Time();
        T1.getTime(a,b);
        T2.getTime(c,d);
        T.sumTime(T1,T2);
    }
}