import java.util.*;
class Divisible_by_7
{public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the arrray");
        int n=sc.nextInt();
        int x[]=new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(x[i]%7==0)
            {
                System.out.println("No. dividible by 7: "+x[i]);
            }
            else
            {
                System.out.println("No. not dividible by 7: "+x[i]);
            }
        }
    }
}