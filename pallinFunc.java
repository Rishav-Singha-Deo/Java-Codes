import java.util.*;
class pallinFunc
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n=sc.nextInt();
        if(n==rev(n))
            System.out.println("Pallindrome");
        else
            System.out.println("Not Pallindrome");
    }

    int rev(int x)
    {
        int rev=0;
        while(x!=0)
        {
            rev=(rev*10)+(x%10);
            x=x/10;
        }
        return rev;
    }
}