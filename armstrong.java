import java.util.*;
class armstrong
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        int rev=0,r,temp=0;
        while(n!=0)
        {
            r=n%10;
            rev=0;
            rev=(r*r*r);
            n=n/10;
        }
        if(n==rev)
            System.out.println("Armstrong number");
        else
            System.out.println("Not Armstrong number");
    }
}