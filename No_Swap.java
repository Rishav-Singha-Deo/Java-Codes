import java.util.*;
class No_Swap
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.print("Enter 1st number : ");
        a=sc.nextInt();
        System.out.print("Enter 2nd number : ");
        b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Now,\n The 1st number is "+a+" and the second number is "+b);
    }
}