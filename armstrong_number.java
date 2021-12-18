import java.util.*;
class armstrong_number
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int A,a,b,c,d;
        System.out.println("Enter a three didit number. e.g.371");
        A=sc.nextInt();
        a=A%10;
        b=A/10;
        b=b%10;
        c=A/100;
        d=(a*a*a)+(b*b*b)+(c*c*c);
        if(d==A)
            System.out.println("Armstrong number");
        else
            System.out.println("Not armstrong number");
    }
}