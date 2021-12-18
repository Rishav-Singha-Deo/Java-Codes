import java.util.Scanner;
public class PerfectCreation
{
    public static void main(String[]args) 
    {
        int n,sum=0;
        Scanner s=new Scanner(System.in);
        System.out.println("PERFECT NUMBER");
        for(int i=1;i<300;i++)
        {
            for(int j=1;j<i;j++)
            {
                if(i%j==0)
                {
                    sum=sum+j;
                }
            }
            if(sum==i)
                System.out.println(i);  
        }
    }

    int divisor(int x)
    {
        return x;
    }
}