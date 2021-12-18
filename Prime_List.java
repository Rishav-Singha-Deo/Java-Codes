import java.util.*;
class Prime_List
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the initial point : ");
        int a=sc.nextInt();
        System.out.print("Enter the final point : ");
        int b=sc.nextInt();
        for(int i=a;i<=b;i++)
        {
            int c=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                    c++;
            }
            if(c==2)
                System.out.println(i);
        }
    }
}