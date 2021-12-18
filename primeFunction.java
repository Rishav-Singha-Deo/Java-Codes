import java.util.*;
class primeFunction
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a=sc.nextInt();
        if(isprime(a)==1)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }

    int isprime(int x)
    {
        for(int i=2;i<=(x/2);i++)
            if(x%i==0)
                return 0;
        return 1;
    }
}