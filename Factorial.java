import java.util.*;
class Factorial
{
    int compute(int n)
    {
        if(n==1)
            return 1;
        else
            return (n*compute(n-1));
    }

    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();
        int result=compute(a);
        System.out.println(result);
    }
}