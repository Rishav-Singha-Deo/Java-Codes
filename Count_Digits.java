import java.util.*;
class Count_Digits
{
    int count(int n)
    {
        if(n==0)
            return 0;
        else
            return (1+count(n/10));
    }

    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();
        int result=count(a);
        System.out.println(result);
    }
}