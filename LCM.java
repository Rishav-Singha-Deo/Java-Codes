import java.util.*;
class LCM extends Calculate
{
    int H,L;
    void find_LCM()
    {
        int a=n1,b=n2,c;
        while(b!=0)
        {
            c=b;
            b=a%b;
            a=c;
        }
        H=a;
        L=(n1*n2)/H;
    }

    void display()
    {
        System.out.println("The LCM="+L);
    }

    void test()
    {
        accept();
        find_LCM();
        display();
    }
}